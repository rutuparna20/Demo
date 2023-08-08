package Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ArtOfTestingObjects {

	
	@FindBy(id="fname")
	public WebElement textBox;
	@FindBy(id="idOfButton")
	public WebElement button;
	@FindBy(id="dblClkBtn")
	public WebElement doubleClick;
	@FindBy(id="female")
	public WebElement radioButton;
	@FindBy(xpath="//input[@class='Automation']")
	public WebElement checkBox1;
	@FindBy(xpath="//input[@class='Performance']")
	public WebElement checkBox2;
	@FindBy(id="testingDropdown")
	public WebElement dropDown;
	@FindBy(xpath="//button[text()='Generate Alert Box']")
	public WebElement alertbox;
	@FindBy(xpath="//button[text()='Generate Confirm Box']")
	public WebElement confirmbox;
	@FindBy(xpath="//p[text()='You pressed OK!']")
	public WebElement Msg;
	/*@FindBy(id="targetDiv")
	public WebElement dragDrop;
	@FindBy(xpath="//a[@href='https://qatools.artoftesting.com/']/img[1]")
	public WebElement Frame;*/
}
