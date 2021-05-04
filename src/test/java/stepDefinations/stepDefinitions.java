package stepDefinations;

import org.junit.runner.RunWith;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import pageObjects.homePage;

@RunWith(Cucumber.class)
public class stepDefinitions {

	WebDriver driver;
	
    @Given("^User Navigate to home page$")
    public void user_navigate_to_home_page() throws Throwable {
    	System.setProperty("webdriver.chrome.driver", ".//resouces//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://nl.tommy.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		homePage hp = new homePage(driver);
		hp.Acceptcookiesbtn().click();
    	   	
  }

    @When("^User clicks on Create an Account link$")
    public void user_clicks_on_create_an_account_link() throws Throwable {
    	homePage hp = new homePage(driver);
    	hp.SignUpbtn().click();
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	hp.CreateAccountlink().click();
   }

    @Then("^User enters required data (.+) and (.+)$")
    public void user_enters_required_data_and(String username, String password) throws Throwable {
    	
    	homePage hp = new homePage(driver);
    	hp.CreateAccountemail().sendKeys(username);
    	hp.CreateAccountPassword().sendKeys(password);
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	WebElement element = hp.AgreeTermscheck();
    	Actions actions = new Actions(driver);
    	actions.moveToElement(element).click().build().perform();
    	hp.CreateAccountbtn().click();
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	hp.CloseBannerbtn().click();
    }

    @Then("^Verify the user account created successfully (.+)")
    public void verify_the_user_account_created_successfully(String username) throws Throwable {
    	homePage hp = new homePage(driver);
    	hp.MyDetailslink().click();
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	String useremailid = hp.UserEmailid().getAttribute("value");
    	String currrentmethodname = new Object(){}.getClass().getEnclosingMethod().getName();
    	takeScreenshots(currrentmethodname);
    	Assert.assertTrue(useremailid.equalsIgnoreCase(username));
    }
    
    @When("^User clicks on Signup$")
    public void user_clicks_on_signup() throws Throwable {
    	homePage hp = new homePage(driver);
    	hp.SignUpbtn().click();
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }

    @Then("^User enters login data (.+) and (.+)$")
    public void user_enters_login_data_and(String username, String password) throws Throwable {
    	 	
    	homePage hp = new homePage(driver);
    	hp.SignInemail().sendKeys(username);
    	hp.SignInpassword().sendKeys(password);
    	hp.SignInbtn().click();
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }

    @Then("^User adds New Address$")
    public void user_adds_new_address() throws Throwable {
    	homePage hp = new homePage(driver);
    	hp.MyAccountlink().click();
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	hp.CloseBannerbtn().click();
    	hp.Addressbook().click();
    	hp.AddNewaddressbtn().click();
    	hp.Firstname().sendKeys("First");
    	hp.LastName().sendKeys("Last");
    	hp.Address1().sendKeys("Street");
    	hp.Address2().sendKeys("10");
    	hp.City().sendKeys("City");
    	hp.Zipcode().sendKeys("1083 TE");
    	hp.Phonenumber().sendKeys("989898989");
    	hp.Addaddressbtn().click();
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	String currrentmethodname = new Object(){}.getClass().getEnclosingMethod().getName();
    	takeScreenshots(currrentmethodname);
    }
    
    @Then("^User registers without enough information$")
    public void user_registers_without_enough_information() throws Throwable {
    	homePage hp = new homePage(driver);
    	hp.CreateAccountbtn().click();
    }

    @Then("^Verify the errors (.+) and (.+) and (.+)$")
    public void verify_the_errors(String usernameerror1, String passworderror1, String agreetermserror1) throws Throwable {
    	String currrentmethodname = new Object(){}.getClass().getEnclosingMethod().getName();
    	takeScreenshots(currrentmethodname);
    	homePage hp = new homePage(driver);
    	String emailiderror = hp.Emailerror().getText();
    	Assert.assertTrue(emailiderror.equals(usernameerror1));
    	String passworderror = hp.Passworderror().getText();
    	Assert.assertTrue(passworderror.equals(passworderror1));
    	String agreetermserror = hp.Agreetesrmserror().getText();
    	Assert.assertTrue(agreetermserror.equals(agreetermserror1));
    }

    @And("^Close browser$")
    public void close_browser() throws Throwable {
        driver.close();
    }
    public void takeScreenshots(String methodname) throws IOException
    {
    	Date d = new Date();
    	String FileName = methodname +"_"+ d.toString().replace(":", "_").replace(" ", "_")+".png";
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(src,new File(".\\target\\screenshots\\"+FileName));
    }
   
}

