package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdateInformation {
	
	@FindBy(id="ap_email")
    public static WebElement  emailid;

	@FindBy(id="continue")
    public static WebElement  loginbutton;

	@FindBy(id="ap_password")
    public static WebElement  password;

	@FindBy(id="signInSubmit")
    public static WebElement  signinbutton;

	@FindBy(id="nav-link-accountList")
    public static WebElement  account;
	
	@FindBy(xpath="//*[@id=\"a-page\"]/div[2]/div/div[3]/div[1]/a/div/div/div/div[2]/div/span")
    public static WebElement  youraddresses;
	
	@FindBy(xpath="//*[@id=\"ya-myab-address-add-link\"]/div/div")
    public static WebElement  addAddress;
	
	
	@FindBy(xpath="//input[@name='address-ui-widgets-enterAddressFullName']")
    public static WebElement  fullName;
	

	
	@FindBy(xpath="//input[@name='address-ui-widgets-enterAddressPhoneNumber']")
    public static WebElement  mobileNumber;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressPostalCode']")
    public static WebElement  pincode;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressLine1']")
    public static WebElement  building;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressLine2']")
    public static WebElement  area;
	


	@FindBy(xpath="//input[@id='address-ui-widgets-landmark']")
    public static WebElement  landmark;
	

	@FindBy(xpath="//input[@class='a-button-input']")
    public static WebElement  addressbutton;

	


}
