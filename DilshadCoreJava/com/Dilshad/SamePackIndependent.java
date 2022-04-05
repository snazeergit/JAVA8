package com.Dilshad;

//Same package Independent class
public class SamePackIndependent {
	public static void main(String[] args) {
		
		SamePackBase d1=new SamePackBase();
		
		//No private
		System.out.println(d1.defaultDetails);
		System.out.println(d1.protectedDetails);
		System.out.println(d1.publicDetails);

	}
}
