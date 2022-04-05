package com.nazeer;

import com.Dilshad.*;

//Different package derived class
public class DiffPackDerived extends SamePackBase {

	public static void main(String[] args) {

		DiffPackDerived d1 = new DiffPackDerived();
		
		//Only public protected
		System.out.println(d1.publicDetails);
		System.out.println(d1.protectedDetails);
	}

}
