package jUnitTest;

import java.util.*;

public class CalculationApp {
	public static void main(String[] args) {
		double num1, num2, r;
		int choice;
		Scanner in = new Scanner(System.in);
		System.out.println("What is the the first number? : ");
		num1 = in.nextDouble();
		System.out.println("1 - Addition\n" + "2 - Subtraction\n"
				+ "3 - Multiplication\n" + "4 - Division\n" + "5 - Modulus");
		System.out.println("What do you want to do? : ");
		choice = in.nextInt();
		System.out.println("What is the second number ? : ");
		num2 = in.nextInt();
		Calculation cal = new Calculation(num1, num2);
		if (choice == 1) {
			r = cal.Addition();
			System.out.println(num1 + " + " + num2 + " = " + r);
		} else if (choice == 2) {
			r = cal.Subtraction();
			System.out.println(num1 + " - " + num2 + " = " + r);
		} else if (choice == 3) {
			r = cal.Multiplication();
			System.out.println(num1 + " * " + num2 + " = " + r);
		} else if (choice == 4) {
			r = cal.Division();
			System.out.println(num1 + " / " + num2 + " = " + r);
		} else if (choice == 5) {
			r = cal.Modulus();
			System.out.println(num1 + " % " + num2 + " = " + r);
		}
	}

}