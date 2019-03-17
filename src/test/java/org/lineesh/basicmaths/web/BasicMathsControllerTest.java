package org.lineesh.basicmaths.web;

import org.junit.Assert;
import org.junit.Test;

public class BasicMathsControllerTest {
	private BasicMathsController basicMathsController = new BasicMathsController();

	@Test
	public void test_add_whenTwoIntegersAreGiven() {
		Assert.assertEquals(3, basicMathsController.add(2, 1));
	}

	@Test
	public void test_subtract_whenTwoIntegersAreGiven() {
		Assert.assertEquals(1, basicMathsController.subtract(2, 1));
	}

	@Test
	public void test_multiply_whenTwoIntegersAreGiven() {
		Assert.assertEquals(2, basicMathsController.multiply(2, 1));
	}

	@Test
	public void test_divide_whenTwoIntegersAreGiven() {
		Assert.assertEquals(2, basicMathsController.divide(2, 1));
	}
}
