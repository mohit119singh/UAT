package org.assertion;

import java.util.ResourceBundle;

import org.openqa.selenium.chrome.ChromeDriver;

public class Compare {
	
	ChromeDriver driver;
	ResourceBundle rb;
     
	public Compare(ChromeDriver driver){
		
		this.driver=driver;
	    rb = ResourceBundle.getBundle("Elements");
	    
	}
	
	public static boolean compareTitlePlan(ChromeDriver driver, String exp){
		
    boolean result=false;
		
	if(driver.getTitle().equalsIgnoreCase(exp)){
		
		result=true;
	}
	
	return result;
	}
	
	
	public static boolean prospectusesSelectedNo(ChromeDriver driver, boolean exp){
		
		boolean result=false;
		
		if(driver.findElementByXPath("//input[@id='control261365_RadioButtons_0']").isSelected()==exp){
		result=true;
		}
		
		return false;
	}
	
}
