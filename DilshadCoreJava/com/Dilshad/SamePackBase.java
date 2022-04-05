package com.Dilshad;

//Target Class with all access modifiers
public class SamePackBase {

	public int publicDetails;
	private int privateDetails;
	protected int protectedDetails;
	int defaultDetails;
	
	public static void main(String[] args) {
		SamePackBase d1=new SamePackBase();
		//ALL
		System.out.println(d1.defaultDetails);
		System.out.println(d1.protectedDetails);
		System.out.println(d1.publicDetails);
		System.out.println(d1.privateDetails);
	}
}
