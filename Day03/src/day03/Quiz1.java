package day03;

import java.util.Random;
import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {

		/*	
		 *	1층에서 15층 사이의 엘리베이터가 3개가 있습니다
		 * 	사용자에게 현재 층을 입력받아서 가장 가까운 엘리베이터가 이동할 수 있도록
		 * 	출력문을 만들어서 출력해주세요
		 */
		
		// 가장 가까운 엘리베이터
		// 거리가 최소값인 엘리베이터
		// 절대값(현재층-대상층)중에서 최소값을 가지는 엘리베이터

		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int n1 = ran.nextInt(15) + 1;
		int n2 = ran.nextInt(15) + 1;
		int n3 = ran.nextInt(15) + 1;
		System.out.printf("1번 엘리베이터 : %d층 | 2번 엘리베이터 : %d층 | 3번 엘리베이터 : %d층\n",n1,n2,n3);
		System.out.print("현재 층 : ");
		int user = sc.nextInt();								// 현재 층수를 입력받는다
		System.out.printf("%d층에서 버튼을 누릅니다.\n\n\n",user);

		n1 = user - n1;											// 현재 층과 각 엘리베이터 층수의 [차이]를 구한다
		n2 = user - n2;
		n3 = user - n3;	
		
		n1 = n1 < 0 ? -n1 : n1; 								// 위 혹은 아래 방향에 상관없이 [거리]를 구하기 위해 [절대값] 처리한다
		n2 = n2 < 0 ? -n2 : n2; 
		n3 = n3 < 0 ? -n3 : n3;
		
		int move = n1;											// [거리 층에서 최소값]을 찾아낸다
		if(move > n2) move = n2;
		if(move > n3) move = n3;
		
		String elevator;										// 최소값과 일치하는 요소가 이동하는 형식을 출력한다
		if(move == n1) elevator = "1번";
		else if(move == n2) elevator = "2번";
		else elevator = "3번";
		System.out.printf("%s 엘리베이터가 움직입니다.\n", elevator);
		
		sc.close();
		
		
		
		

		
		
	}


}
