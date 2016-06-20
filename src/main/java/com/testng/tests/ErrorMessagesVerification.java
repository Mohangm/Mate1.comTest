package com.testng.tests;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.mate1.pages.Mate1ProfileCreationPage;
import com.mate1.pages.TellUsAboutYourSelfPage;
import com.read.testdata.ReadExcelFile;

public class ErrorMessagesVerification extends BaseTest{
	@Test(priority=2)
	public void verifyNickNameMissingError() throws IOException
	{
		String email = ReadExcelFile.getData("email").toString()+((int)(Math.random()*10000+231));
		profile = PageFactory.initElements(driver, Mate1ProfileCreationPage.class);
		tellYourSelfPage = profile.EnterBasicDetails(ReadExcelFile.getData("Gender").toString(), ReadExcelFile.getData("SeekingA").toString(), ReadExcelFile.getData("AgeMin").toString().replace(".0", "").replace(".0", ""), ReadExcelFile.getData("AgeMax").toString().replace(".0", ""), ReadExcelFile.getData("Country").toString(), ReadExcelFile.getData("City").toString(),"", ReadExcelFile.getData("month").toString(), ReadExcelFile.getData("day").toString().replace(".0", ""),  ReadExcelFile.getData("year").toString(), email+"@gmail.com",email+"@gmail.com",ReadExcelFile.getData("password").toString());
        String actual_error_message = driver.findElement(By.xpath("//*[@id='error_list']/li")).getText();
		Assert.assertEquals(actual_error_message,"Please enter a nickname that uses only letters, numbers and underscores.","Nick name missing error verification failed");
	   System.out.println("--------------------------------------------------");
	   System.out.println(actual_error_message);
	   System.out.println("Nick name missing error verified successfully");
	   System.out.println("--------------------------------------------------");
	}
	
	
	@Test(priority=3)
	public void verifyDateOfBirthMissingError() throws IOException
	{
		String email = ReadExcelFile.getData("email").toString()+((int)(Math.random()*10000+231));
		profile = PageFactory.initElements(driver, Mate1ProfileCreationPage.class);
		tellYourSelfPage = profile.EnterBasicDetails(ReadExcelFile.getData("Gender").toString(), ReadExcelFile.getData("SeekingA").toString(), ReadExcelFile.getData("AgeMin").toString().replace(".0", "").replace(".0", ""), ReadExcelFile.getData("AgeMax").toString().replace(".0", ""), ReadExcelFile.getData("Country").toString(), ReadExcelFile.getData("City").toString(),ReadExcelFile.getData("nickName").toString(),"Month", ReadExcelFile.getData("day").toString().replace(".0", ""),  ReadExcelFile.getData("year").toString(), email+"@gmail.com",email+"@gmail.com",ReadExcelFile.getData("password").toString());
        String actual_error_message = driver.findElement(By.xpath("//*[@id='error_list']/li")).getText();
		Assert.assertEquals(actual_error_message,"Date of birth is invalid","Date of birth missing error verification failed");
	   System.out.println("--------------------------------------------------");
	   System.out.println(actual_error_message);
	   System.out.println("Date of birth missing error verified successfully");
	   System.out.println("--------------------------------------------------");
	}
	
	@Test(priority=4)
	public void verifyEmailMissingError() throws IOException
	{
		String email = ReadExcelFile.getData("email").toString()+((int)(Math.random()*10000+231));
		profile = PageFactory.initElements(driver, Mate1ProfileCreationPage.class);
		tellYourSelfPage = profile.EnterBasicDetails(ReadExcelFile.getData("Gender").toString(), ReadExcelFile.getData("SeekingA").toString(), ReadExcelFile.getData("AgeMin").toString().replace(".0", "").replace(".0", ""), ReadExcelFile.getData("AgeMax").toString().replace(".0", ""), ReadExcelFile.getData("Country").toString(), ReadExcelFile.getData("City").toString(),ReadExcelFile.getData("nickName").toString(),ReadExcelFile.getData("month").toString(), ReadExcelFile.getData("day").toString().replace(".0", ""),  ReadExcelFile.getData("year").toString(),"",email+"@gmail.com",ReadExcelFile.getData("password").toString());
        String actual_error_message = driver.findElement(By.xpath("//*[@id='error_list']/li")).getText();
		Assert.assertEquals(actual_error_message,"Email and Email Confirmation must match.","email missing error verification failed");
	   System.out.println("--------------------------------------------------");
	   System.out.println(actual_error_message);
	   System.out.println("Email missing error verified successfully");
	   System.out.println("--------------------------------------------------");
	}
	
