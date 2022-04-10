package pagelayer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class login
{
WebDriver driver;
public login(WebDriver driver)
{ 
	this.driver=driver;
}
	@FindBy(how=How.XPATH,using="//div[@class='IiD88i _351hSN']//input[@type='text']")
	WebElement emailTextBox;	
	@FindBy(how = How.XPATH,using="//input[@type='password']")
		WebElement passwordTextBox;
	@FindBy(how=How.XPATH,using="//div[@class='_1D1L_j']//button[@type='submit']")
	WebElement loginButton;
public void setEmail(String strEmail)
{
	emailTextBox.sendKeys(strEmail);
	}
public void setPassword(String strPassword)
{
	passwordTextBox.sendKeys(strPassword);
}
public void clickLogButton()
{
	loginButton.click();
}
}


