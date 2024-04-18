package DesignPattern.Singleton;

public class LoggerMain {
	public static void main(String[] args) {
    	Logger logger = Logger.getInstance();
    	logger.trace("TRACE LOG");
    	logger.debug("DEBUG LOG");
    	logger.info("INFORMATION LOG");
    	logger.error("ERROR LOG");
    	logger.warn("WARNING LOG");
    	
    	Logger log = Logger.getInstance();
    	System.out.println(logger==log);
    }
}
