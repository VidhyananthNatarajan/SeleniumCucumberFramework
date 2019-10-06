package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

	public class TC002_CreateLead extends ProjectSpecificMethods{
		@BeforeTest
		public void setData() {
			excelFileName="TC002";
			testcaseName="Create Lead";
			testcaseDec = "Creating the Lead";
			author="Vidhyananth";
			category="Functional Test Case";
			
		}
		
		@Test(dataProvider="fetchData")
		public void runTC001(String username, String password, String cname, String fName, String Lname, String expectedTitle) {
			new LoginPage()
			.enterUsername(username)
			.enterPassword(password)
			.clickLogin()
			.clickCRMSFA()
			.clickLeads()
			.clickLead()
			.entercompanyname(cname)
			.enterfirstname(fName)
			.enterlastname(Lname)
			.clickCreate()
			.verifyLeadCreation(expectedTitle);
			
			}
	}

