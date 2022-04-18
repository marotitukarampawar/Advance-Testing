package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationElements {
	
	@FindBy(name="customerName")
    public static WebElement  username;
	
	@FindBy(id="ap_phone_number")
    public static WebElement  mobile;
	
	@FindBy(id="ap_email")
	public static WebElement  email;
	
	@FindBy(id="ap_password")
	public static WebElement  password;
	
	@FindBy()
	public static WebElement  repassword;
	
	@FindBy(id="continue")
	public static WebElement  button;
}
 