package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CartPage 
{
	WebDriver driver;
	
	//Constructor of CartPage class
	public CartPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);      //Initializing the elements using PageFactory
	}
	
	//Declaring the WebElements using @FindBy
	@FindBy(xpath="//*[@id='menu-search']")
	@CacheLookup
	WebElement searchItem;		
	
	@FindBy(xpath="//*[@id='home-page-wrapper']/div[4]/app-search-items/div/div/div/div[3]/app-menu-items/div/app-menu-item[1]/div/div/div/app-price-section/div/div/button")
	@CacheLookup
	WebElement addButton ;
	
	@FindBy(xpath="/html/body/ngb-modal-window/div/div/div[2]/div/div/div[2]/div[1]/div[1]/div[2]/div/label")
	@CacheLookup
	WebElement addCoke;

	@FindBy(xpath="/html/body/ngb-modal-window/div/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/p")
	@CacheLookup
	WebElement removeCoke;
	
	@FindBy(xpath="/html/body/ngb-modal-window/div/div/div[3]/button[2]")
	@CacheLookup
	WebElement addToCartButton;
	
	@FindBy(xpath="//*[@id='home-page-wrapper']/div[4]/app-search-items/div/div/div/div[4]/div")
	@CacheLookup
	WebElement noResultFound;
	
	@FindBy(xpath="//*[@id='home-page-wrapper']/div[5]/app-cart-card/div/div[2]/button")
	@CacheLookup
	WebElement viewCartButton;
	
	//Entering the item to search in the search bar
	public void enterSearchItem(String item)
	{
		searchItem.sendKeys(item);
	}
	
	//Checking whether the add button is available or not
	public void checkAddButton()
	{
		Assert.assertTrue(addButton.isDisplayed());
	}
	
	//Clicking the "Add Button"
	public void clickAddButton()
	{
		addButton.click();
	}
	
	//Clicking the "Add Coke" radio button
	public void clickAddCoke()
	{
		addCoke.click();
	}
	
	//clicking the "Remove" Coke Button
	public void clickRemoveCoke()
	{
		removeCoke.click();
	}
	
	//Clicking the "Add to cart" Button
	public void clickAddToCartButton()
	{
		addToCartButton.click();
	}
	
	//Clicking the "View Cart" Button
	public void checkViewCartButton()
	{
		Assert.assertTrue(viewCartButton.isDisplayed());
	}
	
	//Checking whether the "No result found" is available or not
	public void checkNoResultFound()
	{
		Assert.assertTrue(noResultFound.isDisplayed());
	}	
}