	@Test(priority=5)
	public void verifyConfirmEmailMissingError() throws IOException
	{
		String email = ReadExcelFile.getData("email").toString()+((int)(Math.random()*10000+231));
		profile = PageFactory.initElements(driver, Mate1ProfileCreationPage.class);
		tellYourSelfPage = profile.EnterBasicDetails(ReadExcelFile.getData("Gender").toString(), ReadExcelFile.getData("SeekingA").toString(), ReadExcelFile.getData("AgeMin").toString().replace(".0", "").replace(".0", ""), ReadExcelFile.getData("AgeMax").toString().replace(".0", ""), ReadExcelFile.getData("Country").toString(), ReadExcelFile.getData("City").toString(),ReadExcelFile.getData("nickName").toString(),ReadExcelFile.getData("month").toString(), ReadExcelFile.getData("day").toString().replace(".0", ""),  ReadExcelFile.getData("year").toString(),email+"@gmail.com","",ReadExcelFile.getData("password").toString());
        String actual_error_message = driver.findElement(By.xpath("//*[@id='error_list']/li")).getText();
		Assert.assertEquals(actual_error_message,"Email and Email Confirmation must match.","Confirm email missing error verification failed");
	   System.out.println("--------------------------------------------------");
	   System.out.println(actual_error_message);
	   System.out.println("Cofirm Email missing error verified successfully");
	   System.out.println("--------------------------------------------------");
	}
	
	@Test(priority=6)
	public void verifyPasswordMissingError() throws IOException
	{
		String email = ReadExcelFile.getData("email").toString()+((int)(Math.random()*10000+231));
		profile = PageFactory.initElements(driver, Mate1ProfileCreationPage.class);
		tellYourSelfPage = profile.EnterBasicDetails(ReadExcelFile.getData("Gender").toString(), ReadExcelFile.getData("SeekingA").toString(), ReadExcelFile.getData("AgeMin").toString().replace(".0", "").replace(".0", ""), ReadExcelFile.getData("AgeMax").toString().replace(".0", ""), ReadExcelFile.getData("Country").toString(), ReadExcelFile.getData("City").toString(),ReadExcelFile.getData("nickName").toString(),ReadExcelFile.getData("month").toString(), ReadExcelFile.getData("day").toString().replace(".0", ""),  ReadExcelFile.getData("year").toString(),email+"@gmail.com",email+"@gmail.com","");
        String actual_error_message = driver.findElement(By.xpath("//*[@id='error_list']/li")).getText();
		Assert.assertEquals(actual_error_message,"Password cannot be empty","Password missing error verification failed");
	   System.out.println("--------------------------------------------------");
	   System.out.println(actual_error_message);
	   System.out.println("Password missing error verified successfully");
	   System.out.println("--------------------------------------------------");
	}
	
	
	@Test(priority=7)
	public void HeadLineMissingError() throws IOException
	{
		String email = ReadExcelFile.getData("email").toString()+((int)(Math.random()*10000+231));
		profile = PageFactory.initElements(driver, Mate1ProfileCreationPage.class);
		tellYourSelfPage = profile.EnterBasicDetails(ReadExcelFile.getData("Gender").toString(), ReadExcelFile.getData("SeekingA").toString(), ReadExcelFile.getData("AgeMin").toString().replace(".0", "").replace(".0", ""), ReadExcelFile.getData("AgeMax").toString().replace(".0", ""), ReadExcelFile.getData("Country").toString(), ReadExcelFile.getData("City").toString(), ReadExcelFile.getData("nickName").toString(), ReadExcelFile.getData("month").toString(), ReadExcelFile.getData("day").toString().replace(".0", ""),  ReadExcelFile.getData("year").toString(), email+"@gmail.com",email+"@gmail.com",ReadExcelFile.getData("password").toString());
		tellYourSelfPage = PageFactory.initElements(driver, TellUsAboutYourSelfPage.class);
		tellYourSelfPage.enterYourSelfDetails("",ReadExcelFile.getData("Education").toString(),ReadExcelFile.getData("Occupation").toString(),ReadExcelFile.getData("Status").toString(),ReadExcelFile.getData("income").toString(), ReadExcelFile.getData("Religion").toString(),ReadExcelFile.getData("Height").toString(),ReadExcelFile.getData("Ethnicity:").toString(),ReadExcelFile.getData("bodyType").toString(),ReadExcelFile.getData("EyeColor").toString(),ReadExcelFile.getData("HairColor").toString(),ReadExcelFile.getData("Smoking").toString(),ReadExcelFile.getData("Drinking").toString());
		String actual_error_message = driver.findElement(By.xpath("//*[@id='error_list']/li")).getText();
		Assert.assertEquals(actual_error_message,"The title contains invalid characters.","HeadLine missing error verification failed");
		System.out.println("--------------------------------------------------");
		System.out.println(actual_error_message);
		System.out.println("HeadLine missing error verified successfully");
		System.out.println("--------------------------------------------------");
	}
	
