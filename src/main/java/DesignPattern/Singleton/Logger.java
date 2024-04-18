package DesignPattern.Singleton;

public class Logger {
    private static Logger instance;
    
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void trace(String message) {
        String logMessage = "[ TRACE ] : " + message;
        System.out.println(logMessage);
    }
    public void info(String message) {
        String logMessage = "[ INFO ] : " + message;
        System.out.println(logMessage);
    }
    public void debug(String message) {
        String logMessage = "[ DEBUG ] : " + message;
        System.out.println(logMessage);
    }
    public void error(String message) {
        String logMessage = "\u001B[31m"+ "[ ERROR ] : " +"\u001B[0m" + message;
        System.out.println(logMessage);
    }
    public void warn(String message) {
        String logMessage = "[ WARN ] : " + message;
        System.out.println(logMessage);
    }

}



