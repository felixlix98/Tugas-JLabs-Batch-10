package yopmail.Tugas3.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{


	By username = By.xpath("//input[@id='login']");
	By loginBtn = By.xpath("//i[@class='material-icons-outlined f36']");

	public LoginPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
	}

	public void loginWeb(String user) {
		setText(username, user);
		clickAndWait(loginBtn);

	}
}
