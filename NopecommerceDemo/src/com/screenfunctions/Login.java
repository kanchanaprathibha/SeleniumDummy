package com.screenfunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login {
	@FindBy(how=How.XPATH,using="//a[@class='ico-login']")
	public static WebElement lnk_login;
	
	@FindBy(how=How.XPATH,using="//input[@id='Email']")
	public static WebElement Edi_email;
	
	@FindBy(how=How.XPATH,using="//input[@id='Password']")
	public static WebElement Edi_password;
	
	@FindBy(how=How.XPATH,using="//div[@class='returning-wrapper fieldset']/form/div[3]/input")
	public static WebElement Btn_login;
	
	public void login()
	{
		lnk_login.click();
		Edi_email.sendKeys("user01");
		Edi_password.sendKeys("pass1234");
		Btn_login.click();
	}
}
