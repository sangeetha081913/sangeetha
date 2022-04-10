package testlayer;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import baseclass.url;
import pagelayer.login;

public class logintest extends url{
	@Test
	public void init() throws Exception
	{
		login loginpage=PageFactory.initElements(driver,login.class);
	loginpage.setEmail("abc@gmail.com");
	loginpage.setPassword("abdfgh");
	loginpage.clickLogButton();
	}
		

	}


