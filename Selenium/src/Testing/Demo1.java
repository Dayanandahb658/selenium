package Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//port org.testng.annotations.Test;

public class Demo1
 {
	
//  public static void main(String[] args) 
//	
//  {
//  System.out.println("jkjkjuui");
//  }
//}
	@Parameters("url")
//Test(priority = 3)
	public void Best1(String url)	{
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
	 System.out.println("Best1");
	}
	@Test(priority =2)
	public void Best2() 
	{
		System.out.println("Best2");
	}
	@Test(priority =1)
	public void Best3() 
	{
		System.out.println("Best3");
	}
	@BeforeGroups
	public void Best4() 
	{
		System.out.println("Best4");
	}
     @BeforeMethod
	public void Best5() 
	{
		System.out.println("Best5");
	}
     @BeforeSuite
 	public void Best6() 
 	{
 		System.out.println("Best6");
 	}
     @AfterClass
  	public void Best7() 
  	{
  		System.out.println("Best7");
  	}
     @AfterTest
   	public void Best() 
   	{
   		System.out.println("Best7");
   	}
      
	}