package ChainOfResponsibilityDesignPattern.Logger;

public abstract class LoggerHandler {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    LoggerHandler nextHandler;

    public LoggerHandler(LoggerHandler nextHandler){
        this.nextHandler = nextHandler;
    }

    public void log(int logLevel, String msg){
        if(nextHandler != null){
            nextHandler.log(logLevel, msg);
        }
    }
}
