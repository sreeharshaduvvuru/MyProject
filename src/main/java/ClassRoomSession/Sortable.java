package ClassRoomSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://jqueryui.com/sortable/");
		driver.manage().window().maximize();
		WebElement drop=driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(drop);
		WebElement item1=driver.findElementByXPath("//li[text()='Item 1']");
		WebElement item4=driver.findElementByXPath("//li[text()='Item 4']");
		Actions builder=new Actions(driver);
		Point coordinates = item1.getLocation();
		int x=coordinates.getX();
		int y=coordinates.getY();
		builder.dragAndDropBy(item4, x, y);
		//builder.clickAndHold(item1).release(item4).build().perform();
	}
}