package day02;

public class Quiz3 {
	public static void main(String[] args) {
		// 1) while을 이용하여 정수를 거꾸로 뒤집어서 다른 변수에 저장한 후 출력하세요
		int num1 = 1234;
		int num2 = 0;

		while(num1 != 0) {
			num2 *= 10;
			num2 += num1 % 10;
			num1 /= 10;
		}
		

		System.out.println(num2);	//4321 
		
		// 2) for를 이용하여 1부터 1000사이의 홀수의 합과 짝수의 합을 각각 구하여 출력하세요
		int oddSum = 0, evenSum = 0;
		
		for(int i = 1; i <= 1000; i++) {	// 0은 어짜피 더해도 바뀌는게 없어서 상관없다.
			if(i % 2 == 0) {
				evenSum += i;
			}
			else {
				oddSum += i;
			}
		}
		
		
		
		System.out.printf("oddSum : %d, evenSum : %d\n", oddSum, evenSum);

		
		
		
		
		
	}
}
