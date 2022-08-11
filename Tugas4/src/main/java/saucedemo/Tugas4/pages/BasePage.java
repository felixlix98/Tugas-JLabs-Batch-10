package saucedemo.Tugas4.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	ThreadLocal<WebDriverWait> explicitWait = new ThreadLocal<WebDriverWait>();

	public BasePage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		this.driver = driver;
		this.explicitWait = explicitWait;
	}

	public void openUrl(String url) {
		driver.get().get(url);
	}

	public void clickAndWait(By locator) {
		driver.get().findElement(locator).click();
	}

	public void setText(By locator, String text) {
		driver.get().findElement(locator).sendKeys(text);
	}

	public String getText(By locator) {
		return driver.get().findElement(locator).getText();

	}

	public void imageLocator(By locator) {
		driver.get().findElement(locator).isDisplayed();
	}

}
