package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditLead extends ProjectMethods{


@BeforeClass
public void setData() {
	dataSheetName = "TC004";
	testCaseName = "TC004_EditLead";
	testDescription = "To Edit a Lead";
	category= "Smoke";
	authors	="Harsha";
	browserName ="chrome";
}
@Test(dataProvider="fetchData")
public void logInLogOut(String userName, String passWord,String firstName, String title, String cName) throws InterruptedException {
	
	new LoginPage(driver, test)
	.enterUserName(userName)
	.enterPassword(passWord)
	.clickLogin()
	.clickCRMFSA()
	.clickLeads()
	.clickFindLeads()
	.enterFirstName(firstName)
	.clickFindLeadsBtn()
	.clickFirstResultingName()
	.verifyPageTitle(title)
	.clickEditBtn()
	.enterCompanyName(cName)
	.ClickUpdateBtn()
	.verifyCompanyName(cName);
}
	
	
	
	
	
}

