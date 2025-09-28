package paraBankPF;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class LoginPage {
	    WebDriver driver;
	    
	    public LoginPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	    
	    @FindBy(name = "username")
	    WebElement usernameField;
	    
	    @FindBy(name = "password")
	    WebElement passwordField;
	    
	    @FindBy(xpath = "//input[@value='Log In']")
	    WebElement loginButton;
	    
	    @FindBy(css = "#rightPanel p")
	    WebElement errorMessage;
	    
	    
	    public void enterUsername(String username) {
	        usernameField.clear();
	        usernameField.sendKeys(username);
	    }
	    
	    public void enterPassword(String password) {
	        passwordField.clear();
	        passwordField.sendKeys(password);
	    }
	    
	    public void clickLogin() {
	        loginButton.click();
	    }
	    
	    public String getErrorMessage() {
	        return errorMessage.getText();
	    }
	    
	    public void login(String username, String password) {
	        enterUsername(username);
	        enterPassword(password);
	        clickLogin();
	    }
	}

