package Actions;

import Objects.SauceDemoObjects;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import Utils.Base;



public class SauceDemoActions {
	
	Base base=new Base();
	SauceDemoObjects obj=PageFactory.initElements(base.driver,SauceDemoObjects.class);
	public void enterUserNamePassword(String uName,String passWD) {
		obj.userName.sendKeys(uName);
		obj.password.sendKeys(passWD);
		}
		public void clickLoginButton() {
			obj.loginButtn.click();
		}
		public void validatePage() {
			String page=obj.massg.getText();
			Assert.assertEquals(page, "Swag Labs");
			System.out.println("user navigated to the next page "+page);
		}
		
	public void selectItem() {
		obj.item.click();
	}
	
	public void getprice() {
		String price1=obj.price.getText();
		System.out.println(price1);
	}
	public String getname(){
		 String name=obj.item.getText();
			return name;
		}
	public void addToCart() {
		obj.addtoCart.click();
	}
	public void viewCart() {
		obj.cart.click();
	}
	public void checkOut() {
		obj.checkOut.click();
	}
	public void datails(String fName,String lastNme,String postalcode) {
		obj.firstName.sendKeys(fName);
		obj.lastName.sendKeys(lastNme);
		obj.postalCode.sendKeys(postalcode);
		obj.continuebutn.click();
		obj.finish.click();
	}
	public void validateMsg() {
		String message=obj.text.getText();
		Assert.assertEquals(message, "Thank you for your order!");
		System.out.println(message);
	}
	
}
