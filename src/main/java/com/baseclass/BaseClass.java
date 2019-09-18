package com.baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	public Properties prop;
	public WebDriver driver;
	public BaseClass() throws Exception {
		try {
	    prop = new Properties();
		FileInputStream ip = new FileInputStream("F:\\Java_24_Workspace\\com.artifact\\src\\main\\java\\com\\properties\\config.properties");
		prop.load(ip);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	public void Initailization() {
		System.out.println(prop.getProperty("browser"));
		if(prop.getProperty("browser").equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					  "F:\\drivers\\geckodriver.exe");
			 driver = new FirefoxDriver();
		}
	}

}
