package com.Dilshad;

import java.util.Scanner;

public class DivisionByZeroDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter a value for numarator");
			String a = s.nextLine();
			int p = Integer.parseInt(a);
			System.out.println("Enter a value for denominator");
			String b = s.nextLine();
			int q = Integer.parseInt(b);
			System.out.println("division :" + p / q);
		} catch (ArithmeticException e) {
			System.err.println("denominator canot be zero");
			System.err.println("Please try another number");

		} catch (NumberFormatException e) {
			System.err.println("Please enter integer values only");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Finally block");
		}

	}

}
