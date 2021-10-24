package Behavior.Chain;

import java.io.*;

public class FileLogger extends LoggerHandler{
    private File file;

    public FileLogger(LoggerHandler nextLogger) {
        super(nextLogger);
    }

    public void setFile(File file){
        this.file=file;
    }

    @Override
    public void printLog(String massage) {
        try {
            StringBuilder oldFile =new StringBuilder();
            BufferedReader br =new BufferedReader(new FileReader(file));
            String s;
            while((s=br.readLine())!=null){
                oldFile.append(s).append("\n");
            }
            br.close();
            BufferedWriter bw=new BufferedWriter(new FileWriter(file));
            bw.write(oldFile + massage);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
