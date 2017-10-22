package org.OpenBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class OpenBrowser {
	
	public ChromeDriver driver;
	
	@BeforeMethod
	public void openURL(){
		
	
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://uat.eannuity.ebix.com/login/listusers");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void closeBrowser(){
		
	//driver.quit();
		
	}

}
