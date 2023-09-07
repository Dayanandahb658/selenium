package simple;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tutorials.utilities.Demo7;

import demo.learn.Basic;

public class Register extends Basic {

	WebDriver driver;
//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	@BeforeMethod
	public void teardown() throws InterruptedException {
		driver = Setup("edge");
		WebDriverWait W1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//a[.='Register'])[1]")).click();
	}

	@AfterMethod
	public void last() {
		driver.quit();
	}

	
	@Test
	public void Regis() throws InterruptedException {
		// driver =new ChromeDriver();
		// Thread.sleep(2000);
		WebDriverWait W1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		W1.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name='firstname']"))));
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("namma");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("nimma");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Demo7.Sample2());
		driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys("8710926782");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@name='confirm']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		// driver.findElement(By.xpath("//input[@value='Continue']")).click();
		// String Expected="Your Account Has Been ";
		String Actual = driver.findElement(By.xpath("(//*[.='Your Account Has Been Created!'])[2]")).getText();
		String Expected = "Your Account Has Been Created!";
		System.out.println(Actual);
		Assert.assertEquals(Expected, Actual);
		driver.findElement(By.xpath("//span[.='My Account']")).click();
		driver.findElement(By.xpath("(//*[.=\"Logout\"])[2]")).click();
	}

	@Test
	public void Simple1() throws InterruptedException {

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("namma");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("nimma");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Demo7.Sample2());
		driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys("8710926782");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@name='confirm']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		// String Expected="Your Account Has Been ";
		String Actual = driver.findElement(By.xpath("(//*[.='Your Account Has Been Created!'])[2]")).getText();
		String Expected = "Your Account Has Been Created!";
		System.out.println(Actual);
		Assert.assertEquals(Expected, Actual);
		driver.findElement(By.xpath("//span[.='My Account']")).click();
		driver.findElement(By.xpath("(//*[.=\"Logout\"])[2]")).click();
		driver.quit();
	}

	@Test
	public void Sample2() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("namma");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("nimma");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abcdef1998@gmail.com");
		driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys("8710926782");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@name='confirm']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		String Actual = driver.findElement(By.xpath("(//*[@class='alert alert-danger alert-dismissible'])")).getText();
		String Expected = "Warning: E-Mail Address is already registered!";
		Assert.assertEquals(Expected, Actual);

	}

	@Test
	public void sample4() throws InterruptedException {
		driver.findElement(By.xpath("//input[@value='Continue']")).click();

		String Actualfirstname = driver
				.findElement(By.xpath("//div[.='First Name must be between 1 and 32 characters!']")).getText();
		String Expectedfirstname = "First Name must be between 1 and 32 characters!";
		Assert.assertEquals(Expectedfirstname, Actualfirstname);
		String Actuallastname = driver.findElement(By.xpath("//*[@name='lastname']/following-sibling::div")).getText();
		String Expectedlastname = "Last Name must be between 1 and 32 characters!";
		Assert.assertEquals(Expectedlastname, Actuallastname);
		String Actualemail = driver.findElement(By.xpath("//*[@name='email']/following-sibling::div")).getText();
		String Expectedemail = "E-Mail Address does not appear to be valid!";
		Assert.assertEquals(Expectedemail, Actualemail);
		String Actualtelephone = driver.findElement(By.xpath("//*[@name='telephone']/following-sibling::div"))
				.getText();
		String Expectetelephone = "Telephone must be between 3 and 32 characters!";
		Assert.assertEquals(Expectetelephone, Actualtelephone);
		Assert.assertEquals(Expectedemail, Actualemail);
		String Actualpassword = driver.findElement(By.xpath("//*[@name='password']/following-sibling::div")).getText();
		String Expectedpassword = "Password must be between 4 and 20 characters!";
		Assert.assertEquals(Expectedpassword, Actualpassword);

	}
}