package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage 
{
	WebDriver driver;
	//COnstructor of LoginPage class
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this); //Initializing the elements using PageFactory
	}
	
	//Declaring the WebElements of LoginPage	
	@FindBy(xpath="//*[@id='headerComp']/div/div[2]/div[2]/div[2]")
	@CacheLookup
	WebElement loginSignupButton;
	
	@FindBy(xpath="/html/body/ngb-modal-window/div/div/app-login-modal/div/div[1]/div/div[2]/div")
	@CacheLookup
	WebElement loginViaPassword;
	
	@FindBy(xpath="/html/body/ngb-modal-window/div/div/app-login-modal/div/div[2]/form/div/div[1]/input")
	@CacheLookup
	WebElement mobileNo;
	
	@FindBy(xpath="//*[@id='password']")
	@CacheLookup
	WebElement password;
	
	@FindBy(xpath="/html/body/ngb-modal-window/div/div/app-login-modal/div/div[2]/form/div/div[4]/div[3]/button")
	@CacheLookup
	WebElement loginButton;
	
	@FindBy(xpath="/html/body/ngb-modal-window/div/div/app-login-modal/div/div[2]/form/div/div[2]/label")
	@CacheLookup
	WebElement invalidUserPassMessage;
	
	@FindBy(xpath="//*[@id='headerComp']/div/div[2]/div[2]/div[3]")
	@CacheLookup
	WebElement myAccount;
	
	//Clicking the "Login/Signup" button
	public void clickLoginSignup()
	{
		loginSignupButton.click();
	}
	
	//Clicking the "Login via Password" button
	public void clickLoginViaPassword()
	{
		loginViaPassword.click();
	}
	
	//Entering the mobile number in the field
	public void enterMobileNo(String mbno)
	{
		mobileNo.sendKeys(mbno);
	}
	
	//Entering the Password in the password field
	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	//Clicking the "Login" Button
	public void clickLoginButton()
	{
		loginButton.click();
	}
	
	//Checking the erroe message "Invalid Username or Password"
	public void checkInvalidUserPassMessage()
	{
		Assert.assertEquals("Invalid username or password", invalidUserPassMessage.getText());
	}
	
	//Checking whether the user is logged in or not
	public void checkLogin()
	{
		Assert.assertEquals("My Account", myAccount.getText());
	}
}



