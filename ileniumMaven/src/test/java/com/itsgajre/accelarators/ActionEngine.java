package com.itsgajre.accelarators;

import org.openqa.selenium.By;

public class ActionEngine extends Controller{
	
	public boolean waitForElement(By element, int timeOutInSeconds){
	       boolean found = false;
	        try{
	            int counter=1;
	            while(counter<timeOutInSeconds){
	                if(driver.findElements(element).size()>0){
	                    found = true;
	                    break;
	                }
	                else{
	                    Thread.sleep(1000);
	                    counter++;
	                }
	            }
	            return found;
	        }
	        catch(Exception e){
	            e.printStackTrace();
	            return found;
	        }
	}

}
