package com.javaex.ex02;

public class Ex01 {
	
	public static void main(String[] args) {
		
		System.out.print("안녕"); //줄바꿈 안함
		System.out.println("하세요"); // 끝나고 줄바꿈함
		System.out.println("안녕하세요");
		
		//println()사용법
		int i = 2345;
		double d  = 3.14;
		String str = "굿모닝";
		char c = '한';
		String s ="한";
		
		String name ="강소이";
		
		System.out.println("안녕하세요");
		System.out.println(str);
		System.out.println(i);
		System.out.println(d);
		System.out.println(str+str);
		System.out.println(str+i);
		System.out.println(str+d);
		System.out.println(str+c);
		
		System.out.println(str+" 이랑 "+i);
		
		System.out.println(i+i);
		
		System.out.println(c);
		System.out.println(c+c); // char 은 코드값끼리 더해짐
		System.out.println(c+s);
		System.out.println(c+i);
		
		System.out.println("제이름은 "+name+" 입니다");
		System.out.println("안녕\"하\"세요"); //\"\" 이런식으로 적으면 이 문자를 해석하지 말라는 뜻
		System.out.println("안녕\\하\\세요"); //\\ \\ 이렇게 적어도 오키 \\ 이거 사이에 특수기호 넣기 ㅇㅋ
		System.out.println("안녕\t하\\세요"); //t는 tab키랑 똑같음 (일정간격 벌려지는거)
		System.out.println("안녕\n하세요"); //n은 줄바뀸
		
		
		
	}

}
