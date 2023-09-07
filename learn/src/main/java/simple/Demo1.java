package simple;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.tutorials.utilities.Demo7;
import com.tutorialsninja.qa.pages.Homepage;

import demo.learn.Basic;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Demo1 extends Basic
{
	
	public WebDriver driver;
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	@BeforeMethod
	public void setup() {
//		driver =new ChromeDriver();
		 
			   driver=Basic.Setup("edge");
		   
		 
		 driver.findElement(By.xpath("//span[.='My Account']")).click();
		 driver.findElement(By.xpath("(//a[.='Login'])[1]")).click();
	}
	
	@Test(priority = 1,dataProvider="supplytestdata")
public void testlogin(String email,String password) throws InterruptedException
	{	
		Homepage Home1=new Homepage(driver);
		Home1.email();
	// driver.findElement(By.id("input-email")).sendKeys(email);
	 driver.findElement(By.xpath("//*[@name='password']")).sendKeys(password);
	 driver.findElement(By.xpath("//input[@type='submit']")).click();
	 Assert.assertTrue(driver.findElement(By.xpath("//a[.='Edit your account information']")).isDisplayed());	 
    }
	
@Test(priority = 2) 
@DataProvider
public static Object[][] supplytestdata()
{
Object[][] data=Demo7.getTestdata("Sheet1");
return data;
}

 
	@Test
public void testinvalid()
	{
			// driver.findElement(By.xpath("//*[@name='email']")).sendKeys("abcdef191198@gmail");
	Homepage Home1=new Homepage(driver);
	Home1.email();
			 driver.findElement(By.xpath("//*[@name='password']")).sendKeys(tetsprop.getProperty("invalidpassword"));
			 driver.findElement(By.xpath("//input[@type='submit']")).click();
			String Actual=driver.findElement(By.xpath("//*[contains(@class,'alert-dismissible')]")).getText();
			 System.out.println(Actual);
		   String Expected=tetsprop.getProperty("emailpasswordnomatchwarning");
		   Assert.assertTrue(true, Expected);
    }

@Test(priority = 3)
public void invalidemail()
   {
		 driver.findElement(By.xpath("//*[@name='email']")).sendKeys("abcdef@gmail");
		 driver.findElement(By.xpath("//*[@name='password']")).sendKeys("1234");
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		String Actual=driver.findElement(By.xpath("//*[contains(@class,'alert-dismissible')]")).getText();
		 System.out.println(Actual);
	   //String Expected="Warning: No match for E-Mail Address and/or Password";
		 String Expected=tetsprop.getProperty("emailpasswordnomatchwarning");
		 Assert.assertTrue(true, Expected);
   }
@Test(priority = 4)
public void invalidpassword()
   {
		 driver.findElement(By.xpath("//*[@name='email']")).sendKeys("abcdef1998@gmail");
		 driver.findElement(By.xpath("//*[@name='password']")).sendKeys(tetsprop.getProperty("invalidpassword"));
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		String Actual=driver.findElement(By.xpath("//*[contains(@class,'alert-dismissible')]")).getText();
		 System.out.println(Actual);
	   //String Expected="Warning: No match for E-Mail Address and/or Password";
		 String Expected=tetsprop.getProperty("emailpasswordnomatchwarning");
		 Assert.assertTrue(true, Expected);
		driver.quit();
   }
@Test(priority = 5)
public void nocredentials()
   {
		 driver.findElement(By.xpath("//*[@name='email']")).sendKeys("abcdef1998@gmail");
		 driver.findElement(By.xpath("//*[@name='password']")).sendKeys(tetsprop.getProperty("invalidpassword"));
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		String Actual=driver.findElement(By.xpath("//*[contains(@class,'alert-dismissible')]")).getText();
		 System.out.println(Actual);
		 String Expected=tetsprop.getProperty("emailpasswordnomatchwarning");
		// String Expected="Warning: No match for E-Mail Address and/or Password";
	   Assert.assertTrue(true, Expected);
   }
  
  }
  

