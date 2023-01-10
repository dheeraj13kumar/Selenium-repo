package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Class2 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","../Seleniumintro/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement user=driver.findElement(By.id("email"));
	    user.sendKeys("deepak"); 
		WebElement password=driver.findElement(By.cssSelector("input#pass"));
		password.sendKeys("Password1");
		}
} 