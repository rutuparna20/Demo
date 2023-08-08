package StepDefs;

import org.openqa.selenium.chrome.ChromeDriver;

import Utils.Base;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	
	 @Before
	 public void setUp() {
	  System.out.println("Inside before hook");
	  Base.driver=new ChromeDriver();
	  Base.driver.manage().window().maximize();
	  
	 }
	 
	 @After
	 public void tearDown() {
	  System.out.println("Inside after hook");
	 // Base.driver.quit();
}}
	

