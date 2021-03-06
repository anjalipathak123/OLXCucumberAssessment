package OLXDefinitions;



import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DefinitionsClass {

	@Before
	public void before()
	{
		System.out.println("This will get implemented before every scenario");
	}
	@Before("@tag1")
	public void beforeTag1()
	{
		System.out.println("This will get implemented before tag1 scenario");
	}
	@Given("user should be on home page")
	public void user_should_be_on_home_page() throws Exception {
	    
		OLXTests.OlxTest.navigateToUrl();
	}

	@When("^user will enter (.*) in search Field$")
	public void user_will_enter_product_in_search_field(String s) {
	    
		OLXTests.OlxTest.enterProductOnSearchField(s);
	}

	@When("click on search button")
	public void click_on_search_button() {
	   
		OLXTests.OlxTest.clickOnSearchButton();
		OLXTests.OlxTest.forScrolling();
	}

	@Then("user should land on products page")
	public void user_should_land_on_products_page() {
	  
//		Assert.assertEquals("OLX - Free classifieds in India, Buy and Sell for free anywhere in India with OLX Online Classified Advertising",OLXTests.OlxTest.getTitle() );
		OLXTests.OlxTest.getTitle();
	}

	@Given("user should be on home age")
	public void user_should_be_on_home_age() {
		
		Assert.assertEquals("for sale in India | OLX",OLXTests.OlxTest.getTitle());
		OLXTests.OlxTest.getTitle();
	}

	@When("user will click on login")
	public void user_will_click_on_login() {
	    
		OLXTests.OlxTest.clickOnLogin();
	}

	@When("user will click on continue with phone")
	public void user_will_click_on_continue_with_phone() {
	    
		OLXTests.OlxTest.clickOnContinueWithPhone();
	}

	@When("user will enter mobile number")
	public void user_will_enter_mobile_number() {
	    
	}

	@Then("user should encounter OTP page")
	public void user_should_encounter_otp_page() {
	    
	}
	
	@After("@tag1")
	public void afterTag1()
	{
		System.out.println("this will get implemented after tag1 scenario");
	}
	@After()
	public void after()
	{
		System.out.println("this will get implemented after every scenario");
	}


}
