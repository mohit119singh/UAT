package org.Pages;

import java.util.ResourceBundle;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Carrier_Product {

	ChromeDriver driver;
	ResourceBundle rb;
	
	public Carrier_Product(ChromeDriver driver){
	
		this.driver= driver;
		rb= ResourceBundle.getBundle("Elements");
		
	}
	
	
	public void select_state(String s){
		
		Select select = new Select(driver.findElementByXPath(rb.getString("select_state")));
		select.selectByVisibleText(s);
	}
	
    public void select_carrier(String s){
		
		Select select = new Select(driver.findElementByXPath(rb.getString("select_carrier")));
		select.selectByVisibleText(s);
	}
    
    public void select_product(String s){
		
		Select select = new Select(driver.findElementByXPath(rb.getString("select_product")));
		select.selectByVisibleText(s);
	}
    
    public void wizard(String s){
		
		Select select = new Select(driver.findElementByXPath(rb.getString("wizard")));
		select.selectByVisibleText(s);
	}
    
    public void click_next(){
    	
    	driver.findElementByXPath(rb.getString("cp_next")).click();
    }
    
}
