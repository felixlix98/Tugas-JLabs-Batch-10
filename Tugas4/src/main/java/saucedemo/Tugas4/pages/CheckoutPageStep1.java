package saucedemo.Tugas4.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPageStep1 extends BasePage {

	public CheckoutPageStep1(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
	}

	By checkout1HeaderText = By.xpath("//span[@class='title']");
	By firstNamePath = By.xpath("//input[@id='first-name']");
	By lastNamePath = By.xpath("//input[@id='last-name']");
	By zipCodePath = By.xpath("//input[@id='postal-code']");
	By continueBtn = By.xpath("//input[@id='continue']");

	public String getCheckoutStep1PageHeaderText() {
		return getText(checkout1HeaderText);
	}

	public void fillDetailInfo(String firstName, String lastName, String zipCode) {
		setText(firstNamePath, firstName);
		setText(lastNamePath, lastName);
		setText(zipCodePath, zipCode);
	}

	public void clickContinue() {
		clickAndWait(continueBtn);
	}

}
