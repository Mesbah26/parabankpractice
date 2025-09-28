package stepD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import paraBankPF.DashboardPage;
import paraBankPF.LoginPage;
import paraBankPF.RegistrationPage;


public class LoginStep {
    
    WebDriver driver;
    RegistrationPage rPage;
    LoginPage lPage;
    DashboardPage dPage;
    
    @Given("Open the browser")
    public void open_the_browser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
     
        rPage = new RegistrationPage(driver);
        lPage = new LoginPage(driver);
        dPage = new DashboardPage(driver);
    }
    
    @And("Go to Application")
    public void go_to_application() {
        driver.get("https://parabank.parasoft.com/parabank/register.htm");
    }
    
    @When("User can click on Register Link")
    public void user_can_click_on_register_link() {
        rPage.clickRegisterLink();
    }
    
    @And("User Enter first Name {string}")
    public void user_enter_first_name(String fname) {
        rPage.enterFirstName(fname);
    }
    
    @And("User Enter last Name {string}")
    public void user_enter_last_name(String lname) {
        rPage.enterLastName(lname);
    }
    
    @And("User Enter Address {string}")
    public void user_enter_address(String address) {
        rPage.enterAddress(address);
    }
    
    @And("User Enter City {string}")
    public void user_enter_city(String city) {
        rPage.enterCity(city);
    }
    
    @And("User Enter state {string}")
    public void user_enter_state(String state) {
        rPage.enterState(state);
    }
    
    @And("User Enter Zip Code {string}")
    public void user_enter_zip_code(String zipcode) {
        rPage.enterZipCode(zipcode);
    }
    
    @And("User Enter Phone Number {string}")
    public void user_enter_phone_number(String phone) {
        rPage.enterPhone(phone);
    }
    
    @And("User Enter SSN {string}")
    public void user_enter_ssn(String ssn) {
        rPage.enterSSN(ssn);
    }
    
    @And("User Enter Username {string}")
    public void user_enter_username(String user) {
        rPage.enterUsername(user);
    }
    
    @And("User Enter Password {string}")
    public void user_enter_password(String pass) {
        rPage.enterPassword(pass);
    }
    
    @And("User Enter confirm Password {string}")
    public void user_enter_confirm_password(String cpass) {
        rPage.enterConfirmPassword(cpass);
    }
    
    @And("Click Register button")
    public void click_register_button() {
        rPage.clickRegisterButton();
    }
    
    @Then("User should see {string}")
    public void user_should_see(String message) {
        Assert.assertTrue(driver.getPageSource().contains(message));
    }
    
    @When("Enter valid username {string}")
    public void enter_valid_username(String user) {
        lPage.enterUsername(user);
    }
    
    @And("Enter Password {string}")
    public void enter_password(String pass) {
        lPage.enterPassword(pass);
    }
    
    @And("Click login button")
    public void click_login_button() {
        lPage.clickLogin();
    }
    
    @Then("User can see the Account Dashboard")
    public void user_can_see_the_account_dashboard() {
        Assert.assertTrue(dPage.isAccountsOverviewDisplayed());
    }
    
   
    @When("Enter invalid username {string}")
    public void enter_invalid_username(String invalidUser) {
        lPage.enterUsername(invalidUser);
    }
    
    @And("Enter Valid password {string}")
    public void enter_valid_password(String validPass) {
        lPage.enterPassword(validPass);
    }
    
    @Then("An error message should display {string}")
    public void an_error_message_should_display(String expectedMsg) {
        String actualMsg = lPage.getErrorMessage();
        Assert.assertTrue(actualMsg.contains(expectedMsg),
                "Expected error message: " + expectedMsg + " but found: " + actualMsg);
    }
    
    @And("Enter invalid Password {string}")
    public void enter_invalid_password(String invalidPass) {
        lPage.enterPassword(invalidPass);
    }
    
    @Then("An error message should Display {string}")
    public void an_error_message_should_display_alternative(String expectedMsg) {
        String actualMsg = lPage.getErrorMessage();
        Assert.assertTrue(actualMsg.contains(expectedMsg),
                "Expected error message: " + expectedMsg + " but found: " + actualMsg);
    }
    
    @And("Close the browser")
    public void close_the_browser() {
        if (driver != null) {
            driver.quit();
        }
    }
}