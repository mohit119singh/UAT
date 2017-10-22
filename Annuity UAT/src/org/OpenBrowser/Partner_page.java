package org.OpenBrowser;

import java.util.ResourceBundle;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Partner_page {

	ChromeDriver driver;
	
	ResourceBundle rb;
	
	public Partner_page(ChromeDriver driver){
		
		this.driver = driver;
		rb = ResourceBundle.getBundle("Elements");
		
	}
	
	public void select_partner(String s){
		
		Select select = new Select(driver.findElementByXPath(rb.getString("select_partner")));
		select.selectByVisibleText(s);
	}
	
	
	public void select_role(String s){

		Select select = new Select(driver.findElementByXPath(rb.getString("select_role")));
		select.selectByVisibleText(s);

	}
	
	public void enter_loginid(String s){
		
		driver.findElementByXPath(rb.getString("enter_loginid")).sendKeys(s);
	}
	
	public void click_serach(){
		
		driver.findElementByXPath(rb.getString("search_button")).click();
	}
	
	public void select_user(){
		
		driver.findElementByXPath(rb.getString("select_user")).click();
	}
	
	public void click_login(){
		
		driver.findElementByXPath(rb.getString("partner_loginbutton")).click();
	}
}
