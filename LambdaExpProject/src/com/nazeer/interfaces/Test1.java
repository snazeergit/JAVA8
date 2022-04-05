package com.nazeer.interfaces;

interface printable {
	void print();
}

interface showable {
	void show();
}

public class Test1 implements printable, showable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1 = new Test1();
		t1.print();
		t1.show();

		printable p1 = new Test1();
		p1.print();
		//p1.show();

		showable s1 = new Test1();
		s1.show();
		//s1.print();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("show");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("print");
	}

}
