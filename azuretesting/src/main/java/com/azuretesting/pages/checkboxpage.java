package com.azuretesting.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkboxpage {
	WebDriver driver;
   @FindBy(xpath="//div//*[@class='rct-icon rct-icon-uncheck']")
     private WebElement checkbox;
	 public checkboxpage(WebDriver driver){
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	    
	    public void clickcheck()
	    {
	    	checkbox.click();
	    	
	    }
	

}
