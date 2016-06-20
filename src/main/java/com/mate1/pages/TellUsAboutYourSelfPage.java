package com.mate1.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class TellUsAboutYourSelfPage {
	private WebDriver driver;
	
	@FindBy(id="headline")
	WebElement textfld_headline;
	
	@FindBy(id="education")
	WebElement cbox_education;
	
	@FindBy(id="occupation")
	WebElement cbox_occupation;
	
	@FindBy(id="relationship")
	WebElement cbox_status;
	
	@FindBy(id="income")
	WebElement cbox_income;
	
	@FindBy(id="religion")
	WebElement cbox_religion;
	
	@FindBy(id="height")
	WebElement cbox_height;
	
	@FindBy(id="ethnicity")
	WebElement cbox_ethnicity;
	
	@FindBy(id="bodyType")
	WebElement cbox_bodyType;
	
	@FindBy(id="eyeColor")
	WebElement cbox_eyeColor;
	
	@FindBy(id="hairColor")
	WebElement cbox_hairColor;
	
	@FindBy(id="smoking")
	WebElement cbox_smoking;
	
	@FindBy(id="alcohol")
	WebElement cbox_drinking;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btn_continue;
	
	@FindBy(linkText="I promise to upload a photo later")
	WebElement linkText_uploadLater;
	
	public TellUsAboutYourSelfPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void enterYourSelfDetails(String hline,String education, String occp, String status, String income, String religion, String height, String ethnicity, String btype, String eyecolor, String haircolor, String smoke, String drink)
	{
		textfld_headline.sendKeys(hline);
		slectByText(education,cbox_education,driver);
		slectByText(occp,cbox_occupation,driver);
		slectByText(status,cbox_status,driver);
		slectByText(income,cbox_income,driver);
		slectByText(religion,cbox_religion,driver);
		slectByText(height,cbox_height,driver);
		slectByText(ethnicity,cbox_ethnicity,driver);
		slectByText(btype,cbox_bodyType,driver);
		slectByText(eyecolor,cbox_eyeColor,driver);
		slectByText(haircolor,cbox_hairColor,driver);
		slectByText(smoke,cbox_smoking,driver);
		slectByText(drink,cbox_drinking,driver);
		btn_continue.click();
		
		
	}
	
	public void uploadPhotoLater()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		linkText_uploadLater.click();
	}
	public void slectByText(String data,WebElement dropdown, WebDriver driver)
	{
		Select obj=new Select(dropdown);
		obj.selectByVisibleText(data);
	}
}
