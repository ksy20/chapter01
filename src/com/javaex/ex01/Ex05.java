package com.javaex.ex01;

public class Ex05 {
	
	public static void main(String[] args) {
		
//		int var01 = 2;
		
		double var01 =2+3.4;
		System.out.println(var01);
		
		
		
		
		
		
		
		
		
		
		
		//강제형변환
		int i = (int)11112.3232322;
		System.out.println(i);
		
		float f01 = 12.5f;
		
		int i10 = (int)f01;
		System.out.println(i10);
		System.out.println(f01);
		
		//강제형변환 확대 형변환
		byte v01 = 10;
		int v02 = (int) v01;
		System.out.println(v01);
		System.out.println(v02);
		
		//강제형변환 축소 형변환(정상)
		int v03 = 10; 
		byte v04 = (byte)v03;
		System.out.println(v03);
		System.out.println(v04);
		
		//강제형변환 축소 형변환(비정상)
		int v05 = 103029770;
		byte v06 = (byte)v05;
		System.out.println(v05);
		System.out.println(v06);
		
		//실수-> 정수 :소수점 없어짐
		double v07 = 5.57;
		int v08 = (int)v07;
		System.out.println(v07);
		System.out.println(v08);
		
		//정수 -> 싨수
		int v09 = 7;
		double v10 = (double)v09;
		System.out.println(v09);
		System.out.println(v10);
		
		
		
		
		
	}

}
