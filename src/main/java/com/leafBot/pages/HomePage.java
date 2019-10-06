package com.leafBot.pages;

import org.openqa.selenium.By;

import com.leafBot.selenium.api.base.SeleniumBase;

import cucumber.api.java.en.Then;



public class HomePage extends SeleniumBase{
	@Then ("home page is displayed and Click on Logout")
	public HomePage clickLogout() {
		click(locateElement("class","decorativeSubmit"));
		return new HomePage();
	}
	
	public MyHomePage clickCRMSFA() {
		click(locateElement("link","CRM/SFA"));
		//driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();
	}

}
