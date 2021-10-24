package Structure.Decorator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DecoratorApp {
    public static void main(String[] args) throws IOException {
        BufferedReader bf =new BufferedReader(new FileReader("out/startDemo.txt"));
        String l;
        String records = "";
        while((l=bf.readLine())!=null){
            records=records.concat(l).concat("\n");
        }
        bf.close();
        DataSourceDecorator encoded = new CompressionDecorator(new EncryptionDecorator(
                        new FileDataSource("out/fileDemo.txt")));
        encoded.writeData(records);
        DataSource plain = new FileDataSource("out/fileDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(records);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
