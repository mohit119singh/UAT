package org.plan;

import java.util.ResourceBundle;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Plan {
	
	ChromeDriver driver;
	ResourceBundle rb;

	public Plan(ChromeDriver driver){
		
		this.driver= driver;
		rb= ResourceBundle.getBundle("Elements");
		
	}
	
	public void propectues_been_delivered(){
		
		driver.findElementByXPath(rb.getString("propectues_been_delivered_yes")).click();
	}
	
    public void select_plan(String s){
		
		Select select = new Select(driver.findElementByXPath(rb.getString("plan_type_planpage")));
		select.selectByVisibleText(s);
	}
    
    public void contract_owner(String s){
		
		Select select = new Select(driver.findElementByXPath(rb.getString("plan_contract_owner")));
		select.selectByVisibleText(s);
	}
	
	public void click_next(){
		
		driver.findElementByXPath(rb.getString("plan_next")).click();
	}
	
}
