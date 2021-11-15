package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간: ");
		int work_h = sc.nextInt();
		int salary = work_h*10000;
		int salary2 = 80000+((work_h-8)*12000);
		if (work_h<=8) {
			System.out.println("임금은 "+salary+"원 입니다.");
			
		}
		
		else {
			System.out.println("임금은 "+salary2+"원 입니다.");
		}
		
		sc.close();

	}
	


}
