package pkg1;


import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","../Seleniumintro/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Options op=driver.manage();
		Window w=op.window();
		w.maximize();
		}

}
