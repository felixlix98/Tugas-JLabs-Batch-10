package saucedemo.Tugas4.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FinishPage extends BasePage {

	public FinishPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);

	}

	By finishPageHeaderText = By.xpath("//span[@class='title']");
	By finishPageBodyText = By.xpath("//h2[normalize-space()='THANK YOU FOR YOUR ORDER']");
	By imageFinish = By.xpath("//img[@alt='Pony Express']");

	public String getFinishPageHeaderText() {
		return getText(finishPageHeaderText);
	}

	public String getFinishPageBodyText() {
		return getText(finishPageBodyText);
	}

	public boolean imageDisplayed() {
		try {
			imageLocator(imageFinish);

		} catch (Exception e) {

			return false;
		}

		return true;

	}

}
