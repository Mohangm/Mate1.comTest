package com.mate1.pages;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Mate1ProfileHomePage {

private WebDriver driver;
	
	@FindBy(linkText="My Profile")
	WebElement linkText_myProfile;
	
	@FindBy(linkText="View Profile")
	WebElement linkText_viewprofile;
	
	@FindBy(linkText="Edit my profile")
	WebElement linkText_editprofile;
	
	@FindBy(linkText="I'll do it later")
	WebElement linkText_I_will_do_it_later;
	
	@FindBy(className="profileInformationRight")
	WebElement div_profileinformation;
	
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
	
	@FindBy(id="submit_basic_information")
	WebElement btn_save_basic_information;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btn_continue;
	
	
	public Mate1ProfileHomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String getMyProfileLinkText()
	{
		return linkText_myProfile.getText();
	}
	
	public Mate1ProfileHomePage navigateToViewProfile()
	{
		Actions obj=new Actions(driver);
		obj.moveToElement(linkText_myProfile).moveToElement(linkText_viewprofile)
		.click().build().perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		linkText_I_will_do_it_later.click();
		return this;
	}
	
	public Mate1ProfileHomePage navigateToEditProfileView()
	{
		Actions obj=new Actions(driver);
		obj.moveToElement(linkText_myProfile).moveToElement(linkText_editprofile)
		.click().build().perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return this;
	}
	
	public Map<String,String> getTheInfromationInViewProfile()
	{
		String array[]={"Ethnicity","Height","Body Type","Hair Color",
				"Eye Color","Relationship Status","Have children?"
				,"Want (more) children?","Religion","Field of Study",
				"Sign","Occupation","Education","Annual Income",
				"Smokes","Drinks"};
		
		Map<String,String> view_profile_details = new TreeMap<String,String>();
		int j = 0;
		for(int i=2;i<=32;i++)
		{
			if(i%2==0){
			view_profile_details.put(array[j], driver.findElement(By.xpath("//*[@id='basic_information']/ul/li["+i+"]")).getText());
			j++;
			}
			i++;
			
		}
		view_profile_details.remove("Want (more) children?");
		view_profile_details.remove("Field of Study");
		view_profile_details.remove("Have children?");
	     return view_profile_details;
	}
	
	
	public Mate1ProfileHomePage editBasicProfileInformation(String education, String occp, String status, String income, String religion, String height, String ethnicity, String btype, String eyecolor, String haircolor, String smoke, String drink)
	{
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
		btn_save_basic_information.click();
		return this;
	}
	
	public void slectByText(String data,WebElement dropdown, WebDriver driver)
	{
		Select obj=new Select(dropdown);
		obj.selectByVisibleText(data);
	}

}
