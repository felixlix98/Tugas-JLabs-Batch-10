package saucedemo.Tugas4.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage extends BasePage {

	public ProductPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);

	}

	By productHeaderText = By.xpath("//span[@class='title']");
	By item1Btn = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
	By item2Btn = By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']");
	By cart = By.xpath("//a[@class='shopping_cart_link']");
	By item1Title = By.xpath("//div[normalize-space()='Sauce Labs Backpack']");
	By item2Title = By.xpath("//div[normalize-space()='Sauce Labs Bike Light']");

	public String getProductHeaderText() {
		return getText(productHeaderText);
	}

	public void addToCart() {
		clickAndWait(item1Btn);
		clickAndWait(item2Btn);

	}

	public void clickCart() {
		clickAndWait(cart);
	}

	public String[] getProductItemTitle() {
		String[] itemTitleHolder = { getText(item1Title), getText(item2Title) };
		return itemTitleHolder;

	}


}
