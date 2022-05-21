package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {
	public WebDriver driver;
	
	
	@FindBy(linkText="Doctor")
	@CacheLookup
	WebElement a;
	
	@FindBy(className="btn")
	@CacheLookup
	WebElement b;
	
	@FindBy(linkText="Billing")
	@CacheLookup
	WebElement c;
//	Thread.sleep(2000);
	
//	@FindBy(linkText="Pathology")
//	@CacheLookup
//	WebElement d;
	@FindBy(xpath="//a//div//i[@class=\"fas fa-flask\"]")
	@CacheLookup
	WebElement d;
	

	
public SigninPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	public void clickDoctor() {
		a.click();
	}
	public void clickSignin() {
		b.click();
	}
	public void clickBilling() throws InterruptedException {
		c.click();
		Thread.sleep(2000);
	}
	public void clickpath() {
		d.click();
	}
}
