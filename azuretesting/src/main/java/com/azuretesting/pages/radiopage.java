package com.azuretesting.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class radiopage {
	WebDriver driver;
	@FindBy(id="yesRadio")
     private WebElement radio;
	 public radiopage(WebDriver driver){
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	    
	    public void clickradio()
	    {
	    	radio.click();
	    	
	    }
	

}
