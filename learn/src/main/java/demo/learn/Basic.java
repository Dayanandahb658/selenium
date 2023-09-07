package demo.learn;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import javax.swing.text.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.tutorials.utilities.Demo7;
import com.tutorialsninja.qa.pages.Homepage;

public class Basic 
{
	
	public static WebDriver driver;
	public  static Properties prop;
	public  static Properties tetsprop;


	public Basic()
	{	
		prop=new Properties();
		tetsprop=new Properties();
		File propfile =new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\learn\\configs\\configs.properties");			
	try {
		//System.out.println("Prop File : "+propfile);
		FileInputStream fis=new FileInputStream(propfile);
		prop.load(fis);
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	File propfile1 =new File(System.getProperty("user.dir")+ "\\src\\main\\java\\testdata\\testdata.properties");
try {
		
		FileInputStream fis2=new FileInputStream(propfile1);
		tetsprop.load(fis2);
	}
		
	 catch (Exception e) {
		e.printStackTrace();
	}
	}
		


	public static WebDriver Setup(String browsername) {
		
		
		if(browsername.equalsIgnoreCase("edge"))
		{
		driver=new EdgeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox")) 
		{
			driver=new FirefoxDriver();
		}
		else if(browsername.equalsIgnoreCase("chrome")) 
		{
			driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("Safari")) 
		{
			driver=new SafariDriver();
		}

	//	WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Demo7.WAIT_Time));
		  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Demo7.IMPLICIT_WAIT_Time));
		 //driver.get("https://tutorialsninja.com/demo/");
		 
		  driver.get(prop.getProperty("url"));
		  driver.manage().window().maximize();
		  Homepage Home=new Homepage(driver);
		  Home.clickonMyAccount();
		  Home.selectloginoption();
		  
		 //driver.findElement(By.xpath("//span[.='My Account']")).click();
		 //driver.findElement(By.xpath("(//a[.='Login'])[1]")).click();
		 //driver.findElement(By.id("input-email")).sendKeys("abcdef1998@gmail.com");
		 //driver.findElement(By.xpath("//*[@name='password']"))..sendKeys("1234");
		 //driver.findElement(By.xpath("//input[@type='submit']")).click();
			 return driver;

	}
}
