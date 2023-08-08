package StepDefs;

import Actions.SauceDemoActions;
import Utils.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SauceDemo {
	Base b=new Base();
	SauceDemoActions act=new SauceDemoActions();
	@Given("user launches the {string}")
	public void user_launches_the(String s) {
    b.driver.get(s);

	}

	@And("user is entering the details in username and password field {string},{string}")
	public void user_is_entering_the_details_in_username_and_password_field(String uName, String passWD) { 
act.enterUserNamePassword(uName,passWD);


	}

@Given("user clicking on Login button")
public void user_clicking_on_login_button() {
    act.clickLoginButton();
}

	@Then("user logged in to the application")
	public void user_logged_in_to_the_application() {
act.validatePage();

	}

	@When("user selecting an item")
	public void user_selecting_an_item() {
act.selectItem();

	}
	@When("user validating the name of the product and price")
	public void user_validating_the_name_of_the_product_and_price() {
		act.getprice();
		act.getname();
	}
	@Then("user  adding it to the cart")
	public void user_adding_it_to_the_cart() {
		act.addToCart();
		act.viewCart();
		act.checkOut();
	}
	@Then("user is filling the datails in shopping section {string},{string},{string}")
	public void user_is_filling_the_datails_in_shopping_section(String fName, String lastName,String postalCode) {
act.datails(fName, lastName,postalCode);

	}

	@And("user should be able to navigate to the next page")
	public void user_should_be_able_to_navigate_to_the_next_page() {
act.validateMsg();

	}


}
