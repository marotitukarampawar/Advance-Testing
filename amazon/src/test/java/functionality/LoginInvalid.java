package functionality;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import objectrepository.LoginElements;

public class LoginInvalid {
	

	
	@Test
	public void login_Invalid() throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","F:\\Java setup\\CromeDriver93_Seleniumfile\\chromedriver.exe");
		
		
	    WebDriver d; 
		d = new ChromeDriver();

		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		d.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%3Fk%3Dlogin%2Bamazon%2Baccount%26adgrpid%3D59671903835%26ext_vrnc%3Dhi%26gclid%3DCj0KCQjw0umSBhDrARIsAH7FCoflJNuiSGZm0aLdpzVTh61YhBuYgrpd57iof5yj_C0UUybUcCV0CVIaAhIUEALw_wcB%26hvadid%3D398134035836%26hvdev%3Dc%26hvlocphy%3D1007788%26hvnetw%3Dg%26hvqmt%3Db%26hvrand%3D2850323183062176418%26hvtargid%3Dkwd-294882733100%26hydadcr%3D24542_1971411%26tag%3Dgooginhydr1-21%26ref%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		
		d.manage().window().maximize();
		
		PageFactory.initElements(d, LoginElements.class);
		
		String path ="C:\\Excel\\Exceldata.xlsx";
		FileInputStream file = new FileInputStream(path);
		String value1 = WorkbookFactory.create(file).getSheet("Invalid_data").getRow(0).getCell(0).getStringCellValue();
		
		
        LoginElements.emailid.sendKeys(value1);
		
		LoginElements.loginbutton.click();
		
		LoginElements.password.sendKeys("9763144653");
		
		LoginElements.signinbutton.click();
	
		
		
		
		
		
		
	
	}
	
}
