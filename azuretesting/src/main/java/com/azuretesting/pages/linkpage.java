package com.azuretesting.pages;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class linkpage {
		WebDriver driver;
		@FindBy(id="simpleLink")
	     private WebElement link;
		 public linkpage(WebDriver driver){
		        this.driver = driver;
		        PageFactory.initElements(driver, this);
		    }
		    
		    public void clicklink()
		    {
		    	link.click();
		    	
		    }
		

	}



