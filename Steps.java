package stepDefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.SigninPage;

public class Steps {
	public WebDriver driver;
	public SigninPage sp;

	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
	   driver=new ChromeDriver();
		sp=new SigninPage(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	   
	}

	@When("click on Doctor")
	public void click_on_Doctor() {
		sp.clickDoctor();
	}

	@When("click on Signin")
	public void click_on_signin() {
	   sp.clickSignin();
	}
	
	@When("click on Billing") 
	public void click_on_Billing() throws InterruptedException {
		sp.clickBilling();
	}
	
	@When("click on path") 
	public void click_on_path() {
		sp.clickpath();
	}
	


	@Then("close browser")
	public void close_browser() {
	  driver.close();
	}
	 
	    
	    

}
