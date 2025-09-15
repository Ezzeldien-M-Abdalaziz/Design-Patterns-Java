import Singleton.LogLevel;
import Singleton.NaiveSolution.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger();
        LogLevel logLevel = LogLevel.DEBUG;

        logger.setLogLevel(logLevel);
        logger.logInfo("log info");
    }
}
