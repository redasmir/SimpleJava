package com.formation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCalculator {
	
	calculator c = new calculator();
	
	@Test
	public void testAdd() {
		Assertions.assertEquals(2, c.add(1, 1));
	}
	
	@Test
	public void testmultiply() {
		Assertions.assertEquals(15, c.multiply(3, 5));
	}

}
