package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class MakeMyTrip 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","../Seleniumintro/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement pop=driver.findElementByXPath("//a[@id='webklipper-publisher-widget-container-notification-close-div']");
		pop.click();
		WebElement popup=driver.findElementByXPath("//span[@class='langCardClose']");
		popup.click();
		WebElement from=driver.findElement(By.xpath("//span[text()='From']"));
		from.click();
		WebElement entercity= driver.findElement(By.xpath("//input[@placeholder='From']"));
		entercity.sendKeys("delhi");
		Thread.sleep(2000);
		entercity.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		entercity.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement to= driver.findElementByXPath("//span[text()='To']");
		to.click();
		WebElement selectcity=driver.findElement(By.xpath("//input[@placeholder='To']"));
		selectcity.sendKeys("Mumbai");
		Thread.sleep(2000);
		selectcity.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		selectcity.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.close();
	}
}
