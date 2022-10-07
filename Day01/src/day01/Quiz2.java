package day01;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		// 버스 한 정거장 이동하는데 약 3분의 시간이 소요된다고 가정한다
		// 사용자에게 이동한 정거장 수를 입력받아서 걸린 시간을 출력하세요
		// 단, 시간이 60분을 초과하면 시간과 분을 나누어서 출력하세요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 정거장을 거쳐가나요? : ");
		int station = sc.nextInt();
		int minute = 3;				// 버스 이동 시간
		
		int result_minute = 0;		// 결과 시간, 분
		int result_time = 0;
		
		result_minute = minute * station;	// 총 경과 분 계산 귀찮으니 변수 재활용
	
		if(result_minute / 60 != 0 && result_minute % 60 != 0) { // 시간과 나머지 분 계산 &&는 60분을 나타내기 위함
			result_time = result_minute / 60;
			result_minute %= 60;
			System.out.printf("총 걸린 시간 : %d시간 %d분\n",result_time,result_minute);
		}
		else System.out.printf("총 걸린 시간 : %d분\n",result_minute);
		
		sc.close();
		
	}
}
