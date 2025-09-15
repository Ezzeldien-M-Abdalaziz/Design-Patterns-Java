package Singleton.SingletonSolutionEagerInitializationApproach;

import Singleton.LogLevel;

public class Logger {

    private static Logger instance = new Logger();    // insatnce

    private LogLevel logLevel;

    private Logger(){}   //no one will be be able to make insatnce from this class   -> singleton

    public void setLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    public void logDebug(String message) {
        if (logLevel.ordinal() <= LogLevel.DEBUG.ordinal()) {  //ordinal() -> checks if the order of the enum used in the object is <= the order of this current enum
            System.out.println("DEBUG" + ": " + message);
        }
    }


    public void logInfo(String message) {
        if (logLevel.ordinal() <= LogLevel.INFO.ordinal()) {
            System.out.println("INFO" + ": " + message);
        }
    }

    public void logWarn(String message) {
        if (logLevel.ordinal() <= LogLevel.WARN.ordinal()) {
            System.out.println("WARN" + ": " + message);
        }
    }

    public void logError(String message) {
        if (logLevel.ordinal() <= LogLevel.ERROR.ordinal()) {
            System.out.println("ERROR" + ": " + message);
        }
    }

    public static Logger getInstance(){
        return instance;    //return the insatnce made as static above.
    }

}
