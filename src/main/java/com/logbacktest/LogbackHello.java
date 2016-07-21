package com.logbacktest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackHello {
	private static final Logger LOGGER = LoggerFactory.getLogger(LogbackHello.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LOGGER.trace("Hello World!");

		for (int i = 0; i < 2000000000; i++) {
			String name = "Testing Logging";
			LOGGER.debug("Hi, {}", name);
			LOGGER.info("Welcome to the Logback test.");
			LOGGER.warn("Logback warning message.");
			LOGGER.error("Logback error message.");
			A a = new A();
			LOGGER.debug("{}",a);
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
