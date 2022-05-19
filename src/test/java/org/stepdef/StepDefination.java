package org.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefination {
	WebDriver driver;
	@Given("user adactin website on chrome browser")
	public void user_adactin_website_on_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
	}

	@When("user enters {string} and {string} and login")
	public void user_enters_and_and_login(String string, String string2) {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys(string);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(string2);

	}

	@When("user click login button")
	public void user_click_login_button() {
		WebElement login = driver.findElement(By.id("login"));
		login.click();

	}

	@Then("user select location of stay {string}")
	public void user_select_location_of_stay(String string) {
		WebElement location = driver.findElement(By.id("location"));
		Select s = new Select(location);
		s.selectByVisibleText(string);
	}
	@Then("user select hotel to stay {string}")
	public void user_select_hotel_to_stay(String string) {
	   WebElement Hotels = driver.findElement(By.id("hotels"));
	   Select s = new Select(Hotels);
		s.selectByVisibleText(string);
	   
	}

	@Then("select room type and no of rooms  {string}{string}")
	public void select_room_type_and_no_of_rooms(String string, String string2) {
		WebElement RoomType = driver.findElement(By.id("room_type"));
		Select s = new Select(RoomType);
		s.selectByVisibleText(string);
			WebElement RoomNos = driver.findElement(By.id("room_nos"));
			Select s2 = new Select(RoomNos) ;
			s2.deselectByVisibleText(string2);
		   
		
	}

	@Then("Select checkin date and checkout date {string} and {string}")
	public void select_checkin_date_and_checkout_date_and(String string, String string2) {
		WebElement CheckInDate = driver.findElement(By.id("datepick_in"));
		Select s = new Select(CheckInDate);
		s.selectByVisibleText(string);
		WebElement CheckOutdate = driver.findElement(By.id("datepick_out"));
		Select s2 = new Select(CheckOutdate);
		s2.selectByVisibleText(string2);
	}

	@Then("select no of adult and children{string} and {string}")
	public void select_no_of_adult_and_children_and(String string, String string2) {
		WebElement NumberOfAdult = driver.findElement(By.id("adult_room"));
		Select s = new Select(NumberOfAdult);
		s.selectByVisibleText(string);
		WebElement NumberOfChild = driver.findElement(By.id("child_room"));
		Select s2 = new Select(NumberOfChild);
		s2.selectByVisibleText(string2);
	
	}

	@Then("click search button")
	public void click_search_button() {
	   WebElement Search = driver.findElement(By.id("Submit"));
	   Search.click();
	}

	@When("select hotel")
	public void select_hotel() {
	  WebElement RadioButton = driver.findElement(By.id("radiobutton_0"));
	  RadioButton.click();
	}

	@Then("click continue")
	public void click_continue() {
	    WebElement Continue = driver.findElement(By.id("continue"));
	    Continue.click();
	}

	@Then("enter user firstname and lastname")
	public void enter_user_firstname_and_lastname() {
	   WebElement FirstName = driver.findElement(By.id("first_name"));
	   FirstName.sendKeys("soma");
	   WebElement Lastname = driver.findElement(By.id("last_name"));
	   Lastname.sendKeys("sundreswaran");
	}

	@Then("enter user address")
	public void enter_user_address() {
	   WebElement Adress = driver.findElement(By.id("address"));
	   Adress.sendKeys("trichy");
	}

	@Then("enter user credit card number")
	public void enter_user_credit_card_number() {
	   WebElement cvv = driver.findElement(By.id("cc_cvv"));
	   cvv.sendKeys("4325676543456789");
	}

	@Then("eneter user name credit card type {string}")
	public void eneter_user_name_credit_card_type(String string) {
		WebElement cardtype = driver.findElement(By.id("cc_type"));
		Select s = new Select(cardtype);
		s.selectByVisibleText(string);
	}

	@When("select expiry date")
	public void select_expiry_date() {
WebElement ExpiryMonth  = driver.findElement(By.id("cc_exp_month"));
ExpiryMonth.sendKeys("january");
WebElement Expiryyear = driver.findElement(By.id("cc_exp_year"));
Expiryyear.sendKeys("2022");

	}

	@When("enter cvv number")
	public void enter_cvv_number() {
WebElement cvv = driver.findElement(By.id("cc_cvv"));
cvv.sendKeys("123");

	}

	@When("click book now")
	public void click_book_now() {
	   WebElement Book = driver.findElement(By.id("book_now"));
	   Book.click();
	}

	
	}



