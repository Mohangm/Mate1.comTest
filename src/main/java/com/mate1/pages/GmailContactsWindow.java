package com.mate1.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GmailContactsWindow {
private WebDriver driver;
	
	@FindBy(linkText="No thanks")
	WebElement linkText_nothanks;
	
	@FindBy(linkText="Yes")
	WebElement linkText_yes;
	
	
	public GmailContactsWindow(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	public Mate1ProfileHomePage closeGmailContactsWindow()
	{
		linkText_nothanks.click();
		linkText_yes.click();
		
		return new Mate1ProfileHomePage(driver);
	}
	
	
}