	@Test(priority=8)
	public void EducationMissingError() throws IOException
	{
		String email = ReadExcelFile.getData("email").toString()+((int)(Math.random()*10000+231));
		profile = PageFactory.initElements(driver, Mate1ProfileCreationPage.class);
		tellYourSelfPage = profile.EnterBasicDetails(ReadExcelFile.getData("Gender").toString(), ReadExcelFile.getData("SeekingA").toString(), ReadExcelFile.getData("AgeMin").toString().replace(".0", "").replace(".0", ""), ReadExcelFile.getData("AgeMax").toString().replace(".0", ""), ReadExcelFile.getData("Country").toString(), ReadExcelFile.getData("City").toString(), ReadExcelFile.getData("nickName").toString(), ReadExcelFile.getData("month").toString(), ReadExcelFile.getData("day").toString().replace(".0", ""),  ReadExcelFile.getData("year").toString(), email+"@gmail.com",email+"@gmail.com",ReadExcelFile.getData("password").toString());
		tellYourSelfPage = PageFactory.initElements(driver, TellUsAboutYourSelfPage.class);
		tellYourSelfPage.enterYourSelfDetails(ReadExcelFile.getData("headline").toString(),"---------",ReadExcelFile.getData("Occupation").toString(),ReadExcelFile.getData("Status").toString(),ReadExcelFile.getData("income").toString(), ReadExcelFile.getData("Religion").toString(),ReadExcelFile.getData("Height").toString(),ReadExcelFile.getData("Ethnicity:").toString(),ReadExcelFile.getData("bodyType").toString(),ReadExcelFile.getData("EyeColor").toString(),ReadExcelFile.getData("HairColor").toString(),ReadExcelFile.getData("Smoking").toString(),ReadExcelFile.getData("Drinking").toString());
		String actual_error_message = driver.findElement(By.xpath("//*[@id='error_list']/li")).getText();
		Assert.assertEquals(actual_error_message,"Please select an education.","Education missing error verification failed");
		System.out.println("--------------------------------------------------");
		System.out.println(actual_error_message);
		System.out.println("Education missing error verified successfully");
		System.out.println("--------------------------------------------------");	
	}
	
