package pkg1;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Youtube
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
	String firsttab=driver.getWindowHandle();
	System.out.println("BEFORE SWITCHING URL IS");
	System.out.println(driver.getCurrentUrl());
	Set<String> allwindows=driver.getWindowHandles();
	System.out.println("total tabs" +allwindows.size());
	for (String s : allwindows)
	{
		driver.switchTo().window(s);
	}
	System.out.println("after switching url is");
	System.out.println(driver.getCurrentUrl());
	driver.switchTo().window(firsttab);
	System.out.println("final url is");
	System.out.println(driver.getCurrentUrl());

}

}