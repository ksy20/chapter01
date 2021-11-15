package com.javaex.ex01;

public class Ex09 {
	
	public static void main (String[] args) {
		
		//논리 연산자
		System.out.println("논리 연산자");
		
		//&& - and, || - or, ! - not (반대)
		//&& 은 false가 더 쏌 ||은 true가 더 쎔 
		
		int a=5;
		int b=7;
		
		System.out.println();
	
		
		//논리연산자 응용
		System.out.println(a<b&&a>b); // true false --> false 가 더 쎄서 결과 false
		System.out.println(a!=b&&a<b);  // true true --> 둘다 true라서 결과 true
		
		System.out.println(a<b||a>b); // true false --> true 가 더 쎄서 결과 true
		System.out.println(a>b||a==b); //false false --> 둘다 false 라서 결과 false
		
		System.out.println(!(a<b)); //true지만 반대로 결과는 false
		System.out.println(!(a>b)); //false지만 반대로 결과는 true
		
		
		
		
	}

}
