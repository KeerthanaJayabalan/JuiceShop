package com.js.tests;

import org.testng.annotations.Test;

import com.js.pages.ProductPage;

public class ProductPageTest{
	private ProductPageTest() {

	}
	@Test
	public void addProduct() {
		new ProductPage()
		.addJuiceToCart()
		.clickBasket();
	}
}
