package com.itsgajre.accelarators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Controller {
	
	public WebDriver driver;
	
	public void setUp(){
		driver = new FirefoxDriver();		
	}

}
