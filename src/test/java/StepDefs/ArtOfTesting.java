package StepDefs;

import Actions.ArtOfTestingActions;
import Utils.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ArtOfTesting {
Base b=new Base();
ArtOfTestingActions act=new ArtOfTestingActions();
	

@Given("user launches the url i.e. {string}")
public void user_launches_the_url_i_e(String s) {
    b.driver.get(s);
}

@And("user entering the values in the textbox {string}")
public void user_entering_the_values_in_the_textbox(String name) {
  act.EnterValue(name);  
}

@Then("user clicking the submit button")
public void user_clicking_the_submit_button() {
    act.ClickButton();
}

@When("user double clicking on the generete alert box field")
public void user_double_clicking_on_the_generete_alert_box_field() {
    act.DoubleClick();
}

@Then("user handling the alert")
public void user_handling_the_alert() {
    act.HandleAlert();
}

@And("user clicking on radio button")
public void user_clicking_on_radio_button() {
    act.SelectRadioButn();
}

@Then("user clicking on the checkbox")
public void user_clicking_on_the_checkbox() {
    act.SelectCheckBox();
}

@And("user selecting option from dropdown")
public void user_selecting_option_from_dropdown() {
   act.SelectDropDown();
}

@When("user clicking on generate alert box field")
public void user_clicking_on_generate_alert_box_field() {
    act.GenerateAlert();
}

@Then("user handling that alert")
public void user_handling_that_alert() {
    act.HandleAlert();
}

@And("user clicking on generate confirm box field to generate confirm box")
public void user_clicking_on_generate_confirm_box_field_to_generate_confirm_box() {
    act.GenerateConfirmBox();
}

@Then("user handling the confirm box")
public void user_handling_the_confirm_box() {
   act.HandleAlert();
}

@Then("user verifying the text after handling the confirm box")
public void user_verifying_the_text_after_handling_the_confirm_box() {
    act.verifyMsg();
}

@Then("user doing drag and drop a text in a text box")
public void user_doing_drag_and_drop_a_text_in_a_text_box() throws InterruptedException {
	Thread.sleep(5000);
   act.DragAndDrop();
}

}
