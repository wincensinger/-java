package day03;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 1. 길이가 정해지지 않은 반복
		// 사용자에게 정수를 입력받아서 합계를 누적시킨다
		// 만약 0을 입력하면 더이상 더하지 않겠다 라는 의미로 반복을 중단한다
		int input = 1, sum = 0;
		
		while(input != 0) {
			System.out.print("누적시킬 정수를 입력하세요 : ");
			input = sc.nextInt();
			sum += input;
		}
		System.out.println("반복을 종료합니다.");
		System.out.printf("총 누적된 정수의 값은 %d입니다.\n",sum);
		
		sc.close();
		
		
	}
}
