package com.jitin.log4jdemo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestLogger {

	private static final Logger logger = Logger.getLogger(TestLogger.class);
	public static void main(String[] args) {
		//PropertyConfigurator.configure("log4j.properties");
		/*
		 * Logging Levels
		 * 1.DEBUG
		 * 2.INFO
		 * 3.WARN
		 * 4.ERROR
		 * 5.FATAL
		 */
		logger.debug("Debug");
		logger.info("Info");
		logger.warn("Warning");
		logger.error("Error");
		logger.fatal("Fatal");
	}

}
