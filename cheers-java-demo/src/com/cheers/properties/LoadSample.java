package com.cheers.properties;

import java.io.FileInputStream;
import java.util.Properties;

public class LoadSample {
	public static void main(String args[]) throws Exception {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("sample.properties");
		prop.load(fis);
		prop.list(System.out);
		System.out.println("\nThe foo property: " + prop.getProperty("dbPort"));
		
		System.out.println( System.getProperty("java.class.path"));
	}
}