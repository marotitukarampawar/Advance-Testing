package objectrepository;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchProduct {
	
	@FindBy(name="field-keywords")
    public static WebElement  serchbox;
	
	@FindBy(id="nav-search-submit-button")
    public static WebElement  serchbutton;
	
}
