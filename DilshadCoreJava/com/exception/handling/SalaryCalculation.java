package com.exception.handling;

public class SalaryCalculation {

	public void decideSalary(int salary)
			throws NegativeSalaryException, ZeroSalaryException, NumberFormatException {

		if (salary < 0) {
			throw new NegativeSalaryException("Oops! Salary can not be negative...");
		} else if (salary == 0) {
			throw new ZeroSalaryException("Oops! Salary can not be zero...");
		} else {
			System.out.println("No exceptions found with the salary");
		}
	}
}
