package com.Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.screenfunctions.Login;

public class Tc_01{
	
	public static WebDriver driver = new FirefoxDriver();

	public static void main(String[] args) throws InterruptedException
	{
		driver.get("http://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Login lgn = PageFactory.initElements(driver, Login.class);
		lgn.login();
	}
}
