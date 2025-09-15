import Singleton.LogLevel;
import Singleton.SingletonSolutionEagerInitializationApproach.Logger;

public class Main {
    public static void main(String[] args) {
        LogLevel logLevel = LogLevel.DEBUG;



//        Logger logger = new Logger();
//        logger.setLogLevel(logLevel);
//        logger.logInfo("log info");


        Logger logger = Logger.getInstance();
        logger.setLogLevel(logLevel);
        logger.logInfo("Hello World from EagerInitializationApproach");


        Singleton.SingletonSolutionLazyInitializationApproach.Logger logger2 = Singleton.SingletonSolutionLazyInitializationApproach.Logger.getInstance();
        logger2.setLogLevel(logLevel);
        logger2.logInfo("Hello World from Singleton LazyInitializationApproach");



    }
}
