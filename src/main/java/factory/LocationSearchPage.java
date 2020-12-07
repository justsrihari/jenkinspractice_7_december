package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LocationSearchPage 
{
	WebDriver driver;
	
	//Constructor of LocationSearchPage
	public LocationSearchPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);	    //Initializing the elements using PageFactory
	}
	
	//WebElements of LocationSearchPage using @FindBy
	@FindBy(xpath="//*[@id='menu-search']")
	@CacheLookup
	WebElement locationSearch;
	
	@FindBy(xpath="//*[@id='aahaar-wrapper']/app-set-location/div/div/div[2]/div/button")
	@CacheLookup
	WebElement doneButton;
	
	@FindBy(xpath="//*[@id='building']")
	@CacheLookup
	WebElement address;
	
	@FindBy(xpath="//*[@id='aahaar-wrapper']/app-set-location/div/div/div[2]/div/button")
	@CacheLookup
	WebElement selectAndSaveButton;
	
	@FindBy(xpath="//*[@id='aahaar-wrapper']/app-set-location/div/div/div[2]/div/div/div/span[1]")
	@CacheLookup
	WebElement dontServeLocationMessage;
	
	@FindBy(xpath="//*[@id='aahaar-wrapper']/app-set-location/div/div/div[1]/div[3]/div/div[3]/div")
	@CacheLookup
	WebElement noLocationFound;
	
	@FindBy(xpath="//*[@id='aahaar-wrapper']/app-set-location/div/div/div[1]/div[3]/div/div[3]/div[1]/div/div[1]/div[2]")
	@CacheLookup
	WebElement firstButton;
	
	//Entering the location name in search bar
	public void enterLocationSearch(String loc)
	{
		locationSearch.sendKeys(loc);
	}
	
	//Clicking on the "Done" button
	public void clickDoneButton()
	{
		doneButton.click();
	}
	
	//Entering the address in the address bar
	public void enterAddress(String add)
	{
		address.sendKeys(add);
	}
	
	//Clicking on the "Select and Save button"
	public void clickSelectAndSaveButton()
	{
		selectAndSaveButton.click();
	}
	
	//Selecting the first occurence of the list of locations 
	public void clickFirstButton()
	{
		firstButton.click();
	}
	
	//Checks the error message "We don't serve this location as of now"
	public void checkNotServeMessage() 
	{
		Assert.assertEquals("We do not serve this location as of now.", dontServeLocationMessage.getText());
	}
	
	//Checks the error message "No results found...."
	public void checkNoLocationFoundMessage() 
	{
		Assert.assertEquals("No results found, please enter nearby landmark & drop the pin on map", noLocationFound.getText());
	}
}
