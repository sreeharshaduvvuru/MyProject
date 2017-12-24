package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FindLeadsPage;
import pages.LoginPage;
import pages.ViewLeadPage;
import wdMethods.ProjectMethods;

public class TC005_DuplicateLead extends ProjectMethods{


@BeforeClass
public void setData() {
	dataSheetName = "TC005";
	testCaseName = "TC005_DuplicateLead";
	testDescription = "To Create a Duplicate Lead";
	category= "Smoke";
	authors	="Harsha";
	browserName ="chrome";
}
@Test(dataProvider="fetchData")
public void logInLogOut(String userName, String passWord,String emailadress, String title) throws InterruptedException {
	
	
			FindLeadsPage flp= new LoginPage(driver, test)
			
	.enterUserName(userName)
	.enterPassword(passWord)
	.clickLogin()
	.clickCRMFSA()
	.clickLeads()
	.clickFindLeads();
	flp.clickEmailTab();
	flp.enterEmail(emailadress);
	flp.clickFindLeadsBtn();
	String capturedName=flp.getFirstName();
	flp.clickFirstResultingName()
	.clickDuplicateLeadBtn()
	.verifyPageTitle(title)
	.clickCreateLeaBtn();
	
}
}

