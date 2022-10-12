package day02;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		// if 문제
		
		
		
		/*
		 * 		이용 시간에 따라 요금을 책정하는 놀이기구가 있다
		 * 		기본요금 3천원으로 시작하여 10분간 추가요금 500원이 발생한다
		 * 		요금표는 아래와 같은 규칙으로 적용한다
		 * 
		 * 		 0 ~ 30		3000원
		 * 		31 ~ 40		3500원
		 * 		41 ~ 50		4000원
		 * 		
		 * 		...
		 * 
		 * 
		 * 		이용시간을 분으로 입력받아서, 금액을 계산하여 출력하는 코드를 작성하세요
		 * 
		 */
		
		
		
		
		int price = 3000;		// 가격
		int surCharge = 500;	// 추가 요금
		int min = 0;			// 이용 시간(분 단위)
		int result;				// 총 금액
		
		System.out.print("이용 시간을 입력하세요 ※분 단위 : ");
		Scanner sc = new Scanner(System.in);
		min = sc.nextInt();
		
		if(min > 30) {											// 30분 보다 클 경우 
			if (min % 10 == 0) {								// 나머지가 0인 경우 40, 50 , 60 ....
				surCharge = surCharge *((min - 30) / 10) ;
			}
			else {												// 그 외에 나머지들
				surCharge = surCharge * (((min - 30) / 10) + 1) ;
			}
			result = price + surCharge;
		}
		else result = price;									// 30분 이하일때 기본 요금 3000원
		System.out.printf("이용 금액은 총 %d원 입니다.\n", result);
		
		sc.close();
	}
	
	
	
		static int getFee(int min) {
			int price = 3000;
			int surCharge = 500;

			if(min > 30) {											
				if (min % 10 == 0) {								
					surCharge = surCharge *((min - 30) / 10) ;
				}
				else {												
					surCharge = surCharge * (((min - 30) / 10) + 1) ;
				}
				return price + surCharge;
			}
			return price;									
			
		}
		
		
		
		
	
}