	@Test(priority=9)
	public void OccupationMissingError() throws IOException
	{
		String email = ReadExcelFile.getData("email").toString()+((int)(Math.random()*10000+231));
		profile = PageFactory.initElements(driver, Mate1ProfileCreationPage.class);
		tellYourSelfPage = profile.EnterBasicDetails(ReadExcelFile.getData("Gender").toString(), ReadExcelFile.getData("SeekingA").toString(), ReadExcelFile.getData("AgeMin").toString().replace(".0", "").replace(".0", ""), ReadExcelFile.getData("AgeMax").toString().replace(".0", ""), ReadExcelFile.getData("Country").toString(), ReadExcelFile.getData("City").toString(), ReadExcelFile.getData("nickName").toString(), ReadExcelFile.getData("month").toString(), ReadExcelFile.getData("day").toString().replace(".0", ""),  ReadExcelFile.getData("year").toString(), email+"@gmail.com",email+"@gmail.com",ReadExcelFile.getData("password").toString());
		tellYourSelfPage = PageFactory.initElements(driver, TellUsAboutYourSelfPage.class);
		tellYourSelfPage.enterYourSelfDetails(ReadExcelFile.getData("headline").toString(),ReadExcelFile.getData("Education").toString(),"---------",ReadExcelFile.getData("Status").toString(),ReadExcelFile.getData("income").toString(), ReadExcelFile.getData("Religion").toString(),ReadExcelFile.getData("Height").toString(),ReadExcelFile.getData("Ethnicity:").toString(),ReadExcelFile.getData("bodyType").toString(),ReadExcelFile.getData("EyeColor").toString(),ReadExcelFile.getData("HairColor").toString(),ReadExcelFile.getData("Smoking").toString(),ReadExcelFile.getData("Drinking").toString());
		String actual_error_message = driver.findElement(By.xpath("//*[@id='error_list']/li")).getText();
		Assert.assertEquals(actual_error_message,"Please select a occupation.","Occupation missing error verification failed");
		System.out.println("--------------------------------------------------");
		System.out.println(actual_error_message);
		System.out.println("Occupation missing error verified successfully");
		System.out.println("--------------------------------------------------");	
	}
	
	
	@Test(priority=10)
	public void StatusMissingError() throws IOException
	{
		String email = ReadExcelFile.getData("email").toString()+((int)(Math.random()*10000+231));
		profile = PageFactory.initElements(driver, Mate1ProfileCreationPage.class);
		tellYourSelfPage = profile.EnterBasicDetails(ReadExcelFile.getData("Gender").toString(), ReadExcelFile.getData("SeekingA").toString(), ReadExcelFile.getData("AgeMin").toString().replace(".0", "").replace(".0", ""), ReadExcelFile.getData("AgeMax").toString().replace(".0", ""), ReadExcelFile.getData("Country").toString(), ReadExcelFile.getData("City").toString(), ReadExcelFile.getData("nickName").toString(), ReadExcelFile.getData("month").toString(), ReadExcelFile.getData("day").toString().replace(".0", ""),  ReadExcelFile.getData("year").toString(), email+"@gmail.com",email+"@gmail.com",ReadExcelFile.getData("password").toString());
		tellYourSelfPage = PageFactory.initElements(driver, TellUsAboutYourSelfPage.class);
		tellYourSelfPage.enterYourSelfDetails(ReadExcelFile.getData("headline").toString(),ReadExcelFile.getData("Education").toString(),ReadExcelFile.getData("Occupation").toString(),"---------",ReadExcelFile.getData("income").toString(), ReadExcelFile.getData("Religion").toString(),ReadExcelFile.getData("Height").toString(),ReadExcelFile.getData("Ethnicity:").toString(),ReadExcelFile.getData("bodyType").toString(),ReadExcelFile.getData("EyeColor").toString(),ReadExcelFile.getData("HairColor").toString(),ReadExcelFile.getData("Smoking").toString(),ReadExcelFile.getData("Drinking").toString());
       String actual_error_message = driver.findElement(By.xpath("//*[@id='error_list']/li")).getText();
		Assert.assertEquals(actual_error_message,"Please select your relationship status.","Status missing error verification failed");
		System.out.println("--------------------------------------------------");
		System.out.println(actual_error_message);
		System.out.println("staus missing error verified successfully");
		System.out.println("--------------------------------------------------");
	}
	
	
	@Test(priority=11)
	public void IncomeMissingError() throws IOException
	{
		String email = ReadExcelFile.getData("email").toString()+((int)(Math.random()*10000+231));
		profile = PageFactory.initElements(driver, Mate1ProfileCreationPage.class);
		tellYourSelfPage = profile.EnterBasicDetails(ReadExcelFile.getData("Gender").toString(), ReadExcelFile.getData("SeekingA").toString(), ReadExcelFile.getData("AgeMin").toString().replace(".0", "").replace(".0", ""), ReadExcelFile.getData("AgeMax").toString().replace(".0", ""), ReadExcelFile.getData("Country").toString(), ReadExcelFile.getData("City").toString(), ReadExcelFile.getData("nickName").toString(), ReadExcelFile.getData("month").toString(), ReadExcelFile.getData("day").toString().replace(".0", ""),  ReadExcelFile.getData("year").toString(), email+"@gmail.com",email+"@gmail.com",ReadExcelFile.getData("password").toString());
		tellYourSelfPage = PageFactory.initElements(driver, TellUsAboutYourSelfPage.class);
		tellYourSelfPage.enterYourSelfDetails(ReadExcelFile.getData("headline").toString(),ReadExcelFile.getData("Education").toString(),ReadExcelFile.getData("Occupation").toString(),ReadExcelFile.getData("Status").toString(),"---------", ReadExcelFile.getData("Religion").toString(),ReadExcelFile.getData("Height").toString(),ReadExcelFile.getData("Ethnicity:").toString(),ReadExcelFile.getData("bodyType").toString(),ReadExcelFile.getData("EyeColor").toString(),ReadExcelFile.getData("HairColor").toString(),ReadExcelFile.getData("Smoking").toString(),ReadExcelFile.getData("Drinking").toString());
         String actual_error_message = driver.findElement(By.xpath("//*[@id='error_list']/li")).getText();
		Assert.assertEquals(actual_error_message,"Please select your income.","Income missing error verification failed");
		System.out.println("--------------------------------------------------");
		System.out.println(actual_error_message);
		System.out.println("Income missing error verified successfully");
		System.out.println("--------------------------------------------------");
	}
	
