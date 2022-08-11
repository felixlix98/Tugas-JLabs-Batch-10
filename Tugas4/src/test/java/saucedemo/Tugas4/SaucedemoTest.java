package saucedemo.Tugas4;

import org.testng.Assert;
import org.testng.annotations.Test;

import saucedemo.Tugas4.pages.CartPage;
import saucedemo.Tugas4.pages.CheckoutPageStep1;
import saucedemo.Tugas4.pages.CheckoutPageStep2;
import saucedemo.Tugas4.pages.FinishPage;
import saucedemo.Tugas4.pages.LoginPage;
import saucedemo.Tugas4.pages.ProductPage;

public class SaucedemoTest extends BaseWebTest {
	
	LoginPage loginPage = new LoginPage(driver, explicitWait);
	ProductPage productPage = new ProductPage(driver, explicitWait);
	CartPage cartPage = new CartPage(driver, explicitWait);
	CheckoutPageStep1 checkoutPageStep1 = new CheckoutPageStep1(driver, explicitWait);
	CheckoutPageStep2 checkoutPageStep2 = new CheckoutPageStep2(driver, explicitWait);
	FinishPage finishPage = new FinishPage(driver, explicitWait);

	String username = "standard_user";
	String password = "secret_sauce";
	String URL = "https://www.saucedemo.com/";
	String firstName = "Felix";
	String lastName = "Wong";
	String zipCode = "12311";

	@Test
	public void loginSaucedemo() {

		loginPage.openUrl(URL);
		loginPage.loginWeb(username, password);
		
		//asert header title in product page
		String actualProductPageHeaderText = productPage.getProductHeaderText();
		String expectedProductPageHeaderText = "PRODUCTS";
		Assert.assertTrue(actualProductPageHeaderText.contains(expectedProductPageHeaderText));
	}

	@Test
	public void testAddroducts() {
		String[] expectedItemList;
		
		loginPage.openUrl(URL);
		loginPage.loginWeb(username, password);
		productPage.addToCart();
		expectedItemList = productPage.getProductItemTitle();
		productPage.clickCart();

		// assert header title
		String actualCartPageHeaderText = cartPage.getCartPageHeaderText();
		String expectedCartPageHeaderText = "YOUR CART";
		Assert.assertTrue(actualCartPageHeaderText.contains(expectedCartPageHeaderText));

		// assert each item name in the cart
		expectedItemList = productPage.getProductItemTitle();
		String[] actualItemListCart = cartPage.getCartPageItemText();
		for (int i = 0; i < actualItemListCart.length; i++) {
			Assert.assertTrue(actualItemListCart[i].contains(expectedItemList[i]));
			
		}
	}

	@Test
	public void testCheckoutAndPay() {
		String[] expectedItemList;
		
		loginPage.openUrl(URL);
		loginPage.loginWeb(username, password);
		productPage.addToCart();
		expectedItemList = productPage.getProductItemTitle();
		productPage.clickCart();
		cartPage.clickCheckout();
		
		// assert checkoutheadertitle step 1
	    String actualCheckoutPageStep1HeaderText = checkoutPageStep1.getCheckoutStep1PageHeaderText();
	    String expectedCheckoutPageStep1HeaderText = "CHECKOUT: YOUR INFORMATION";
	    Assert.assertTrue(actualCheckoutPageStep1HeaderText.contains(expectedCheckoutPageStep1HeaderText));

		checkoutPageStep1.fillDetailInfo(firstName, lastName, zipCode);
		checkoutPageStep1.clickContinue();
		
		// assert checkoutheadertitle step 2
		String actualCheckoutPageStep2HeaderText = checkoutPageStep2.getCheckoutStep2PageHeaderText();
		String expectedCheckoutPageStep2HeaderText = "CHECKOUT: OVERVIEW";
		Assert.assertTrue(actualCheckoutPageStep2HeaderText.contains(expectedCheckoutPageStep2HeaderText));
		
		// assert each item name
		String[] actualItemListCheckoutPageStep2 = checkoutPageStep2.getCheckoutStep2ItemListName();
		for (int i = 0; i < actualItemListCheckoutPageStep2.length; i++) {
			Assert.assertTrue(actualItemListCheckoutPageStep2[i].contains(expectedItemList[i]));
			
		}

		checkoutPageStep2.clickFinish();

		// assert header title
		String actualFinishPageHeaderText = finishPage.getFinishPageHeaderText();
		String expectedFinishPageHeaderText = "CHECKOUT: COMPLETE!";
		Assert.assertTrue(actualFinishPageHeaderText.contains(expectedFinishPageHeaderText));

		// assert body title
		String actualFinishPageBodyText = finishPage.getFinishPageBodyText();
		String expectedFinishPageBodyText = "THANK YOU FOR YOUR ORDER";
		Assert.assertTrue(actualFinishPageBodyText.contains(expectedFinishPageBodyText));

		// assert is finishimage displayed?
		Assert.assertTrue(finishPage.imageDisplayed());

		
	}

}
