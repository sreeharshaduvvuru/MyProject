package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FindLeadsPage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC006_DeleteLead extends ProjectMethods{


@BeforeClass
public void setData() {
	dataSheetName = "TC006";
	testCaseName = "TC006_DeleteLead";
	testDescription = "To delete a Lead";
	category= "Smoke";
	authors	="Harsha";
	browserName ="chrome";
}
@Test(dataProvider="fetchData")
public void logInLogOut(String userName, String passWord, String phoneNumber, String LeadId, String expMessage) throws InterruptedException {
	
	FindLeadsPage flp=new LoginPage(driver, test)
	.enterUserName(userName)
	.enterPassword(passWord)
	.clickLogin()
	.clickCRMFSA()
	.clickLeads()
	.clickFindLeads()
	.clickPhoneTab()
	.enterPhoneNumber(phoneNumber);
	 String leadId=flp.getFirstLead();
	 flp.clickFirstResultingLead()
	.clickDeleteBtn()
	.clickFindLeads()
	.enterLeadId(leadId)
	.clickFindLeadsBtn()
	.verifNoRecordsMessage(expMessage);
}
}

	
	