	@Test(priority=12)
	public void ReligionMissingError() throws IOException
	{
		String email = ReadExcelFile.getData("email").toString()+((int)(Math.random()*10000+231));
		profile = PageFactory.initElements(driver, Mate1ProfileCreationPage.class);
		tellYourSelfPage = profile.EnterBasicDetails(ReadExcelFile.getData("Gender").toString(), ReadExcelFile.getData("SeekingA").toString(), ReadExcelFile.getData("AgeMin").toString().replace(".0", "").replace(".0", ""), ReadExcelFile.getData("AgeMax").toString().replace(".0", ""), ReadExcelFile.getData("Country").toString(), ReadExcelFile.getData("City").toString(), ReadExcelFile.getData("nickName").toString(), ReadExcelFile.getData("month").toString(), ReadExcelFile.getData("day").toString().replace(".0", ""),  ReadExcelFile.getData("year").toString(), email+"@gmail.com",email+"@gmail.com",ReadExcelFile.getData("password").toString());
		tellYourSelfPage = PageFactory.initElements(driver, TellUsAboutYourSelfPage.class);
		tellYourSelfPage.enterYourSelfDetails(ReadExcelFile.getData("headline").toString(),ReadExcelFile.getData("Education").toString(),ReadExcelFile.getData("Occupation").toString(),ReadExcelFile.getData("Status").toString(),ReadExcelFile.getData("income").toString(), "---------",ReadExcelFile.getData("Height").toString(),ReadExcelFile.getData("Ethnicity:").toString(),ReadExcelFile.getData("bodyType").toString(),ReadExcelFile.getData("EyeColor").toString(),ReadExcelFile.getData("HairColor").toString(),ReadExcelFile.getData("Smoking").toString(),ReadExcelFile.getData("Drinking").toString());
         String actual_error_message = driver.findElement(By.xpath("//*[@id='error_list']/li")).getText();
		Assert.assertEquals(actual_error_message,"Please select a religion.","Religion missing error verification failed");
		System.out.println("--------------------------------------------------");
		System.out.println(actual_error_message);
		System.out.println("Religion missing error verified successfully");
		System.out.println("--------------------------------------------------");
	}
	
