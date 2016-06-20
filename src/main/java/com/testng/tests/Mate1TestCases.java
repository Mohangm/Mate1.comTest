package com.testng.tests;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mate1.pages.GmailContactsWindow;
import com.mate1.pages.Mate1ProfileCreationPage;
import com.mate1.pages.Mate1ProfileHomePage;
import com.mate1.pages.TellUsAboutYourSelfPage;
import com.read.testdata.ReadExcelFile;

public class Mate1TestCases extends BaseTest{
	
	@Test(priority=0)
	//Creates a new profile in Mate1.com and validates the information
	public void verifyCreateProfileTest() throws IOException
	{
		String email = ReadExcelFile.getData("email").toString()+((int)(Math.random()*10000+231));
		profile = PageFactory.initElements(driver, Mate1ProfileCreationPage.class);
		tellYourSelfPage = profile.EnterBasicDetails(ReadExcelFile.getData("Gender").toString(), ReadExcelFile.getData("SeekingA").toString(), ReadExcelFile.getData("AgeMin").toString().replace(".0", "").replace(".0", ""), ReadExcelFile.getData("AgeMax").toString().replace(".0", ""), ReadExcelFile.getData("Country").toString(), ReadExcelFile.getData("City").toString(), ReadExcelFile.getData("nickName").toString(), ReadExcelFile.getData("month").toString(), ReadExcelFile.getData("day").toString().replace(".0", ""),  ReadExcelFile.getData("year").toString(), email+"@gmail.com",email+"@gmail.com",ReadExcelFile.getData("password").toString());
		tellYourSelfPage = PageFactory.initElements(driver, TellUsAboutYourSelfPage.class);
		tellYourSelfPage.enterYourSelfDetails(ReadExcelFile.getData("headline").toString(),ReadExcelFile.getData("Education").toString(),ReadExcelFile.getData("Occupation").toString(),ReadExcelFile.getData("Status").toString(),ReadExcelFile.getData("income").toString(), ReadExcelFile.getData("Religion").toString(),ReadExcelFile.getData("Height").toString(),ReadExcelFile.getData("Ethnicity:").toString(),ReadExcelFile.getData("bodyType").toString(),ReadExcelFile.getData("EyeColor").toString(),ReadExcelFile.getData("HairColor").toString(),ReadExcelFile.getData("Smoking").toString(),ReadExcelFile.getData("Drinking").toString());
		tellYourSelfPage.uploadPhotoLater();
		gamilContsWindow = PageFactory.initElements(driver, GmailContactsWindow.class);
		mate1ProfileHomePage = gamilContsWindow.closeGmailContactsWindow();
		mate1ProfileHomePage = PageFactory.initElements(driver, Mate1ProfileHomePage.class);
		Assert.assertEquals(mate1ProfileHomePage.getMyProfileLinkText(), "My Profile","Mate1 profile creation failed");
		Map<String,String>expected_pfoile_data =expectedProfileData(ReadExcelFile.getData("Education").toString(),ReadExcelFile.getData("Occupation").toString(),ReadExcelFile.getData("Status").toString(),ReadExcelFile.getData("income").toString(), ReadExcelFile.getData("Religion").toString(),ReadExcelFile.getData("Height").toString(),ReadExcelFile.getData("Ethnicity:").toString(),ReadExcelFile.getData("bodyType").toString(),ReadExcelFile.getData("EyeColor").toString(),ReadExcelFile.getData("HairColor").toString(),ReadExcelFile.getData("Smoking").toString(),ReadExcelFile.getData("Drinking").toString());
		
		mate1ProfileHomePage.navigateToViewProfile();
		Map<String,String>actual_pfoile_data = mate1ProfileHomePage.getTheInfromationInViewProfile();
		Assert.assertEquals(actual_pfoile_data, expected_pfoile_data,"Profile data is not matched");
		
		System.out.println("---User profile creation is successfully executed----------");
	}
	
	
	@Test(priority=1)
	//Created a new Mate1 profile and edits the information and checks the data is updaed correctly
	public void verifyEditingOfANewlyCreatedProfile() throws IOException
	{
		String email = ReadExcelFile.getData("email").toString()+((int)(Math.random()*10000+231));
		profile = PageFactory.initElements(driver, Mate1ProfileCreationPage.class);
		tellYourSelfPage = profile.EnterBasicDetails(ReadExcelFile.getData("Gender").toString(), ReadExcelFile.getData("SeekingA").toString(), ReadExcelFile.getData("AgeMin").toString().replace(".0", "").replace(".0", ""), ReadExcelFile.getData("AgeMax").toString().replace(".0", ""), ReadExcelFile.getData("Country").toString(), ReadExcelFile.getData("City").toString(), ReadExcelFile.getData("nickName").toString(), ReadExcelFile.getData("month").toString(), ReadExcelFile.getData("day").toString().replace(".0", ""),  ReadExcelFile.getData("year").toString(), email+"@gmail.com",email+"@gmail.com",ReadExcelFile.getData("password").toString());
		tellYourSelfPage = PageFactory.initElements(driver, TellUsAboutYourSelfPage.class);
		tellYourSelfPage.enterYourSelfDetails(ReadExcelFile.getData("headline").toString(),ReadExcelFile.getData("Education").toString(),ReadExcelFile.getData("Occupation").toString(),ReadExcelFile.getData("Status").toString(),ReadExcelFile.getData("income").toString(), ReadExcelFile.getData("Religion").toString(),ReadExcelFile.getData("Height").toString(),ReadExcelFile.getData("Ethnicity:").toString(),ReadExcelFile.getData("bodyType").toString(),ReadExcelFile.getData("EyeColor").toString(),ReadExcelFile.getData("HairColor").toString(),ReadExcelFile.getData("Smoking").toString(),ReadExcelFile.getData("Drinking").toString());
		tellYourSelfPage.uploadPhotoLater();
		gamilContsWindow = PageFactory.initElements(driver, GmailContactsWindow.class);
		mate1ProfileHomePage = gamilContsWindow.closeGmailContactsWindow();
		mate1ProfileHomePage = PageFactory.initElements(driver, Mate1ProfileHomePage.class);
		Assert.assertEquals(mate1ProfileHomePage.getMyProfileLinkText(), "My Profile","Mate1 profile creation failed");
		mate1ProfileHomePage.navigateToEditProfileView();
		mate1ProfileHomePage.editBasicProfileInformation("Graduate degree", "Accountant", "Single", "$50,000-$100,000", "Hindu", "5ft. 7in.","Asian", "Slim", "Brown", "Black", "Never", "Never");
		Map<String,String>expected_pfoile_data =expectedProfileData("Graduate degree", "Accountant", "Single", "$50,000-$100,000", "Hindu", "5ft. 7in.","Asian", "Slim", "Brown", "Black", "Never", "Never");
        Map<String,String>actual_pfoile_data = mate1ProfileHomePage.getTheInfromationInViewProfile();
		Assert.assertEquals(actual_pfoile_data, expected_pfoile_data,"Profile data is not updated correctly");
		System.out.println("---User profile editing is successfully executed----------");
	}
	
	public Map<String,String> expectedProfileData(String education, String occp, String status, String income, String religion, String height, String ethnicity, String btype, String eyecolor, String haircolor, String smoke, String drink)
	{
		Map<String,String> expected_profile_data = new TreeMap<String,String>();
		expected_profile_data.put("Ethnicity", ethnicity);
		expected_profile_data.put("Height", height);
		expected_profile_data.put("Body Type", btype);
		expected_profile_data.put("Hair Color", haircolor);
		expected_profile_data.put("Eye Color", eyecolor);
		expected_profile_data.put("Relationship Status", status);
		expected_profile_data.put("Sign", "Aquarius");
		expected_profile_data.put("Occupation", occp);
		expected_profile_data.put("Education", education);
		expected_profile_data.put("Annual Income", income);
		expected_profile_data.put("Smokes", smoke);
		expected_profile_data.put("Drinks", drink);
		expected_profile_data.put("Religion",religion);
		return expected_profile_data;
	}

}
