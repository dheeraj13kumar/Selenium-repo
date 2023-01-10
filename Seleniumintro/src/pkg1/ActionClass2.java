package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass2
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","../Seleniumintro/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com");
	driver.manage().window().maximize();
	WebElement video=driver.findElement(By.id("video-title")); 
	Actions ac=new Actions(driver);
	ac.keyDown(Keys.CONTROL).click(video).keyUp(Keys.CONTROL).build().perform();
}
}
