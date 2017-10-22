package org.OpenBrowser;

import java.awt.Toolkit;
import java.awt.datatransfer.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.ResourceBundle;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PTApage {

	ChromeDriver driver;
	ResourceBundle rb;
	
	public PTApage(ChromeDriver driver){
	
		this.driver= driver;
		rb= ResourceBundle.getBundle("Elements");
		
	}
	
	
	public void initial_action(String s){
		
		Select select = new Select(driver.findElementByXPath(rb.getString("Initial_Action")));
		select.selectByVisibleText(s);
	}
	
	public void click_prefill(){
		
		driver.findElementByXPath(rb.getString("prefill")).click();
	}
	
	public void click_rawxml(){
		
		driver.findElementByXPath(rb.getString("Raw_xml")).click();
	}
	
	
	
	
	public void paste_xml() throws IOException{
		
		String thisLine = null;
	    try {
	     
	     // open input stream test.txt for reading purpose.
	     
	     BufferedReader reader = new BufferedReader(new FileReader("./Driver/PTA.txt"));

	 
	     StringBuilder stringBuilder = new StringBuilder();
	     
	     // PSLog.info("After file read");
	     
	     String ls = System.getProperty("line.separator");
	         thisLine=reader.readLine();

	     while (thisLine != null) {

	      stringBuilder.append(thisLine.trim());
	      stringBuilder.append(ls);

	      // driver.findElement(By.id("rawXmlData")).sendKeys(thisLine);
	     }

	     String xmlInput = "";
	     xmlInput = stringBuilder.toString();

	     StringSelection str = new StringSelection(xmlInput);
	     Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	     clipboard.setContents(str, (ClipboardOwner)this);
	     driver.findElementByXPath(rb.getString("Paste_xml")).sendKeys(Keys.LEFT_CONTROL + "v");

	     reader.close();

	    } catch (Exception e) {
	     e.printStackTrace();
	    }
	   
	 }
		
	
	public void contract_pta(String s){
		
		driver.findElementByXPath(rb.getString("contract_num")).sendKeys(s);
	}
	
    public String contract_number(){
		
		Random rnd = new Random();
		StringBuilder sb = new StringBuilder((100000 + rnd.nextInt(900000)));

        return sb.toString();
	}
	
	public void primary_owner(String s){
		
		Select select  = new Select(driver.findElementByXPath(rb.getString("primary_owner")));
		select.selectByVisibleText(s);
	}
	
	public void primary_dob(String s){
		
		driver.findElementByXPath(rb.getString("primary_dob")).sendKeys(s);
	}
		
	public void primary_state(String s){
		
		Select select = new Select(driver.findElementByXPath(rb.getString("primary_state")));
		select.selectByVisibleText(s);
	}
	
	
	
	public void primary_zip(String s){
		driver.findElementByXPath(rb.getString("primary_zip")).sendKeys(s);
	}
	
	
	
	public void primary_residance_state(String s){
		
		Select select = new Select(driver.findElementByXPath(rb.getString("primary_residance_state")));
		select.selectByVisibleText(s);
	}
	
	
	public void account_designation(){
		
		driver.findElementByXPath(rb.getString("account_designation")).click();
	}
	
	
	
	public void click_plan(){
		
		driver.findElementByXPath(rb.getString("plan_type")).click();
	}
	
	public void select_plan(){
		driver.findElementByXPath(rb.getString("non_qualified")).click();
	}
	
	
	public void click_owner(){
		driver.findElementByXPath(rb.getString("owner_type")).click();
	}
	
	public void select_owner(){
		
		driver.findElementByXPath(rb.getString("person")).click();
	}
	
	public void net_worth(String s){
		
		driver.findElementByXPath(rb.getString("net_worth")).sendKeys(s);
	}
	
    public void annual_income(String s){
		
		driver.findElementByXPath(rb.getString("annual_income")).sendKeys(s);
	}
	
    public void tax_bracket(String s){
		
		Select select = new Select(driver.findElementByXPath(rb.getString("tax_bracket")));
		select.selectByVisibleText(s);
	}
    
    public void investment_experince(String s){
		
		Select select = new Select(driver.findElementByXPath(rb.getString("investment_experince")));
		select.selectByVisibleText(s);
	}
    
    
    public void investor_amount(String s){
		
		driver.findElementByXPath(rb.getString("investor_amount")).sendKeys(s);
	}
    
    
    public void total_expected(String s){
		
		driver.findElementByXPath(rb.getString("total_expected")).sendKeys(s);
	}
    
    
    public String random_number(){
    	
    	// Generate random id, for example 283952-V8M32
    	char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
    	Random rnd = new Random();
    	StringBuilder sb = new StringBuilder((100000 + rnd.nextInt(900000)) + "-");
    	for (int i = 0; i < 5; i++)
    	    sb.append(chars[rnd.nextInt(chars.length)]);

    	return sb.toString();
    }
    
    public void ext_transaction_id(String s){
		
		driver.findElementByXPath(rb.getString("ext_transaction_id")).sendKeys(s);
	}
    
    public void business_unitId(String s){
		
		driver.findElementByXPath(rb.getString("business_unitId")).sendKeys(s);
	}
    
    public void agent_id(String s){
		
		driver.findElementByXPath(rb.getString("agent_id")).sendKeys(s);
	}
    
    
    
    
	public void click_login(){
		
		driver.findElementByXPath(rb.getString("Login")).click();
	}
}



