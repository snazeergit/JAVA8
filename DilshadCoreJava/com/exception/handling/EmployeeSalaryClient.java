package com.exception.handling;

import java.util.Scanner;

public class EmployeeSalaryClient {

	public static void main(String[] args) throws NumberFormatException, ZeroSalaryException, NegativeSalaryException {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Employee salary");
		int sal = Integer.parseInt(s.nextLine());
		SalaryCalculation cal = new SalaryCalculation();
		cal.decideSalary(sal);
	}

}
