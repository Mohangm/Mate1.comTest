package com.mate1.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Mate1ProfileCreationPage {
	
	private WebDriver driver;
	
	@FindBy(id="profileGender")
	WebElement cbox_profiGender;
	
	@FindBy(id="profileLookingGender")
	WebElement cbox_profileLookinggender;
	
	@FindBy(id="profileLookingMinAge")
	WebElement cbox_lookingMinAge;
	
	@FindBy(id="profileLookingMaxAge")
	WebElement cbox_lookingMaxAge;
	
	@FindBy(id="country")
	WebElement cbox_lookingCountry;
	
	@FindBy(id="cityName")
	WebElement textfld_cityName;
	
	@FindBy(id="submit")
	WebElement btn_searchForFree;
	
	@FindBy(id="nickName")
	WebElement textfld_nickName;
	
	@FindBy(id="DOBMonth")
	WebElement cbox_DOBMonth;
	
	@FindBy(id="DOBDay")
	WebElement cbox_DOBDay;
	
	@FindBy(id="DOBYear")
	WebElement cbox_DOBYear;
	
	@FindBy(id="email")
	WebElement textfld_email;
	
	@FindBy(id="emailConfirmation")
	WebElement textfld_emailConfirmation;
	
	@FindBy(id="password")
	WebElement textfld_password;
	
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btn_continue;
	
	public Mate1ProfileCreationPage(WebDriver driver)
	{
		this.driver =driver;
	}
	
	
	public TellUsAboutYourSelfPage EnterBasicDetails(String gender, String profilelokinggender, String minage, String maxAge,String country,String city,String nickname, String month, String day, String year, String email, String reemail, String paswd)
	{
		slectByText(gender,cbox_profiGender,driver);
		slectByText(profilelokinggender,cbox_profileLookinggender,driver);
		slectByText(minage,cbox_lookingMinAge,driver);
		slectByText(maxAge,cbox_lookingMaxAge,driver);
		slectByText(country,cbox_lookingCountry,driver);
		textfld_cityName.clear();
		textfld_cityName.sendKeys(city);
		btn_searchForFree.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		textfld_nickName.sendKeys(nickname);
		slectByText(month,cbox_DOBMonth,driver);
		slectByText(day,cbox_DOBDay,driver);
		slectByText(year,cbox_DOBYear,driver);
		textfld_email.sendKeys(email);
		textfld_emailConfirmation.sendKeys(reemail);
		textfld_password.sendKeys(paswd);
		btn_continue.click();
		return new TellUsAboutYourSelfPage(driver);
	}
	
	
	public void slectByText(String data,WebElement dropdown, WebDriver driver)
	{
		Select obj=new Select(dropdown);
		obj.selectByVisibleText(data);
	}
	
	
	

}
