package day03;

import java.util.Scanner;

public class Ex06 {

	private static int minimum(int num1, int num2, int num3) {
		if(num1 > num2) num1 = num2;
		if(num1 > num3) num1 = num3;
		
		return num1;
	}
	
	private static String odd_Even(int num) {
		if(num == 0) return "둘다 x";
		else if (num % 2 == 0) return "짝수"; 
		return "홀수";
	}
	
	
	public static void main(String[] args) {
		// if 문제
		
		// 1) 세 정수 중에서 최소값을 찾아서 출력하세요
		Scanner sc = new Scanner(System.in);
		int num1,num2,num3;
		System.out.print("세 정수 입력 (※띄어쓰기로 구분합니다) : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		int min = minimum(num1, num2, num3);
		
		System.out.printf("세 정수 중 최소값은 %d입니다.\n",min);
		
		// 2) 정수를 입력받아서, 정수의 절대값을 출력하는 코드를 작성하세요
		int absolute;
		System.out.print("절대값 지정할 정수 입력 : ");
		absolute = sc.nextInt();
		absolute = absolute < 0 ? -absolute : absolute;
		
		System.out.printf("절대값은 : %d입니다.\n",absolute);
		
		
		// 3) 정수를 입력받아서, 입력받은 수가 홀수인지 짝수인지 판별하여 결과를 문자열로 출력하세요
		int num;
		System.out.print("홀수 짝수 구별할 정수 입력 : ");
		num = sc.nextInt();
		
		String result = odd_Even(num);
		
		System.out.printf("%d는 %s입니다\n",num,result);
		
		sc.close();
		
	}


}
