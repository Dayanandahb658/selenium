package com.tutorialsninja.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{
	WebDriver driver;
  @FindBy(xpath="//span[.='My Account']")
   private WebElement myAccountDropmenu;
  
  @FindBy(xpath = "//a[.='Login']")
  private WebElement loginOption;
  
  
  @FindBy(xpath = "//*[@name='email']")
  private WebElement email;
  
  public Homepage(WebDriver driver) 
  
  {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
  }
  
  
  public void clickonMyAccount()
  {
	  myAccountDropmenu.click();  
  }
  
  public void selectloginoption()

{
	  loginOption.click();	  
}
  public void email()
  {
	  email.sendKeys("abcdef1998@gmail.com");
  }
}