	@Test(priority=13)
	public void HeightMissingError() throws IOException
	{
		String email = ReadExcelFile.getData("email").toString()+((int)(Math.random()*10000+231));
		profile = PageFactory.initElements(driver, Mate1ProfileCreationPage.class);
		tellYourSelfPage = profile.EnterBasicDetails(ReadExcelFile.getData("Gender").toString(), ReadExcelFile.getData("SeekingA").toString(), ReadExcelFile.getData("AgeMin").toString().replace(".0", "").replace(".0", ""), ReadExcelFile.getData("AgeMax").toString().replace(".0", ""), ReadExcelFile.getData("Country").toString(), ReadExcelFile.getData("City").toString(), ReadExcelFile.getData("nickName").toString(), ReadExcelFile.getData("month").toString(), ReadExcelFile.getData("day").toString().replace(".0", ""),  ReadExcelFile.getData("year").toString(), email+"@gmail.com",email+"@gmail.com",ReadExcelFile.getData("password").toString());
		tellYourSelfPage = PageFactory.initElements(driver, TellUsAboutYourSelfPage.class);
		tellYourSelfPage.enterYourSelfDetails(ReadExcelFile.getData("headline").toString(),ReadExcelFile.getData("Education").toString(),ReadExcelFile.getData("Occupation").toString(),ReadExcelFile.getData("Status").toString(),ReadExcelFile.getData("income").toString(), ReadExcelFile.getData("Religion").toString(),"---------",ReadExcelFile.getData("Ethnicity:").toString(),ReadExcelFile.getData("bodyType").toString(),ReadExcelFile.getData("EyeColor").toString(),ReadExcelFile.getData("HairColor").toString(),ReadExcelFile.getData("Smoking").toString(),ReadExcelFile.getData("Drinking").toString());
        String actual_error_message = driver.findElement(By.xpath("//*[@id='error_list']/li")).getText();
		Assert.assertEquals(actual_error_message,"Please select a height.","Height missing error verification failed");
		System.out.println("--------------------------------------------------");
		System.out.println(actual_error_message);
		System.out.println("Height missing error verified successfully");
		System.out.println("--------------------------------------------------");
		
	}
	
	
	@Test(priority=14)
	public void ethnicityMissingError() throws IOException
	{
		String email = ReadExcelFile.getData("email").toString()+((int)(Math.random()*10000+231));
		profile = PageFactory.initElements(driver, Mate1ProfileCreationPage.class);
		tellYourSelfPage = profile.EnterBasicDetails(ReadExcelFile.getData("Gender").toString(), ReadExcelFile.getData("SeekingA").toString(), ReadExcelFile.getData("AgeMin").toString().replace(".0", "").replace(".0", ""), ReadExcelFile.getData("AgeMax").toString().replace(".0", ""), ReadExcelFile.getData("Country").toString(), ReadExcelFile.getData("City").toString(), ReadExcelFile.getData("nickName").toString(), ReadExcelFile.getData("month").toString(), ReadExcelFile.getData("day").toString().replace(".0", ""),  ReadExcelFile.getData("year").toString(), email+"@gmail.com",email+"@gmail.com",ReadExcelFile.getData("password").toString());
		tellYourSelfPage = PageFactory.initElements(driver, TellUsAboutYourSelfPage.class);
		tellYourSelfPage.enterYourSelfDetails(ReadExcelFile.getData("headline").toString(),ReadExcelFile.getData("Education").toString(),ReadExcelFile.getData("Occupation").toString(),ReadExcelFile.getData("Status").toString(),ReadExcelFile.getData("income").toString(), ReadExcelFile.getData("Religion").toString(),ReadExcelFile.getData("Height").toString(),"---------",ReadExcelFile.getData("bodyType").toString(),ReadExcelFile.getData("EyeColor").toString(),ReadExcelFile.getData("HairColor").toString(),ReadExcelFile.getData("Smoking").toString(),ReadExcelFile.getData("Drinking").toString());
       String actual_error_message = driver.findElement(By.xpath("//*[@id='error_list']/li")).getText();
		Assert.assertEquals(actual_error_message,"Please select an ethnicity.","Ethnicity missing error verification failed");
		System.out.println("--------------------------------------------------");
		System.out.println(actual_error_message);
		System.out.println("Ethnicity missing error verified successfully");
		System.out.println("--------------------------------------------------");
		
	}
	
	@Test(priority=15)
	public void bodyTypeMissingError() throws IOException
	{
		String email = ReadExcelFile.getData("email").toString()+((int)(Math.random()*10000+231));
		profile = PageFactory.initElements(driver, Mate1ProfileCreationPage.class);
		tellYourSelfPage = profile.EnterBasicDetails(ReadExcelFile.getData("Gender").toString(), ReadExcelFile.getData("SeekingA").toString(), ReadExcelFile.getData("AgeMin").toString().replace(".0", "").replace(".0", ""), ReadExcelFile.getData("AgeMax").toString().replace(".0", ""), ReadExcelFile.getData("Country").toString(), ReadExcelFile.getData("City").toString(), ReadExcelFile.getData("nickName").toString(), ReadExcelFile.getData("month").toString(), ReadExcelFile.getData("day").toString().replace(".0", ""),  ReadExcelFile.getData("year").toString(), email+"@gmail.com",email+"@gmail.com",ReadExcelFile.getData("password").toString());
		tellYourSelfPage = PageFactory.initElements(driver, TellUsAboutYourSelfPage.class);
		tellYourSelfPage.enterYourSelfDetails(ReadExcelFile.getData("headline").toString(),ReadExcelFile.getData("Education").toString(),ReadExcelFile.getData("Occupation").toString(),ReadExcelFile.getData("Status").toString(),ReadExcelFile.getData("income").toString(), ReadExcelFile.getData("Religion").toString(),ReadExcelFile.getData("Height").toString(),ReadExcelFile.getData("Ethnicity:").toString(),"---------",ReadExcelFile.getData("EyeColor").toString(),ReadExcelFile.getData("HairColor").toString(),ReadExcelFile.getData("Smoking").toString(),ReadExcelFile.getData("Drinking").toString());
       String actual_error_message = driver.findElement(By.xpath("//*[@id='error_list']/li")).getText();
		Assert.assertEquals(actual_error_message,"Please select a body type.","Bodytype missing error verification failed");
		System.out.println("--------------------------------------------------");
		System.out.println(actual_error_message);
		System.out.println("BodyType missing error verified successfully");
		System.out.println("--------------------------------------------------");
		
	}
	
