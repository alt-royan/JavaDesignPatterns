package Behavior.Chain;

import java.io.File;

public class ChainApp {
    public static void main(String[] args) {
        LoggerHandler consolelogger =new ConsoleLogger(null);
        consolelogger.setPriority(0);

        FileLogger filelogger =new FileLogger(consolelogger);
        filelogger.setPriority(1);
        filelogger.setFile(new File("out/fileDemo.txt"));

        LoggerHandler chain =new WindowLogger(filelogger);
        chain.setPriority(2);

        chain.logMassage("log1",0);
        chain.logMassage("log2",1);
        chain.logMassage("log3",2);

    }
}
