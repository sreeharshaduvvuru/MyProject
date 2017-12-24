package ClassRoomSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		WebElement drop=driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(drop);
		WebElement drag=driver.findElementByXPath("//div[@id='draggable']");
	    Point coordinates = drag.getLocation();
		Actions builder=new Actions(driver);
		System.out.println(coordinates.getX());
		System.out.println(coordinates.getY());
		int x=coordinates.getX()+40;
		int y=coordinates.getY()+50;
	
	   builder.dragAndDropBy(drag, x, y).perform();
	
		
	}

}
