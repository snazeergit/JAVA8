package com.anonymous.innerclass;

public interface Tamil3 {
	void helloInterabstract1();
	
	default void helloInterdefault2() {
		System.out.println("From Tamil3 interface ");
	}
}
