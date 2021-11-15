package com.javaex.ex02;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //sc는 별명임 control+shift+o 누르면 import 나옴
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		System.out.println("입력하신 숫자는 "+num+" 입니다");
		
		
		
		sc.close(); //-->scanner은 키보드랑 연결했다가 close로 연결 닫아줌
		
		
		
		
	}

}
