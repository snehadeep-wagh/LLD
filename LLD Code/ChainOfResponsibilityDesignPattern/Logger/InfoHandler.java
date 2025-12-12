package ChainOfResponsibilityDesignPattern.Logger;

public class InfoHandler extends LoggerHandler{
    public InfoHandler(LoggerHandler nextHandler){
        super(nextHandler);
    }

    @Override
    public void log(int logLevel, String msg) {
        if(logLevel == INFO){
            System.out.println("INFO: " + msg);
        }else{
            super.log(logLevel, msg);
        }
    }
}
