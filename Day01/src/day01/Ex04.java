package day01;

public class Ex04 {
	public static void main(String[] args) {
		// 논리 연산에 의한 연산 미수행
		int n1 = -1, n2 = 0, n3 = 1, n4 = 2;
		
		System.out.printf("%d, %d, %d, %d\n", n1, n2, n3, n4);
	
		boolean flag1 = n1++ + ++n2 < 0 && n3-- * ++n4 == 0;
									// and 조건은 앞이 false면 뒤에 조건을 보지도 않고 false를 내보낸다
		// 	n1은 후위 연산자라 -1 + n2는 1 false &&	 만약 앞이 true였다면  n3은 후위 연산 1 n4는 3  1 * 3 == 0이 아니니 false로 계산 할 수 있겠지만 	
		// 결과적으로 flag1 은 false  n1 = 0  n2 = 1 그러나 n3, n4 는 and의 false 조건으로 연산을 수행하지 않는다 n3 = 1  n4 = 2
						
		System.out.println(flag1);
		System.out.printf("%d, %d, %d, %d\n", n1, n2, n3, n4);
		
		
		// 두 조건 중 첫번째 조건만으로 전체결과가 확정된다면
		// 두번째 조건은 연산을 수행하지 않는다
		
	}

}
