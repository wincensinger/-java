package day03;

public class Ex02 {
	public static void main(String[] args) {
		
		
		// 대문자 A부터 Z까지 한줄에 출력하세요
		// 각 글자는 ,로 구분하고 마지막에는 콤마가 없어야 합니다

		
		char alphabet = 65;
		String result;
		for(int i = 0; i < 26; i++) {
			
			result = i < 25 ? ", " : "";
			System.out.printf("%c%s",alphabet + i,result);
			
			/*
			 * if(i < 25) System.out.printf("%c, ",alphabet + i); else
			 * System.out.printf("%c",alphabet + i);
			 */		
			
		}
		
		

		
		
		
		
		
		
		
		
	}
}
