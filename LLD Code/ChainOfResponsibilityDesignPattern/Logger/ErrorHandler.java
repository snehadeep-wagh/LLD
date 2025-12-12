package ChainOfResponsibilityDesignPattern.Logger;

public class ErrorHandler extends LoggerHandler {
    public ErrorHandler(LoggerHandler nextHandler){
        super(nextHandler);
    }

    @Override
    public void log(int logLevel, String msg) {
        if(logLevel == ERROR){
            System.out.println("ERROR: " + msg);
        }else{
            super.log(logLevel, msg);
        }
    }
}
