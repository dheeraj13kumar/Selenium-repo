package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Class3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","../Seleniumintro/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement button=driver.findElement(By.linkText("Create New Account"));
		button.click();
		Thread.sleep(5000);
		WebElement name=driver.findElement(By.cssSelector("input[name='firstname']"));
	    name.sendKeys("Rohit");
	    WebElement lastname=driver.findElement(By.cssSelector("input[name='lastname']"));
	    lastname.sendKeys("Kumar");
	    WebElement email=driver.findElement(By.cssSelector("input[name='reg_email__']"));
	    email.sendKeys("6388004591");
	    WebElement password=driver.findElement(By.cssSelector("input[data-type='password']"));
	    password.sendKeys("Heaven@123");
	    WebElement date=driver.findElement(By.cssSelector("select[id='day']"));
	    Select s=new Select(date);
	    s.selectByVisibleText("10");
	    WebElement month=driver.findElement(By.cssSelector("select[id='month']"));
	    Select d=new Select(month);
	    d.selectByIndex(1);
	    WebElement year=driver.findElement(By.cssSelector("select[id='year']"));
	    Select y=new Select(year);
	    y.selectByValue("1990");
	    WebElement gender=driver.findElement(By.cssSelector("input[value='2']"));
		gender.click();
		WebElement signup=driver.findElement(By.name("websubmit"));
		signup.click();
}
	} 