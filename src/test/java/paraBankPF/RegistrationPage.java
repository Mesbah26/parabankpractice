package paraBankPF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
    WebDriver driver;
    
    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        System.out.println("this is mesbah");
    }
    @FindBy(linkText = "Register")
    WebElement registerLink;
    
    @FindBy(id = "customer.firstName")
    WebElement firstNameField;
    
    @FindBy(id = "customer.lastName")
    WebElement lastNameField;
    
    @FindBy(id = "customer.address.street")  
    WebElement addressField;
    
    @FindBy(id = "customer.address.city")
    WebElement cityField;
    
    @FindBy(id = "customer.address.state")
    WebElement stateField;
    
    @FindBy(id = "customer.address.zipCode")  
    WebElement zipCodeField;
    
    @FindBy(id = "customer.phoneNumber")      
    WebElement phoneField;
    
    @FindBy(id = "customer.ssn")
    WebElement ssnField;
    
    @FindBy(id = "customer.username")
    WebElement usernameField;
    
    @FindBy(id = "customer.password")
    WebElement passwordField;
    
    @FindBy(id = "repeatedPassword")
    WebElement confirmPasswordField;
    
    @FindBy(xpath = "//input[@value='Register']")
    WebElement registerButton;

	    public void clickRegisterLink() {
	        registerLink.click();
	    }
	    
	    public void enterFirstName(String firstName) {
	        firstNameField.clear();
	        firstNameField.sendKeys(firstName);
	    }
	    
	    public void enterLastName(String lastName) {
	        lastNameField.clear();
	        lastNameField.sendKeys(lastName);
	    }
	    
	    public void enterAddress(String address) {
	        addressField.clear();
	        addressField.sendKeys(address);
	    }
	    
	    public void enterCity(String city) {
	        cityField.clear();
	        cityField.sendKeys(city);
	    }
	    
	    public void enterState(String state) {
	        stateField.clear();
	        stateField.sendKeys(state);
	    }
	    
	    public void enterZipCode(String zipCode) {
	        zipCodeField.clear();
	        zipCodeField.sendKeys(zipCode);
	    }
	    
	    public void enterPhone(String phone) {
	        phoneField.clear();
	        phoneField.sendKeys(phone);
	    }
	    
	    public void enterSSN(String ssn) {
	        ssnField.clear();
	        ssnField.sendKeys(ssn);
	    }
	    
	    public void enterUsername(String username) {
	        usernameField.clear();
	        usernameField.sendKeys(username);
	    }
	    
	    public void enterPassword(String password) {
	        passwordField.clear();
	        passwordField.sendKeys(password);
	    }
	    
	    public void enterConfirmPassword(String confirmPassword) {
	        confirmPasswordField.clear();
	        confirmPasswordField.sendKeys(confirmPassword);
	    }
	    
	    public void clickRegisterButton() {
	        registerButton.click();
	    }
	    
	    public void registerUser(String firstName, String lastName, String address, 
	                           String city, String state, String zipCode, String phone, 
	                           String ssn, String username, String password) {
	        enterFirstName(firstName);
	        enterLastName(lastName);
	        enterAddress(address);
	        enterCity(city);
	        enterState(state);
	        enterZipCode(zipCode);
	        enterPhone(phone);
	        enterSSN(ssn);
	        enterUsername(username);
	        enterPassword(password);
	        enterConfirmPassword(password);
	        clickRegisterButton();
	    }
	}


