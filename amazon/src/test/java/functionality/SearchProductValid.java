package functionality;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import objectrepository.LoginElements;
import objectrepository.SearchProduct;

public class SearchProductValid {
	
	@Test
	public void searchproducts() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","F:\\Java setup\\CromeDriver93_Seleniumfile\\chromedriver.exe");


		WebDriver d; 
		d = new ChromeDriver();

		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		d.get("https://www.amazon.in/s?k=login+amazon+account&adgrpid=59671903835&ext_vrnc=hi&gclid=Cj0KCQjw0umSBhDrARIsAH7FCoflJNuiSGZm0aLdpzVTh61YhBuYgrpd57iof5yj_C0UUybUcCV0CVIaAhIUEALw_wcB&hvadid=398134035836&hvdev=c&hvlocphy=1007788&hvnetw=g&hvqmt=b&hvrand=2850323183062176418&hvtargid=kwd-294882733100&hydadcr=24542_1971411&tag=googinhydr1-21&ref=nav_signin");

		d.manage().window().maximize();
		
		PageFactory.initElements(d,SearchProduct.class);
		
		SearchProduct.serchbox.clear();
		
		SearchProduct.serchbox.sendKeys("Mobile");
		
		SearchProduct.serchbutton.click();
		
	

	}
}
