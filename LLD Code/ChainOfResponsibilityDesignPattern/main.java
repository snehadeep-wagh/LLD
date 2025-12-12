package ChainOfResponsibilityDesignPattern;

import ChainOfResponsibilityDesignPattern.Logger.DebugHandler;
import ChainOfResponsibilityDesignPattern.Logger.ErrorHandler;
import ChainOfResponsibilityDesignPattern.Logger.InfoHandler;
import ChainOfResponsibilityDesignPattern.Logger.LoggerHandler;

public class main {
    public static void main(String args[]){
        LoggerHandler handler = new InfoHandler(new DebugHandler(new ErrorHandler(null)));

        handler.log(LoggerHandler.INFO, "Calling the info logger function.");
        handler.log(LoggerHandler.DEBUG, "Debugging the logger.");
        handler.log(LoggerHandler.ERROR, "Exception occured while running he function.");
    }
}
