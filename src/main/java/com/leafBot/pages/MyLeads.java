package com.leafBot.pages;

import org.openqa.selenium.By;

import com.leafBot.selenium.api.base.SeleniumBase;



public class MyLeads extends SeleniumBase {
	
	public CreateLeadPage clickLead() {
		
		click(locateElement("link","Create Lead"));
		//driver.findElementByLinkText("Create Lead").click();
		return new CreateLeadPage();
		
	}

	 //public FindLeads clickFindLeads() {
		//driver.findElement(By.linkText("Find Leads")).click();
		//return new FindLeads();
	//}
}
