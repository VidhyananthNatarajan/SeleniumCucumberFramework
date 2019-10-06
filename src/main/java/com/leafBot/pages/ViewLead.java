package com.leafBot.pages;

import org.openqa.selenium.By;

import com.leafBot.selenium.api.base.SeleniumBase;



public class ViewLead extends SeleniumBase {
	
	public void verifyLeadCreation(String expectedTitle) {
		
		verifyTitle(expectedTitle);
		
	}


}
