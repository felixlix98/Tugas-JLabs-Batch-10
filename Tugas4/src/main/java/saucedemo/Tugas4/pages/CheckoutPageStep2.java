package saucedemo.Tugas4.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPageStep2 extends BasePage {

	public CheckoutPageStep2(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
	}

	By checkout2HeaderText = By.xpath("//span[@class='title']");
	By itemName1 = By.xpath("//div[normalize-space()='Sauce Labs Backpack']");
	By itemName2 = By.xpath("//div[normalize-space()='Sauce Labs Bike Light']");
	By finishBtn = By.xpath("//button[@id='finish']");

	public String getCheckoutStep2PageHeaderText() {
		return getText(checkout2HeaderText);
	}

	public String[] getCheckoutStep2ItemListName() {
		String[] itemListHolder = { getText(itemName1), getText(itemName2) };
		return itemListHolder;
	}

	public void clickFinish() {
		clickAndWait(finishBtn);
	}

}
