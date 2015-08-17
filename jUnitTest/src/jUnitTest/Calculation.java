package jUnitTest;

public class Calculation {
	private double num1, num2;

	public Calculation(double a, double b) {
		num1 = a;
		num2 = b;
	}

	public double Multiplication() {
		double r = num1 * num2;
		return r;
	}

	public double Addition() {
		double r = num1 + num2;
		return r;
	}

	public double Subtraction() {
		double r = num1 - num2;
		return r;
	}

	public double Division() {
		double r = num1 / num2;
		return r;
	}

	public double Modulus() {
		double r = num1 % num2;
		return r;
	}

}