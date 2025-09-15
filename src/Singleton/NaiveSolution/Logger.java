package Singleton.NaiveSolution;

import Singleton.LogLevel;

public class Logger {
    private LogLevel logLevel;

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

}
