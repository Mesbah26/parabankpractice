package paraBankPF;


	

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class DashboardPage {
	    WebDriver driver;
	    
	    
	    public DashboardPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	    
	    
	    @FindBy(xpath = "//h1[contains(text(), 'Accounts Overview')]")
	    WebElement accountsOverviewHeader;
	    
	    @FindBy(linkText = "Log Out")
	    WebElement logoutLink;
	    
	    
	    public boolean isAccountsOverviewDisplayed() {
	        return accountsOverviewHeader.isDisplayed();
	    }
	    
	    public String getPageTitle() {
	        return driver.getTitle();
	    }
	    
	    public void logout() {
	        logoutLink.click();
	    }
	}

