package org.Base;

import java.util.ResourceBundle;

import org.openqa.selenium.chrome.ChromeDriver;

public class Loginclass {
	
	ChromeDriver driver;
	ResourceBundle dr;
	
	
    //Constructor to initiate browser
	public Loginclass(ChromeDriver driver){
		
		this.driver=driver;
		dr = ResourceBundle.getBundle("Elements");
	}
	
	
	// method to enter username
	public void username(String s){
		
		driver.findElementById(dr.getString("username_byid")).sendKeys(s);;
		
		
	}

	//method to enter password
	public void pwd(String d){
		
		driver.findElementById(dr.getString("pwd_byid")).sendKeys(d);
		
	}
	
	//method to click on login button
	public void loginbutton(){
		
		driver.findElementById(dr.getString("loginbutton_byid")).click();
		
	}
}
