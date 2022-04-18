package functionality;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import objectrepository.AddressElements;
import objectrepository.LoginElements;
import objectrepository.ProductsElements;

public class AddCart_addAddress {

	@Test
	public void products() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","F:\\Java setup\\CromeDriver93_Seleniumfile\\chromedriver.exe");


		WebDriver d; 
		d = new ChromeDriver();

		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		d.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%3Fk%3Dlogin%2Bamazon%2Baccount%26adgrpid%3D59671903835%26ext_vrnc%3Dhi%26gclid%3DCj0KCQjw0umSBhDrARIsAH7FCoflJNuiSGZm0aLdpzVTh61YhBuYgrpd57iof5yj_C0UUybUcCV0CVIaAhIUEALw_wcB%26hvadid%3D398134035836%26hvdev%3Dc%26hvlocphy%3D1007788%26hvnetw%3Dg%26hvqmt%3Db%26hvrand%3D2850323183062176418%26hvtargid%3Dkwd-294882733100%26hydadcr%3D24542_1971411%26tag%3Dgooginhydr1-21%26ref%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");

		d.manage().window().maximize();

		ProductsElements.emailid(d).sendKeys("maroti.pawar112@gmail.com");
		Thread.sleep(3000);

		ProductsElements.loginbutton(d).click();
		Thread.sleep(3000);

		ProductsElements.password(d).sendKeys("9763144653");
		Thread.sleep(3000);

		ProductsElements.signinbutton(d).click();
		Thread.sleep(3000);

		ProductsElements.serchbox(d).clear();
		ProductsElements.serchbox(d).sendKeys("mobile");
		Thread.sleep(3000);

		ProductsElements.serchbutton(d).click();
		Thread.sleep(3000);


		ProductsElements.clickOnProduct(d).click();
		Thread.sleep(3000);

		JavascriptExecutor jse = (JavascriptExecutor)d;

		WebElement ele = d.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		jse.executeScript("arguments[0].scrollIntoView(true);", ele);

	
		ele.click();

		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();
		//ProductsElements.cartbutton(d).click();
		Thread.sleep(3000);
		
		ProductsElements.proceedbutton(d).click();
		Thread.sleep(3000);
		
		
		AddressElements.fullName(d).sendKeys("Maroti Tukaram Pawar");
		Thread.sleep(3000);
		
		AddressElements.mobileNumber(d).sendKeys("9763144653");
		
		AddressElements.pincode(d).sendKeys("411035");
		
		AddressElements.building(d).sendKeys("Gurukrupa");
		
		AddressElements.area(d).sendKeys("Akurdi Pune");
		
		AddressElements.landmark(d).sendKeys("Near Gurudwara");
		
		//WebElement addresstype = d.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[2]/div[1]/div/div[1]/form/div/div[3]/div[4]/span/span/span/span"));
		//Select s = new Select(addresstype);
		//s.selectByIndex(0);
		
		AddressElements.addressbutton(d).click();

	}


}
