package com.javaex.ex03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수: ");
		int score = sc.nextInt();
		
		if(score>=60)/*입력한 값이 60이상? 질문이 true 일때만 실행 */  {
			
			System.out.println("합격입니다.");
			
		}
		
		
		
		
		
		
		
		sc.close();

	}

}
