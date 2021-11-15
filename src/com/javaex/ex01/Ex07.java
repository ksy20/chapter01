package com.javaex.ex01;

public class Ex07 {
	
	public static void main(String[] args) {
		
		//대입연산자
		int a = 7;
		int b = 2;
		
		//산술연산자
		System.out.println("산술연산자");
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b); //이건 몫을 표시
		System.out.println(a % b); //이렇게 표시하면 나머지를 표시해줌
		
		System.out.println("산술연산자 자세히");
		System.out.println(7.0/2.0);
		System.out.println(7.0%2.0);
		
		//부호연산자
		System.out.println("부호연산자");
		int var = -3;
		
		int pvar = +var;
		int mvar = -var;
		
		System.out.println(var);
		System.out.println(pvar); //이건 부호 그대로
		System.out.println(mvar); //이게 부호 변경
		
		//증감연산자
		System.out.println("증감연산자");
		
		System.out.println(a);
		System.out.println(++a); //a의 데이터 자체를 1을 올린다 (그 전값은 없어짐)
		System.out.println(a);
		
		System.out.println(b);
		System.out.println(--b); //b의 데이터 자체를 1을 내린다 (그 전값은 없어짐)
		System.out.println(b);
		
		System.out.println(a);
		System.out.println(a++); //이거는 a의 원래 값을 출력 후 1을 올림
		System.out.println(a); //올린 후 다시 출력해서 확인
		
		System.out.println(b);
		System.out.println(b--); //이거는 b의 원래 값을 출력 후 1을 내림
		System.out.println(b); //내린 후 다시 출력해서 확인
		

				
				
		
		
		
		
		
	}

}
