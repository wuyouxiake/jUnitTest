package jUnitTest;

import org.junit.*;
import static org.junit.Assert.*;

public class CalculationTest {

	@Test
	public void test_Addition() {
		System.out.println("Test if Addition returns a correct answer...");
		Calculation cal = new Calculation(10, 5);

		assertTrue(cal.Addition() == 15);
	}

	@Test
	public void test_Subtraction() {
		System.out.println("Test if Subtraction returns a correct answer...");
		Calculation cal = new Calculation(10, 5);

		assertTrue(cal.Subtraction() == 5);
	}

	@Test
	public void test_Multiplication() {
		System.out
				.println("Test if Multiplication returns a correct answer...");
		Calculation cal = new Calculation(10, 5);

		assertTrue(cal.Multiplication() == 50);
	}

	@Test
	public void test_Division() {
		System.out.println("Test if Division returns a correct answer...");
		Calculation cal = new Calculation(10, 5);

		assertTrue(cal.Division() == 2);
	}

	@Test
	public void test_Modulus() {
		System.out.println("Test if Modulus returns a correct answer...");
		Calculation cal = new Calculation(10, 5);

		assertTrue(cal.Modulus() == 0);
	}
}