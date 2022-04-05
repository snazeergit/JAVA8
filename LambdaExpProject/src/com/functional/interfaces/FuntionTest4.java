package com.functional.interfaces;

import java.util.function.Function;

public class FuntionTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<Integer, Integer> f1 = i -> i + 1;
		Function<Integer, Integer> f2 = i -> i * 2;

		// First f1 will be executed with i value provided in apply method then the
		// updated i value(output of f1 will become i value for f2) will use to execute
		// f2
		System.out.println(f1.andThen(f2).apply(10)); // f1=10+1=11 f2= 11*2=22  =>(10+1)*2=22
		
		
		// First f2 function will be executed with i value provided in apply method then
		// the f1 function will be executed with updated i value(the output of the first Function thats executed becomes the input for the secondly executed Function) i.e., the output from
		// f2
		System.out.println(f1.compose(f2).apply(10));//f2=10*2=20 f1=20+1=21  =>(10*2)+1=21

	}

}
