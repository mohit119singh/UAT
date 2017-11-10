package org.Pages;

import java.util.ResourceBundle;

import org.openqa.selenium.chrome.ChromeDriver;

public class IndividualOwner {
    
	ChromeDriver driver;
	ResourceBundle rb;
	
	
	public IndividualOwner(ChromeDriver driver){
		
		this.driver=driver;
		rb=ResourceBundle.getBundle("Elements");
	}
	
	public void owner_gender(){
		
		driver.findElementByXPath(rb.getString("owner_gender_male")).click();
	}
	
	public void mailing_address(){
		
		driver.findElementByXPath(rb.getString("mailing_address_same_yes")).click();
	}
	
	public void owner_phone_number(String s){
		
		String s1=s.substring(0, 3);
		String s2=s.substring(3, 6);
		String s3=s.substring(6, 10);
		driver.findElementByXPath(rb.getString("owner_phone_num1")).sendKeys(s1);
		driver.findElementByXPath(rb.getString("owner_phone_num2")).sendKeys(s2);
		driver.findElementByXPath(rb.getString("owner_phone_num3")).sendKeys(s3);
	}
	
	public void owner_email(String s){
		
		
		driver.findElementByXPath(rb.getString("owner_email")).sendKeys(s);
	}
	
	public void annuitant_same_owner(){
		
		driver.findElementByXPath(rb.getString("annuitant_same_owner_yes")).click();
	}
	
	public void owner_next(){
		
		driver.findElementByXPath(rb.getString("owner_next")).click();
	}
}
