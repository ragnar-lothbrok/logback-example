package com.logbacktest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackHello {
	private static final Logger ERROR_LOGGER = LoggerFactory.getLogger("errorlogger");
	private static final Logger METRIC_LOGGER = LoggerFactory.getLogger("metriclogger");

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			METRIC_LOGGER.debug("Welcome to the Logback test.");
			A a = new A();
			ERROR_LOGGER.error(" Error occured {}",a);
			ERROR_LOGGER.info(" Error occured {}",a);
		}
	}

	static class A {
		int a = 2;
		int b = 3;

		public int getA() {
			return a;
		}

		public void setA(int a) {
			this.a = a;
		}

		public int getB() {
			return b;
		}

		public void setB(int b) {
			this.b = b;
		}

		@Override
		public String toString() {
			return "A [a=" + a + ", b=" + b + "]";
		}

	}
}
