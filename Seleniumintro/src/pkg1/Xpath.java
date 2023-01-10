package pkg1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Xpath
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","../Seleniumintro/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement button=driver.findElement(By.xpath("//a[text()='Create New Account']"));
		button.click();
		Thread.sleep(5000);
		WebElement name=driver.findElement(By.xpath("//input[@name='firstname']"));
	    name.sendKeys("Rohit");
	    WebElement lastname=driver.findElement(By.xpath("//input[@type='text' and @name='lastname']"));
	    lastname.sendKeys("Kumar");
	    WebElement email=driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
	    email.sendKeys("0088004591");
	    WebElement password=driver.findElement(By.xpath("//input[@autocomplete='new-password' or aria-label='New password' ]"));
	    password.sendKeys("Heaven@123");
	    WebElement date=driver.findElement(By.xpath("//select[@title='Day']"));
	    Select s=new Select(date);
	    s.selectByVisibleText("12");
	    WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
	    Select d=new Select(month);
	    d.selectByIndex(1);
	    WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
	    Select y=new Select(year);
	    y.selectByValue("1990");
	    WebElement gender=driver.findElement(By.xpath("//input[@value='2']"));
		gender.click();
		WebElement signup=driver.findElement(By.xpath("//button[@name= 'websubmit']"));
		signup.click();
	  }
}



