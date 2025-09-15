package Singleton.SingletonSolutionLazyInitializationApproach;

import Singleton.LogLevel;

public class Logger {

    private static Logger instance;    // instance

    private LogLevel logLevel;

    private Logger(){}   //no one will be able to make instance from this class   -> singleton

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

    //thread-safe Singleton with double-checked locking
    public static Logger getInstance(){
        if(instance == null){   //make sure that there is no instance to keep the behavior of singleton
            synchronized (Logger.class){   //synchronized -> locking keyword to make sure to lock this while used by a thread to prevent two threads to instaite instance in the same time
                if(instance == null){   //check again after locking that this still null
                    instance = new Logger(); //create an instance
                }
            }
        }

        return instance;    //return the instance.
    }

}
