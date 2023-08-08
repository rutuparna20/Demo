package Actions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Action;

import Objects.ArtOfTestingObjects;
import Utils.Base;


public class ArtOfTestingActions {
	Base base=new Base();
	ArtOfTestingObjects obj=PageFactory.initElements(base.driver,ArtOfTestingObjects.class);
	
	public void EnterValue(String str) {
		obj.textBox.sendKeys(str);
	}
	public void ClickButton() {
		obj.button.click();
	}
	public void DoubleClick() {
		  Actions act = new Actions(base.driver);
			 // act.contextClick().perform();
			  act.doubleClick(obj.doubleClick).perform();
		}
	public void HandleAlert() {
		Alert simpleAlert1=base.driver.switchTo().alert();
		  simpleAlert1.accept();
	}
	public void SelectRadioButn() {
		obj.radioButton.click();
	}
	public void SelectCheckBox() {
		obj.checkBox1.click();
		obj.checkBox2.click();
	}
	public void SelectDropDown() {
		obj.dropDown.click();
		Select select=new Select(obj.dropDown);
		select.selectByValue("Performance");
		}
	
	public void GenerateAlert() {
		obj.alertbox.click();
	}
	public void GenerateConfirmBox() {
		obj.confirmbox.click();
	}
	public void verifyMsg() {
		if(obj.Msg.isDisplayed()) {
			System.out.println("message displayed You pressed OK!");
		}
		}
	public void DragAndDrop() {
		
		 Actions ac = new Actions(base.driver);
		  WebElement drop=base.driver.findElement(By.xpath("//div[@id='targetDiv']"));
		  
		  WebElement drag=base.driver.findElement(By.xpath("//img[@id='myImage']"));
		 
		  ac.dragAndDrop(drag,drop).click().build().perform();
		 
		  
		  //ac.dragAndDrop(text,box).perform();
	}
	}
	

