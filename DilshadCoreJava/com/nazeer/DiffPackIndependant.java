package com.nazeer;

import com.Dilshad.SamePackBase;

//Different package Independent class
public class DiffPackIndependant {

	public static void main(String[] args) {
		
		SamePackBase d1=new SamePackBase();
		
		//Only Public
		System.out.println(d1.publicDetails);
		
	}

}
