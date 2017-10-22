package org.plan;

import java.util.ResourceBundle;

import org.openqa.selenium.chrome.ChromeDriver;

public class Plan {
	
	ChromeDriver driver;
	ResourceBundle rb;

	public Plan(ChromeDriver driver){
		
		this.driver= driver;
		rb= ResourceBundle.getBundle("Elements");
		
	}
	
	public void propectues_been_delivered(){
		
		driver.findElementByXPath(rb.getString("propectues_been_delivered")).click();
	}
	
	public void click_next(){
		
		driver.findElementByXPath(rb.getString("next")).click();
	}
	
}
