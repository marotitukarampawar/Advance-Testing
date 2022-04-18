package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddressElements {
	
	public static WebElement fullName(WebDriver d) {

		return d.findElement(By.xpath("//input[@name='address-ui-widgets-enterAddressFullName']"));
	}
	
	public static WebElement mobileNumber(WebDriver d) {

		return d.findElement(By.xpath("//input[@name='address-ui-widgets-enterAddressPhoneNumber']"));
	}
	
	public static WebElement pincode(WebDriver d) {

		return d.findElement(By.xpath("//input[@id='address-ui-widgets-enterAddressPostalCode']"));
	}
	
	public static WebElement building(WebDriver d) {

		return d.findElement(By.xpath("//input[@id='address-ui-widgets-enterAddressLine1']"));
	}
	

	public static WebElement area(WebDriver d) {

		return d.findElement(By.xpath("//input[@id='address-ui-widgets-enterAddressLine2']"));
	}
	
	public static WebElement landmark(WebDriver d) {

		return d.findElement(By.xpath("//input[@id='address-ui-widgets-landmark']"));
	}

	public static WebElement addressbutton(WebDriver d) {

		return d.findElement(By.xpath("//input[@class='a-button-input']"));
	}


}
