package com.ex;

import org.apache.log4j.Logger;

public class Ex1 {
	private static Logger logger = Logger.getLogger(Ex1.class);

	public static void main(String[] args) {
		for (int i = 0; i < 10000; i++) {
			logger.trace("Trace message");
			logger.debug("debug message");
			logger.info("info message");
			logger.warn("warn message");
			logger.error("error message");
			logger.fatal("fatal message");
		}
	}
}
