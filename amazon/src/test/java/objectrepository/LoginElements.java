package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginElements {
	
	
	
	@FindBy(id="ap_email")
    public static WebElement  emailid;

	@FindBy(id="continue")
    public static WebElement  loginbutton;

	@FindBy(id="ap_password")
    public static WebElement  password;

	@FindBy(id="signInSubmit")
    public static WebElement  signinbutton;
}
