package com.dilo.maven.quickstart;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CreateLogFile {
	/**
	 * Using log4j2 library to get mylogs messages.
	 */
	private Logger logger = LogManager.getLogger();

	public void performSomeTask() {
		logger.debug("This is a debug message.");
		logger.info("This is an info message.");
		logger.warn("This is a warn message.");
		logger.error("This is an error message.");
		logger.fatal("This is a fatal message.");
	}
}
