package day01;

import java.util.Random;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		// updown game 만들기
		
		// 0) 코드 실행에 필요한 요인을 찾아서 변수로 선언한다
		// 반복 횟수를 체크할 변수도 같이 선언한다 (초기값은 0)
		// 필요하다면, 초기값을 지정한다
		
		// 1) 컴퓨터가 랜덤값을 하나 뽑게 하고, 사용자에게 반복하여 정수를 입력받는다.
		
		// 2) 입력받은 정수가 컴퓨터가 뽑은 값과 일치하는지 판별한다
		// 반복을 수행할 때마다, 시도한 횟수를 1씩 증가시킨다
		// 2-1) 일치하면 반복문을 중단한다
		// 2-2) 정답보다 크면 down을 출력한다
		// 2-3) 정답보다 작으면 up을 출력한다
		
		// 3) 반복이 중단되면 정답을 출력하고 마무리 이후 종료한다
		
		Random random = new Random();
		int com, user, count = 0;
		Scanner sc = new Scanner(System.in);
		com = random.nextInt(100) + 1;
		

		
		while(true) {
			System.out.print("정답을 맞춰보세요 (1 ~ 100) : ");
			user = sc.nextInt();
			
			count++;
			if(user == com) break; 
			else if (user > com) System.out.println("down!!");
			else System.out.println("up!!");
		}
 		System.out.printf("정답입니다!! %d회 만에 정답을 맞췄습니다!!\n",count);
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
	}
}
