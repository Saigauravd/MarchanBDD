package step;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.cucumber.java.en.*;
import page.DriverFactory;
import page.login;

public class Logintest {
	 WebDriver driver;
 public login log;
	 
	
@Given("The user is on Chrome Browser")
public void the_user_is_on_chrome_browser() {

	

	driver = new ChromeDriver();
	   
}

@When("The user enter the URL {string}.")
public void the_user_enter_the_url(String URL) {
	driver.get(URL);
    
}

@When("The user Enter Username {string}")
public void the_user_enter_username(String uname) {
log = new login(driver);
	log.credentialsuser(uname);

    
}

@When("The user Enter  Password {string}")
public void the_user_enter_password(String pass) {
	log.credentialspass(pass);
    
}

@Then("User Successfully Login to Marchant portal")
public void user_successfully_login_to_marchant_portal() {
//	String title = driver.getTitle();
	
}



}
