package org.IndividualOwner;

import java.util.ResourceBundle;

import org.openqa.selenium.chrome.ChromeDriver;

public class IndividualOwner {

	
	
	ChromeDriver driver;
	ResourceBundle rb;
	
	public IndividualOwner(ChromeDriver driver){
		
		this.driver=driver;
		rb=ResourceBundle.getBundle("Elements");
	}
	
	
	
}


