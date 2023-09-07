package demo.learn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Search extends Basic
{
	
   WebDriver driver;
   
   @BeforeMethod
   public void setup() {
	   driver=Basic.Setup("edge");
   }
   @Test
   public void Verifysearchwithvalidproduct() throws InterruptedException
   {
	
	    driver.findElement(By.xpath("//input[@name='search']")).sendKeys("HP");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//i[contains(@class,'fa fa-search')]")).click();
	    
	    
   }
   @AfterMethod	 
	 public void last()
	 {
		 driver.quit();
	 }
	
}
