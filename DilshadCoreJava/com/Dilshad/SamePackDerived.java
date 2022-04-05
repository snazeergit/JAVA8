package com.Dilshad;

public class SamePackDerived extends SamePackBase {

	public static void main(String[] args) {
		
		SamePackBase d1=new SamePackBase();
		//No Private
		System.out.println(d1.defaultDetails);
		System.out.println(d1.protectedDetails);
		System.out.println(d1.publicDetails);

	}

}