package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {
	
	WebDriver driver;
	
	public homePage(WebDriver driver)
	{
		this.driver = driver;
	}

	public WebElement Acceptcookiesbtn()
	{
		return driver.findElement(By.cssSelector("button[class*='cookie']"));
	}
	public WebElement SignUpbtn()
	{
		return driver.findElement(By.cssSelector("button[data-testid='sign-in-button']"));
	}
	public WebElement CreateAccountlink()
	{
		return driver.findElement(By.cssSelector("button[data-testid='register']"));
	}
	public WebElement CreateAccountemail()
	{
		return driver.findElement(By.xpath("//*[@id=\"create-account-email\"]"));
	}
	public WebElement CreateAccountPassword()
	{
		return driver.findElement(By.xpath("//*[@id=\"create-account-password\"]"));
	}
	public WebElement AgreeTermscheck()
	{
		return driver.findElement(By.id("agree-terms"));
	}
	public WebElement CreateAccountbtn()
	{
		return driver.findElement(By.cssSelector("button[data-testid='Button-primary-new']"));
	}
	public WebElement CloseBannerbtn()
	{
		return driver.findElement(By.cssSelector("button[class*='close button']"));
	}
	public WebElement MyDetailslink()
	{
		return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/ul/li[2]/a"));
	}
	public WebElement UserEmailid()
	{
		return driver.findElement(By.xpath("//*[@id=\"email\"]"));
	}
	public WebElement SignInemail()
	{
		return driver.findElement(By.xpath("//*[@id=\"signin-email\"]"));
	}
	public WebElement SignInpassword()
	{
		return driver.findElement(By.xpath("//*[@id=\"signin-password\"]"));
	}
	public WebElement SignInbtn()
	{
		return driver.findElement(By.cssSelector("button[data-testid='Button-primary-new']"));
	}
	public WebElement MyAccountlink()
	{
		return driver.findElement(By.cssSelector("span[class*='link account']"));
	}
	public WebElement Addressbook()
	{
		return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/ul/li[3]/a"));
		
	}
	public WebElement AddNewaddressbtn()
	{
		return driver.findElement(By.cssSelector("button[data-testid='address-add-button']"));
		
	}
	public WebElement Firstname()
	{
		return driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
	}
	public WebElement LastName()
	{
		return driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
	}
	public WebElement Address1()
	{
		return driver.findElement(By.xpath("//*[@id=\"address1\"]"));
	}
	public WebElement Address2()
	{
		return driver.findElement(By.xpath("//*[@id=\"address2\"]"));
	}
	public WebElement City()
	{
		return driver.findElement(By.xpath("//*[@id=\"city\"]"));
	}
	public WebElement Zipcode()
	{
		return driver.findElement(By.xpath("//*[@id=\"zipCode\"]"));
	}
	public WebElement Phonenumber()
	{
		return driver.findElement(By.xpath("//*[@id=\"phone1\"]"));
	}
	public WebElement Addaddressbtn()
	{
		return driver.findElement(By.cssSelector("button[data-testid='address-save-button']"));
	}
	public WebElement Emailerror()
	{
		return driver.findElement(By.xpath("//*[@id=\"create-account-email-helper-text\"]"));
	}
	public WebElement Passworderror()
	{
		return driver.findElement(By.xpath("//*[@id=\"create-account-password-helper-text\"]"));
	}
	public WebElement Agreetesrmserror()
	{
		return driver.findElement(By.xpath("//*[@id=\"authentication-portal\"]/div/div/div/div/div/form/p[2]"));
	}
}
