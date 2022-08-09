package com.azuretesting.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
		
    WebDriver driver;
    
    @FindBy(id="userName")
    private WebElement username;
   @FindBy(id="userEmail")
    private WebElement email;    
    @FindBy(id="currentAddress")
    private WebElement caddr;
    @FindBy(id="permanentAddress")
    private WebElement paddr;
    @FindBy(id="submit")
    private WebElement submit;
    
    public homepage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    public void setUserName(String strUserName){
    	username.sendKeys(strUserName);     
    }

    public void setemail(String em){
        email.sendKeys(em);
    }
    public void setcurrentaddr(String addr){
        caddr.sendKeys(addr);
    }
    public void setperaddr(String addr1){
        paddr.sendKeys(addr1);
    }
    public void clicksubmit(){
        submit.click();
    }
    
   
    



}
