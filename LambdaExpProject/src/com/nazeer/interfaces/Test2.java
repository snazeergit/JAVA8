package com.nazeer.interfaces;

public class Test2 implements printable1, showable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 t1 = new Test2();
		t1.print();
		printable1 p1 = new Test2();
		p1.print();
		showable1 s1 = new Test2();
		s1.print();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("print");
	}

}

interface printable1 {
	void print();
}

interface showable1 {
	void print();
}