	@Test(priority=16)
	public void eyeColorMissingError() throws IOException
	{
		String email = ReadExcelFile.getData("email").toString()+((int)(Math.random()*10000+231));
		profile = PageFactory.initElements(driver, Mate1ProfileCreationPage.class);
		tellYourSelfPage = profile.EnterBasicDetails(ReadExcelFile.getData("Gender").toString(), ReadExcelFile.getData("SeekingA").toString(), ReadExcelFile.getData("AgeMin").toString().replace(".0", "").replace(".0", ""), ReadExcelFile.getData("AgeMax").toString().replace(".0", ""), ReadExcelFile.getData("Country").toString(), ReadExcelFile.getData("City").toString(), ReadExcelFile.getData("nickName").toString(), ReadExcelFile.getData("month").toString(), ReadExcelFile.getData("day").toString().replace(".0", ""),  ReadExcelFile.getData("year").toString(), email+"@gmail.com",email+"@gmail.com",ReadExcelFile.getData("password").toString());
		tellYourSelfPage = PageFactory.initElements(driver, TellUsAboutYourSelfPage.class);
		tellYourSelfPage.enterYourSelfDetails(ReadExcelFile.getData("headline").toString(),ReadExcelFile.getData("Education").toString(),ReadExcelFile.getData("Occupation").toString(),ReadExcelFile.getData("Status").toString(),ReadExcelFile.getData("income").toString(), ReadExcelFile.getData("Religion").toString(),ReadExcelFile.getData("Height").toString(),ReadExcelFile.getData("Ethnicity:").toString(),ReadExcelFile.getData("bodyType").toString(),"---------",ReadExcelFile.getData("HairColor").toString(),ReadExcelFile.getData("Smoking").toString(),ReadExcelFile.getData("Drinking").toString());
         String actual_error_message = driver.findElement(By.xpath("//*[@id='error_list']/li")).getText();
		Assert.assertEquals(actual_error_message,"Please select an eye color.","Eye color missing error verification failed");
		System.out.println("--------------------------------------------------");
		System.out.println(actual_error_message);
		System.out.println("Eye color missing error verified successfully");
		System.out.println("--------------------------------------------------");
		
	}
	
	@Test(priority=17)
	public void hairColorMissingError() throws IOException
	{
		String email = ReadExcelFile.getData("email").toString()+((int)(Math.random()*10000+231));
		profile = PageFactory.initElements(driver, Mate1ProfileCreationPage.class);
		tellYourSelfPage = profile.EnterBasicDetails(ReadExcelFile.getData("Gender").toString(), ReadExcelFile.getData("SeekingA").toString(), ReadExcelFile.getData("AgeMin").toString().replace(".0", "").replace(".0", ""), ReadExcelFile.getData("AgeMax").toString().replace(".0", ""), ReadExcelFile.getData("Country").toString(), ReadExcelFile.getData("City").toString(), ReadExcelFile.getData("nickName").toString(), ReadExcelFile.getData("month").toString(), ReadExcelFile.getData("day").toString().replace(".0", ""),  ReadExcelFile.getData("year").toString(), email+"@gmail.com",email+"@gmail.com",ReadExcelFile.getData("password").toString());
		tellYourSelfPage = PageFactory.initElements(driver, TellUsAboutYourSelfPage.class);
		tellYourSelfPage.enterYourSelfDetails(ReadExcelFile.getData("headline").toString(),ReadExcelFile.getData("Education").toString(),ReadExcelFile.getData("Occupation").toString(),ReadExcelFile.getData("Status").toString(),ReadExcelFile.getData("income").toString(), ReadExcelFile.getData("Religion").toString(),ReadExcelFile.getData("Height").toString(),ReadExcelFile.getData("Ethnicity:").toString(),ReadExcelFile.getData("bodyType").toString(),ReadExcelFile.getData("EyeColor").toString(),"---------"	,ReadExcelFile.getData("Smoking").toString(),ReadExcelFile.getData("Drinking").toString());
        String actual_error_message = driver.findElement(By.xpath("//*[@id='error_list']/li")).getText();
		Assert.assertEquals(actual_error_message,"Please select a hair color.","Hair color missing error verification failed");
		System.out.println("--------------------------------------------------");
		System.out.println(actual_error_message);
		System.out.println("Hair color missing error verified successfully");
		System.out.println("--------------------------------------------------");
		
	}
	
