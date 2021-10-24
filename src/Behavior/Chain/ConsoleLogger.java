package Behavior.Chain;

public class ConsoleLogger extends LoggerHandler{

    public ConsoleLogger(LoggerHandler nextLogger) {
        super(nextLogger);
    }

    @Override
    public void printLog(String massage) {
        System.out.println(massage);
    }
}
