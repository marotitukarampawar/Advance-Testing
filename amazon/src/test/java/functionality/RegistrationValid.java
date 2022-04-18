package functionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import objectrepository.RegistrationElements;

public class RegistrationValid {
	
	@Test
	public void registration() {
		
		System.setProperty("webdriver.chrome.driver","F:\\Java setup\\CromeDriver93_Seleniumfile\\chromedriver.exe");
		
		WebDriver d;
		 d = new ChromeDriver();
		d.get("https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%2F%3F_encoding%3DUTF8%26adgrpid%3D59671903835%26ext_vrnc%3Dhi%26gclid%3DCj0KCQjwr-SSBhC9ARIsANhzu147Yp9dMJtmft7_Tij0hyWenT0smmjRA3owmyBJpnYVOXGwknIx1rYaAq3VEALw_wcB%26hvadid%3D398134035836%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D1007788%26hvnetw%3Dg%26hvpone%3D%26hvpos%3D%26hvptwo%3D%26hvqmt%3Db%26hvrand%3D17757901093873478149%26hvtargid%3Dkwd-294882733100%26hydadcr%3D24542_1971411%26ie%3DUTF8%26index%3Daps%26keywords%3Dlogin%2520amazon%2520account%26ref%3Dpd_sl_2cwzc6x246_b%26tag%3Dgooginhydr1-21%26ref_%3Dnav_custrec_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		
		d.manage().window().maximize();
	
		PageFactory.initElements(d, RegistrationElements.class);
		
		
		RegistrationElements.username.sendKeys("Maroti Pawar");
		
		RegistrationElements.mobile.sendKeys("9763144653");
		
		RegistrationElements.email.sendKeys("maroti.pawar112@gmail.com");
		
		RegistrationElements.password.sendKeys("9763144653");
		
		RegistrationElements.button.click();
		
		
	}

}
