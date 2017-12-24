package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods{
	
	public FindLeadsPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);

}
	
@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
private WebElement eleFirstName;
public FindLeadsPage enterFirstName(String fName){
	type(eleFirstName, fName);
	return this;	
}
@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
private WebElement eleFindLeadsBtn;
public FindLeadsPage clickFindLeadsBtn() throws InterruptedException{
	click(eleFindLeadsBtn);
	Thread.sleep(5000);
	return this;
}

@FindBy(how=How.XPATH,using="//span[text()='Email']")
private WebElement eleEmailTab;
public FindLeadsPage clickEmailTab(){
	click(eleEmailTab);
	return this;
}
@FindBy(how=How.XPATH,using="//span[text()='Phone']")
private WebElement elePhoneTab;
public FindLeadsPage clickPhoneTab() throws InterruptedException{
	click(elePhoneTab);
	Thread.sleep(5000);
	return this;
}
@FindBy(how=How.XPATH,using="//input[@name='phoneNumber']")
private WebElement elePhoneNumberField;
public FindLeadsPage enterPhoneNumber(String phonenum){
	type(elePhoneNumberField, phonenum);
	return this;
	}

@FindBy(how=How.XPATH,using="//input[@name='emailAddress']")
	private WebElement eleEmailField;
	public FindLeadsPage enterEmail(String email){
		type(eleEmailField, email);
		return this;
}
	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
	private WebElement eleLeadField;
	public FindLeadsPage enterLeadId(String LeadId){
		type(eleLeadField, LeadId);
		return this;
	}
	
String name="";
@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a")
private WebElement eleName;
public String getFirstName(){
  String name=getText(eleName);
return name;
}
@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]")
private WebElement eleFirstResultingName;
public ViewLeadPage clickFirstResultingName(){
	click(eleFirstResultingName);
	return new ViewLeadPage(driver,test);
}
String LeadId="";
@FindBy(how=How.XPATH,using="(//a[@class='linktext'])[4]")
private WebElement eleFirstLead;
public String getFirstLead(){
 String LeadId=getText(eleFirstLead);
return LeadId;
}
@FindBy(how=How.XPATH,using="(//a[@class='linktext'])[4]")
private WebElement eleFirstResultingLead;
public ViewLeadPage clickFirstResultingLead(){
	click(eleFirstResultingLead);
	return new ViewLeadPage(driver,test);
}
@FindBy(how=How.XPATH,using="/div[text()='No records to display']")
private WebElement eleMessage;
public FindLeadsPage verifNoRecordsMessage(String expMessage){
	type(eleMessage, expMessage);
	return this;
}
}




