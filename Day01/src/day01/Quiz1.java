package day01;

public class Quiz1 {
	public static void main(String[] args) {
		
		// 첫날에 은행에 돈을 10원 준비하여 입금한다
		// 둘째날에는 이전날의 두배인 20원을 준비하여 입금한다
		// 셋째날에는 이전날의 두배인 40원을 준비하여 입금한다
		// 이런 식으로 30일 동안 은행에 돈을 입금하면
		// 30일 이후 은행 계좌에 입금된 금액의 총액은 얼마인가?
		// (단, 은행계좌에는 처음에 돈이 없었던 것으로 가정한다)
		
		long final_Money = 0;
		long save_Money = 10;
		
		for(int i = 1; i <= 30; i++) {
			

			final_Money += save_Money;
			save_Money *= 2;
		}
		
		//System.out.println("계좌 총액 : " + final_Money);
		System.out.printf("계좌 총액 : %,d원\n", final_Money);
		
	
		
		
	}

}
