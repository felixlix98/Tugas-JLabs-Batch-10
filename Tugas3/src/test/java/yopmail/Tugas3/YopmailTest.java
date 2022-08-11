package yopmail.Tugas3;

import org.testng.annotations.Test;

import yopmail.Tugas3.pages.InboxPage;
import yopmail.Tugas3.pages.LoginPage;

public class YopmailTest extends BaseWebTest {
	
	LoginPage loginPage = new LoginPage(driver, explicitWait);
	InboxPage inboxPage = new InboxPage(driver, explicitWait);

	@Test
	public void testLogin() {
		String username = "automationtest	";
		loginPage.openUrl("https://yopmail.com/en/");
		loginPage.loginWeb(username);
		inboxPage.switchToIFrame();
		String actualText = inboxPage.titleEmail();
		System.out.println(actualText);

	}

}
