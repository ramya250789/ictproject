package com.azuretesting.scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class baseclass {
	
	 WebDriver driver;
	    public static Properties prop = null;
	    String driverPath = System.getProperty("user.dir") + "/src/test/resources/drivers/"+"chromedriver.exe";
	    public static void baseclass() {
	        try {
	        	prop = new Properties();
	           FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources"+ "/config.properties");
	            prop.load(ip);
	        } catch (FileNotFoundException e) {

	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	    @BeforeMethod
	    public void onSetup() {
	        baseclass(); 
	        String browserName = prop.getProperty("browser");

	        if (browserName.equals("chrome")) {
	        	System.setProperty("webdriver.chrome.driver", driverPath);
	            driver = new ChromeDriver();

	        }
	        else if (browserName.equals("firefox")) {
	        	
	        	System.setProperty("webdriver.gecko.driver", driverPath);
	            driver = new FirefoxDriver();
	        }
	        driver.manage().timeouts();
	        
	    }
	    

}
