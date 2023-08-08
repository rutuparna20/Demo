package Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SauceDemoObjects {

	@FindBy(xpath="//input[@id='user-name']")
	public WebElement userName;
	@FindBy(id="password")
	public WebElement password;
	@FindBy(id="login-button")
	public WebElement loginButtn;
	@FindBy(xpath="//div[text()='Swag Labs']")
	public WebElement massg;
	@FindBy(xpath="//div[text()='Sauce Labs Backpack']")
	public WebElement item;
	@FindBy(xpath="//div[@class='inventory_details_price']")
	public WebElement price;
	@FindBy(xpath="//button[text()='Add to cart']")
	public WebElement addtoCart;
	@FindBy(xpath="//span[@class='shopping_cart_badge']")
	public WebElement cart;
	@FindBy(xpath="//button[@id='checkout']")
	public WebElement checkOut;
	@FindBy(xpath="//input[@id='first-name']")
	public WebElement firstName;
	@FindBy(xpath="//input[@id='last-name']")
	public WebElement lastName;
	@FindBy(xpath="//input[@id='postal-code']")
	public WebElement postalCode;
	@FindBy(xpath="//input[@id='continue']")
	public WebElement continuebutn;
	@FindBy(xpath="//button[@id='finish']")
	public WebElement finish;
	@FindBy(xpath="//h2[text()='Thank you for your order!']")
	public WebElement text;
}
