package com.nazeer.lambda;

interface inter2{
	public float add(float a, float b);
}

public class Demo2 {

	public static void main(String [] args) {
		inter2 i2=(c,d)->c+d;
		System.out.println("addition : "+i2.add(2.5f, 3.7f));
	}
}
