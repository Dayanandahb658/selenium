package Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample 
{
	@Test
 //public static void main(String[] args) 
 public void Login() throws InterruptedException
	{
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell i7 16\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	String Actual="Google";
	driver.getTitle();
	//System.out.println(driver.getTitle());
	String Expected=driver.getTitle();
	Assert.assertEquals(Actual, Expected);
	 driver.quit();

	}
}
     
//	@Test
//	public void Login1()
//	{
//		
//	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell i7 16\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
//	WebDriver driver=new ChromeDriver();
//	driver.get("https://www.facebook.com/");
//	driver.quit();
//}
//	@Test
//	public void Login2()
//	{
//		
//	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell i7 16\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
//	WebDriver driver=new ChromeDriver();
//	driver.get("https://www.Whatsapp.com/");
//	driver.quit();
//}
//}
