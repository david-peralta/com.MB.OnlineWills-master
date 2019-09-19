package utilities;

import cucumber.api.Scenario;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LogFunctions {
	private static Logger log = Logger.getLogger(LogFunctions.class.getName());
	private static Calendar calendar = Calendar.getInstance();
	private static SimpleDateFormat sdtf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	private static SimpleDateFormat stf = new SimpleDateFormat("HH:mm:ss");
	private static LocalDateTime startTime;
	private static LocalDateTime endTime;

	public static void startLog(Scenario scenario) {
		PropertyConfigurator.configure("config/log4j.properties");
		log.info("==================== TEST - START: " + scenario.getName() + " ====================");
		log.info("Date & Time Start: " + sdtf.format(calendar.getTime()));

		startTime = LocalDateTime.now();

		log.info("");
	}

	public static void endLog(Scenario scenario) {
		log.info("");
		log.info("Date & Time End: " + sdtf.format(calendar.getTime()));

		endTime = LocalDateTime.now();

		long timeElapsedSeconds = ChronoUnit.SECONDS.between(startTime, endTime);
		long timeElapsedMinutes = ChronoUnit.MINUTES.between(startTime, endTime);
		timeElapsedSeconds = timeElapsedSeconds - (timeElapsedMinutes * 60);

		log.info("Time Elapsed: " + timeElapsedMinutes + " minute(s) and " + timeElapsedSeconds + " second(s)");
		log.info("==================== TEST - END: " + scenario.getName() + " ====================" + "\n\n\n");
	}

	public static void info(String message) {
		log.info(stf.format(calendar.getTime()) + " - INFO - " + message);
	}

	public static void warn(String message) {
		log.warn(stf.format(calendar.getTime()) + " - WARN - " + message);
	}

	public static void error(String message) {
		log.error(stf.format(calendar.getTime()) + " - ERROR - " + message);
	}

	public static void fatal(String message) {
		log.fatal(stf.format(calendar.getTime()) + " - FATAL - " + message);
	}

	public static void debug(String message) {
		log.debug(stf.format(calendar.getTime()) + " - DEBUG - " + message);
	}
}