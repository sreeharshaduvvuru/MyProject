package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods{

	public ViewLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);

}

@FindBy(how=How.ID,using="viewLead_firstName_sp")
private WebElement eleFirstName;
public ViewLeadPage verifyFirstName(String fName) {
	verifyExactText(eleFirstName, fName);
	return this;
}
public ViewLeadPage verifyPageTitle(String title){
	verifyTitle(title);
	return this;
		}
@FindBy(how=How.XPATH,using="//a[text()='Edit']")
private WebElement eleEditBtn;
public EditLeadPage clickEditBtn(){
	click(eleEditBtn);
	return new EditLeadPage(driver,test);
	
}
@FindBy(how=How.LINK_TEXT,using="Duplicate Lead")
private WebElement eleDuplicateLeadBtn;
public DuplicateLeadPage clickDuplicateLeadBtn(){
	click(eleDuplicateLeadBtn);
	return new DuplicateLeadPage(driver,test);
	
}
@FindBy(how=How.CLASS_NAME,using="subMenuButtonDangerous")
private WebElement eleDeleteBtn;
public MyLeadsPage clickDeleteBtn(){
	click(eleDeleteBtn);
	return new MyLeadsPage(driver,test);
}
@FindBy(how=How.ID,using="viewLead_companyName_sp")
private WebElement eleCompanyName;
public ViewLeadPage verifyCompanyName(String cName){
	verifyPartialText(eleCompanyName, cName);
	return this;

}
@FindBy(how=How.ID,using="viewLead_firstName_sp")
private WebElement eleDuplicateName;
public  String getDuplicateLeadname(){
String dupName=getText(eleDuplicateName);
return dupName;
}
}
