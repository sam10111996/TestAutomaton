package com.sgtesting.log4j;

import org.apache.log4j.Logger;

public class Lg4jDemo {
	public static Logger log=Logger.getLogger("Automation...");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.info("The for loop starts here");
		for(int i=20;i<40;i++) {
			if(i%2==0) {
				log.info("Even Number: "+i);
			}
		}
	log.info("The for loop ends here");
	}

}
