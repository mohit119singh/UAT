package org.Test1;

import java.io.IOException;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.plan.Plan;
import org.Base.Loginclass;
import org.OpenBrowser.OpenBrowser;
import org.OpenBrowser.PTApage;
import org.OpenBrowser.Partner_page;
import org.Pages.Carrier_Product;
import org.testng.annotations.Test;

public class Test1 extends OpenBrowser{

	
	@Test
	public void test1_execution() throws InterruptedException, IOException{
		
		ResourceBundle rb= ResourceBundle.getBundle("Elements");
		
		Loginclass login = new Loginclass(driver);
		login.username("Msingh");
		login.pwd("Ebix@2002");
		login.loginbutton();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Partner_page pg = new Partner_page(driver);
		
		pg.select_partner("Edward Jones");
		
		pg.select_role("Sales Representative");
		
		pg.enter_loginid("AkshatSR");
		
		pg.click_serach();
		
		pg.select_user();
		
		pg.click_login();
		
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		PTApage pta = new PTApage(driver);
		
		pta.initial_action("Create application");
		
		pta.click_prefill();
		
		pta.contract_pta("1234567");
		
		pta.primary_owner("Person");
	   
		pta.primary_dob("12/08/1989");
		
		pta.primary_state("California");
		
		pta.primary_zip("95222");
		
		pta.primary_residance_state("Resident alien");
		
		((JavascriptExecutor) driver).executeScript("scroll(0,1000)");
		
		pta.account_designation();
		
		pta.click_plan();
		
		pta.select_plan();
		
		pta.click_plan();
		
		pta.click_owner();
		
		pta.select_owner();
		
		pta.click_owner();
		
		pta.net_worth("10000");
		
		pta.annual_income("1000");
		
		pta.tax_bracket("10%");
		
		pta.investment_experince("Novice");
		
		pta.investor_amount("10000");
		
		pta.total_expected("10012");
		
		pta.ext_transaction_id(pta.random_number());
		
		pta.business_unitId("426087");
		
		pta.agent_id("AkshatSR");
		
		((JavascriptExecutor) driver).executeScript("scroll(0,2000)");
		
	    pta.click_login();
	    
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
		//------------------Carrier/Product Screen-------------------
		
	    Carrier_Product cp = new Carrier_Product(driver);
	    
	    WebDriverWait wait = new WebDriverWait(driver,20);
	    
	    cp.select_state("California");
	    
	    wait.until(ExpectedConditions.textToBePresentInElement(By.xpath(rb.getString("select_carrier")), "Lincoln Financial Group"));
	    
	    cp.select_carrier("Lincoln Financial Group");
	    

	    wait.until(ExpectedConditions.textToBePresentInElement(By.xpath(rb.getString("select_product")), "American Legacy Fusion O-Share"));
	    
	    cp.select_product("American Legacy Fusion O-Share");
	    
	    wait.until(ExpectedConditions.textToBePresentInElement(By.xpath(rb.getString("wizard")), "Edward Jones application wizard"));
	    
	    cp.wizard("Edward Jones application wizard");
	    
	    cp.click_next();
	    
	    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	    
	    //------------ Plan screen starts -----------
	    
	    Plan p = new Plan(driver);
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    ((JavascriptExecutor) driver).executeScript("scroll(0,2000)");
	    
	    //p.propectues_been_delivered();
	    
	    p.click_next();
	    
	    //----------------Individual Owner-----------------
	    
	    
	    
	}
	
	
	
}
