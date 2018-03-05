package com.dilo.maven.quickstart;

public class LogAttributesTest {
	private String message;
	private String logger;
	private String timestamp;
	private String loglevel;

	public LogAttributesTest() {
	}

	/**
	 * Log inputs were parsed and thrown into this object.
	 * 
	 * @param loglevel
	 *            Level of the log like debug, error, warn etc.
	 * @param timestamp
	 *            Date-Time of the log like '2018-03-02 20:42:25.062'
	 * @param logger
	 *            Location of the log. '[main] CreateLogFile'
	 * @param message
	 *            Message of the log content like 'This is a fatal message.'
	 */
	public LogAttributesTest(String loglevel, String timestamp, String logger, String message) {
		this.loglevel = loglevel;
		this.timestamp = timestamp;
		this.logger = logger;
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getLogger() {
		return logger;
	}

	public void setLogger(String logger) {
		this.logger = logger;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getLogLevel() {
		return loglevel;
	}

	public void setLogLevel(String logLevel) {
		this.loglevel = logLevel;
	}

	public String toString() {
		return loglevel + timestamp + logger + message;
	}
}