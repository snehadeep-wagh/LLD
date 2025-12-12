package ChainOfResponsibilityDesignPattern.Logger;

public class DebugHandler extends LoggerHandler {
    public DebugHandler(LoggerHandler nextHandler){
        super(nextHandler);
    }

    @Override
    public void log(int logLevel, String msg) {
        if(logLevel == DEBUG){
            System.out.println("DEBUG: " + msg);
        }else{
            super.log(logLevel, msg);
        }
    }
}
