package com.default1.static1;

class p11 {
	void m1() {
		System.out.println("p1 m1");
	}
}

class p22 {
	void m1() {
		System.out.println("p2 m1");
	}
}

public class InheritDemo1 extends p11 {

	@Override
	void m1() {
		// TODO Auto-generated method stub
		System.out.println("InheritDemo m1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritDemo1 inheritDemo1=new InheritDemo1();
		inheritDemo1.m1();//subclass m1 call
		
		p11 p1 = new InheritDemo1();
		p1.m1();//subclass
	}
}
