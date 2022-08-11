package saucedemo.Tugas4.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

	By username = By.xpath("//input[@id='user-name']");
	By Password = By.xpath("//input[@id='password']");
	By loginBtn = By.xpath("//input[@id='login-button']");

	public LoginPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
	}

	public void loginWeb(String user, String password) {
		setText(username, user);
		setText(Password, password);
		clickAndWait(loginBtn);

	}

}
