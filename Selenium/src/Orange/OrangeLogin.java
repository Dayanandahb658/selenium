package Orange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeLogin {
	public void  Login1() throws InterruptedException
	   {
		   //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell i7 16\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		   Thread.sleep(2000);
		   WebElement D1 = driver.findElement(By.xpath("//*[@name='username']"));
		   D1.sendKeys("Admin");

				   System.out.println("username");
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//*[@type='submit')")).click();
		   Thread.sleep(2000);
		   
	   }
}
