package com.leafBot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.leafBot.selenium.api.base.SeleniumBase;



public class CreateLeadPage extends SeleniumBase {
	
	public CreateLeadPage entercompanyname(String cname) {
		
		clearAndType(locateElement("id", "createLeadForm_companyName"), cname);
		//WebElement companyName = driver.findElement (By.id("createLeadForm_companyName"));
	    //companyName.sendKeys(cname);
	    return this;
		
	}
public CreateLeadPage enterfirstname(String fName) {
	
	
	clearAndType(locateElement("id", "createLeadForm_firstName"), fName);
	 //WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
     //firstName.sendKeys(fName);
     return this;
     
		
	}
public CreateLeadPage enterlastname(String Lname) {
	clearAndType(locateElement("id", "createLeadForm_lastName"), Lname);
	//WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
    //lastName.sendKeys(Lname);
    return this;
	
}

public ViewLead clickCreate() {
	click(locateElement("class","smallSubmit"));
	//driver.findElement(By.className("smallSubmit")).click();
	return new ViewLead();
}

}
