package com.nazeer.interfaces;

public class Test3 extends AB1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test3 t1=new Test3();
		t1.print();
	}

}
abstract class  AB1{
	void print() {
		System.out.println("AB1 abstract print");
	}
//	abstract void show();
}

abstract class AB2{
	void show() {
		System.out.println("AB2 abstract show");
	}
}