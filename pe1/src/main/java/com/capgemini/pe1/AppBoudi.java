package com.capgemini.pe1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppBoudi {
	
	
	private static Logger logger = LoggerFactory.getLogger(AppBoudi.class);

	public static void main(String[] args) {
		/*System.out.println("boudi developp");
		System.out.println("developp 15");
		System.out.println("*****");*/
		
		logger.info("boudi developp");
		logger.debug("developp 15");
		logger.debug("*****");
		// logger.error() dans try/catch
	}
}


