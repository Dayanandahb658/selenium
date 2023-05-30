package Testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
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
	@Test
	public void Best1() 
	{
	 System.out.println("Best1");
	}
	@BeforeTest
	public void Best2() 
	{
		System.out.println("Best2");
	}
	@BeforeClass
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
	}