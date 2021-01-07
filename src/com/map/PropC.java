package com.map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropC {
	public static void main(String[] args) throws IOException {
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("./config.properties");
		p.load(fis);
		System.out.println(p);
		System.out.println(p.getProperty("user"));
		p.setProperty("Arun","10000");
		Enumeration<?> e = p.propertyNames();
		while(e.hasMoreElements())
		{
			String s = (String) e.nextElement();
			System.out.println(s);
			}
		FileOutputStream fos = new FileOutputStream("./config.properties");
		p.store(fos,"Updated by RS");
		System.out.println(p);
	}

}
