package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsElements {
	
	
	public static WebElement emailid(WebDriver d) {

		return d.findElement(By.id("ap_email"));
	}


	public static WebElement loginbutton(WebDriver d) {

		return d.findElement(By.id("continue"));
	}


	public static WebElement password(WebDriver d) {

		return d.findElement(By.id("ap_password"));
	}

	public static WebElement signinbutton(WebDriver d) {

		return d.findElement(By.id("signInSubmit"));
	}
	
	
	
	public static WebElement serchbox(WebDriver d) {

		return d.findElement(By.name("field-keywords"));
	}
	
	public static WebElement serchbutton(WebDriver d) {

		return d.findElement(By.id("nav-search-submit-button"));
	}

	
	public static WebElement clickOnProduct(WebDriver d) {
		return d.findElement(By.xpath("//img[@alt='Xiaomi 11T Pro 5G Hyperphone(Celestial Magic,8GB RAM,128GB Storage)|SD 888 5G|120 Hz True 10-bit AMOLED|120W HyperCharge|6 Months Free Screen Replacement for Prime|Additional Exchange Offer Available']"));
	}
	
	public static WebElement cartbutton(WebDriver d) {

		return d.findElement(By.xpath("//*[@id=\\\"attach-sidesheet-view-cart-button\\\"]/span/input"));
	}
	
	public static WebElement proceedbutton(WebDriver d) {

		return d.findElement(By.xpath("//input[@name='proceedToRetailCheckout']"));
	}

}
