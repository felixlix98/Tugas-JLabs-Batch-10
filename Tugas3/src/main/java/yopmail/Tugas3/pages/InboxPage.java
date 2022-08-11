package yopmail.Tugas3.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class InboxPage extends BasePage {

	By iFrame = By.xpath("//iframe[@id='ifmail']");
	By titleEmail = By.xpath("//div[@class='ellipsis nw b f18']");

	public InboxPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);

	}

	public void switchToIFrame() {
		switchIframe(iFrame);
	}

	public String titleEmail() {
		return getText(titleEmail);
	}


}
