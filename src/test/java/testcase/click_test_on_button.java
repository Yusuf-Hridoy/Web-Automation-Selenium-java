package testcase;

import org.testng.annotations.Test;

import pages.Printworkbd_homepage;
import pages.logins;
import profit.settings;

public class click_test_on_button extends settings {
	Printworkbd_homepage printworkbd_homepage = new Printworkbd_homepage();
	logins log = new logins();
	
	@Test
	public void click_on_button() {
		getDriver().get("https://www.printworksbd.com/");
		Printworkbd_homepage logen = new Printworkbd_homepage();
		getDriver().findElement(logen.login_page).click();
		
		//click on create button
		
		logins account = new logins();
		getDriver().findElement(account.create_account).click();
		
		
		
	}

}
