package com.azuretesting.scripts;

import java.io.IOException;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.azuretesting.pages.checkboxpage;
import com.azuretesting.pages.homepage;
import com.azuretesting.pages.linkpage;
import com.azuretesting.pages.radiopage;

public class wesitetest extends baseclass {
	homepage obj;
	radiopage rp;
	linkpage lp;
	checkboxpage cb;
	@Test(priority=1)
    public void verifyValidLogin() throws IOException, Exception {
		 driver.get(prop.getProperty("url1"));
		    driver.manage().window().maximize();   
    obj = new homepage(driver);
    String name = "Ramya";
    String email = "ramya@123";
    String caddr="trivandrum";   
    String paddr="ernakulam";
    obj.setUserName(name);
    obj.setemail(email);
    obj.setcurrentaddr(caddr);
    obj.setperaddr(paddr);
    obj.clicksubmit();
   
       }
	@Test(priority=2)
	public void verifyradio() throws IOException, Exception {
		 driver.get(prop.getProperty("url4"));
		   driver.manage().window().maximize();   
	    rp = new radiopage(driver);
	   
	    rp.clickradio();
	  
	    }
	@Test(priority=3)
	public void verifylink() throws IOException, Exception {
		driver.get(prop.getProperty("url3"));
		   driver.manage().window().maximize();   
	    lp = new linkpage(driver);
	    lp.clicklink();
	    Thread.sleep(3000);
	    }

	@Test(priority=4)
	public void verifycheckbox() throws IOException, Exception {
		driver.get(prop.getProperty("url2"));
		   driver.manage().window().maximize();   
	   cb = new checkboxpage(driver);
	    cb.clickcheck();
	    Thread.sleep(3000);
	    }
	


}
