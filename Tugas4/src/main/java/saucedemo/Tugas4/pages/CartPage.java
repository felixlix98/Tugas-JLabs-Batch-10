package saucedemo.Tugas4.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage extends BasePage {

	public CartPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);

	}

	By cartHeaderText = By.xpath("//span[@class='title']");
	By item1 = By.xpath("//div[normalize-space()='Sauce Labs Backpack']");
	By item2 = By.xpath("//div[normalize-space()='Sauce Labs Bike Light']");
	By checkoutBtn = By.xpath("//button[@id='checkout']");

	public String getCartPageHeaderText() {
		return getText(cartHeaderText);
	}

	public String[] getCartPageItemText() {
		String[] itemNameHolder = { getText(item1), getText(item2) };
		return itemNameHolder;
	}

	public void clickCheckout() {
		clickAndWait(checkoutBtn);
	}
	

}
