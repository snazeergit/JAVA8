package com.exception.handling;

public class Test {
	static Test t1;

	public static void main(String[] args) throws NegativeSalaryException {
		t1 = new Test();

		try {
			System.out.println("main");
			t1.decide();
		} catch (NegativeSalaryException e) {
			t1.decide();
		}
	}

	public void decide() throws NegativeSalaryException {
		try {
			System.out.println("decide");
			throw new NegativeSalaryException("Null--message");
		} catch (NegativeSalaryException e) {
			t1.decide();

		}
	}
}
