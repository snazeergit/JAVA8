package com.anonymous.innerclass;

//To demonstrate an anonymous inner class can extend concrete class, abstract class and implements interface.
//Overridden methods take effect 

public class InnerTest1 {

	public static void main(String[] args) {
		
		// anonymous inner class can extend normal concrete class Tamil1
		Tamil1 t1 = new Tamil1() {
			@Override
			void helloConcrete() {
				System.out.println("overriden concrete method From Tamil1 concrete class");
			}
		};
		t1.helloConcrete();

		// anonymous inner class can extend an abstract class Tamil2
		Tamil2 t2 = new Tamil2() {
			@Override
			void helloabstract() {
				System.out.println("Overriden abstract method from Tamil2 abstract class");
			}
			@Override
			void helloNormal() {
				System.out.println("overridden Concrete method from abstract class Tamil");
			}
		};
		t2.helloabstract();
		t2.helloNormal();

		// anonymous inner class can implement an interface Tamil3 irrespective of no.
		// of methods
		Tamil3 t3 = new Tamil3() {

			@Override
			public void helloInterabstract1() {
				System.out.println("Overriden abstract method from Interface Tamil3");
			}

			@Override
			public void helloInterdefault2() {
				System.out.println("Overriden default method from Interface Tamil3");
			}
		};
		t3.helloInterabstract1();
		t3.helloInterdefault2();

	}
}
