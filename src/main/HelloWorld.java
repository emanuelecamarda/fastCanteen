package main;

import java.util.logging.Logger;

public class HelloWorld {
	
	public static void main(String[] args){
		Logger logger = Logger.getLogger(HelloWorld.class.getName());
		logger.log("Hello World!");
	}
}
