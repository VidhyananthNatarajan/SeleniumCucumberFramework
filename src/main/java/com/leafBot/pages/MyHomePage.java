package com.leafBot.pages;

import org.openqa.selenium.By;

import com.leafBot.selenium.api.base.SeleniumBase;



public class MyHomePage extends SeleniumBase {
	
	public MyLeads clickLeads() {
		
	click(locateElement("link","Leads"));
	
	//driver.findElement(By.linkText("Leads")).click();
	return new MyLeads();
	}

}