	@Test(priority=18)
	public void smokingMissingError() throws IOException
	{
		String email = ReadExcelFile.getData("email").toString()+((int)(Math.random()*10000+231));
		profile = PageFactory.initElements(driver, Mate1ProfileCreationPage.class);
		tellYourSelfPage = profile.EnterBasicDetails(ReadExcelFile.getData("Gender").toString(), ReadExcelFile.getData("SeekingA").toString(), ReadExcelFile.getData("AgeMin").toString().replace(".0", "").replace(".0", ""), ReadExcelFile.getData("AgeMax").toString().replace(".0", ""), ReadExcelFile.getData("Country").toString(), ReadExcelFile.getData("City").toString(), ReadExcelFile.getData("nickName").toString(), ReadExcelFile.getData("month").toString(), ReadExcelFile.getData("day").toString().replace(".0", ""),  ReadExcelFile.getData("year").toString(), email+"@gmail.com",email+"@gmail.com",ReadExcelFile.getData("password").toString());
		tellYourSelfPage = PageFactory.initElements(driver, TellUsAboutYourSelfPage.class);
		tellYourSelfPage.enterYourSelfDetails(ReadExcelFile.getData("headline").toString(),ReadExcelFile.getData("Education").toString(),ReadExcelFile.getData("Occupation").toString(),ReadExcelFile.getData("Status").toString(),ReadExcelFile.getData("income").toString(), ReadExcelFile.getData("Religion").toString(),ReadExcelFile.getData("Height").toString(),ReadExcelFile.getData("Ethnicity:").toString(),ReadExcelFile.getData("bodyType").toString(),ReadExcelFile.getData("EyeColor").toString(),ReadExcelFile.getData("HairColor").toString(),"---------",ReadExcelFile.getData("Drinking").toString());
        String actual_error_message = driver.findElement(By.xpath("//*[@id='error_list']/li")).getText();
		Assert.assertEquals(actual_error_message,"Please select if you smoke.","Smoke field missing error verification failed");
		System.out.println("--------------------------------------------------");
		System.out.println(actual_error_message);
		System.out.println("Smoke field missing error verified successfully");
		System.out.println("--------------------------------------------------");
		
	}
	
	
	@Test(priority=19)
	public void drinkFieldMissingError() throws IOException
	{
		String email = ReadExcelFile.getData("email").toString()+((int)(Math.random()*10000+231));
		profile = PageFactory.initElements(driver, Mate1ProfileCreationPage.class);
		tellYourSelfPage = profile.EnterBasicDetails(ReadExcelFile.getData("Gender").toString(), ReadExcelFile.getData("SeekingA").toString(), ReadExcelFile.getData("AgeMin").toString().replace(".0", "").replace(".0", ""), ReadExcelFile.getData("AgeMax").toString().replace(".0", ""), ReadExcelFile.getData("Country").toString(), ReadExcelFile.getData("City").toString(), ReadExcelFile.getData("nickName").toString(), ReadExcelFile.getData("month").toString(), ReadExcelFile.getData("day").toString().replace(".0", ""),  ReadExcelFile.getData("year").toString(), email+"@gmail.com",email+"@gmail.com",ReadExcelFile.getData("password").toString());
		tellYourSelfPage = PageFactory.initElements(driver, TellUsAboutYourSelfPage.class);
		tellYourSelfPage.enterYourSelfDetails(ReadExcelFile.getData("headline").toString(),ReadExcelFile.getData("Education").toString(),ReadExcelFile.getData("Occupation").toString(),ReadExcelFile.getData("Status").toString(),ReadExcelFile.getData("income").toString(), ReadExcelFile.getData("Religion").toString(),ReadExcelFile.getData("Height").toString(),ReadExcelFile.getData("Ethnicity:").toString(),ReadExcelFile.getData("bodyType").toString(),ReadExcelFile.getData("EyeColor").toString(),ReadExcelFile.getData("HairColor").toString(),ReadExcelFile.getData("Smoking").toString(),"---------");
        String actual_error_message = driver.findElement(By.xpath("//*[@id='error_list']/li")).getText();
		Assert.assertEquals(actual_error_message,"Please select if you drink.","Drink field missing error verification failed");
		System.out.println("--------------------------------------------------");
		System.out.println(actual_error_message);
		System.out.println("Drink field missing error verified successfully");
		System.out.println("--------------------------------------------------");
		
	}
	
}
