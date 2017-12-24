package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{


@BeforeClass
public void setData() {
	dataSheetName = "TC003";
	testCaseName = "TC003_CreateLead";
	testDescription = "To Create a Lead";
	category= "Smoke";
	authors	="Harsha";
	browserName ="chrome";
}
@Test(dataProvider="fetchData")
public void logInLogOut(String userName, String passWord,String fName,String lName,String cName) {
	
	new LoginPage(driver, test)
	.enterUserName(userName)
	.enterPassword(passWord)
	.clickLogin()
	.clickCRMFSA()
	.clickLeads()
	.clickCreateLead()
	.enterFirstName(fName)
	.enterLastName(lName)
	.enterCompanyName(cName)
	.clickCreateLeadBtn()
	.verifyFirstName(fName);
	
}

}
