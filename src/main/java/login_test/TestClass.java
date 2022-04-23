package login_test;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base_page.BaseClass;
import login_page.LoginClass;


public class TestClass extends BaseClass {
	@Test
	public void init() throws Exception {
	LoginClass loginpage = PageFactory.initElements(driver,LoginClass.class);
	loginpage.clickSignin();
	loginpage.setEmail("fiit2022@test.com");
	loginpage.setPassword("admin123");
	loginpage.clickLoginButton();
	loginpage.setDress();
	loginpage.setcheckout1();
	loginpage.setcheckout2();
	loginpage.setcheckout3();
	loginpage.setcheckbox();
	loginpage.setcheckout4();
	loginpage.setwire();
	loginpage.setorder();
	
	
	
	}
}

