package Behavior.Chain;

public abstract class LoggerHandler {
    public static final int FATAL=4;
    public static final int ERROR=3;
    public static final int WARN=2;
    public static final int INFO=1;
    public static final int DEBUG=0;

    private int priority;
    private final LoggerHandler nextLogger;

    public LoggerHandler(LoggerHandler nextLogger){
        this.nextLogger=nextLogger;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void logMassage(String massage, int level){
        if(level>=priority){
            printLog(massage);
        }
        if(nextLogger!=null){
            nextLogger.logMassage(massage, level);
        }
    }

    public abstract void printLog(String massage);
}
