package day01;

import java.util.Random;

public class Ex05 {
	
	private static int min(int n1, int n2, int n3) {
		if(n1 > n2) n1 = n2;
		if(n1 > n3) n1 = n3;
		
		return n1;
	}
	
	
	public static void main(String[] args) {
		// 제어문 (control statement)
		// 프로그램의 진행 흐름을 제어하는 구문 (진행이 일률적이지 않다)
		
		
		Random random = new Random();
		
		int n1 = random.nextInt(10) + 1;
		int n2 = random.nextInt(10) + 1;
		int n3 = random.nextInt(10) + 1;
		int min;
		
		System.out.printf("%d, %d, %d\n", n1, n2, n3);
		// 아래에 코드를 작성하여 3개의 정수중 가장 작은 수를 화면에 출력하세요
		
		min = min(n1, n2, n3);
		
		System.out.println("최소값 : " + min);
		
		
	}





}
