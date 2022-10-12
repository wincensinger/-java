package day02;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// Scanner를 이용하여 이름과 나이, 주소를 순서대로 입력받은 후 출력하세요
		// 단, 주소는 띄워쓰기를 포함하여 입력할 수 있어야 합니다.
		// 입출력에는 사용자의 입력에 따라 예외가 발생할 수 있기 때문에
		// 보통 IOException 처리를 해야하지만
		// Scanner는 내부 코드에서 예외 처리가 되어있어서, 예외 선언을 하지 않아도 된다.
		
		// 1) 변수 선언
			Scanner sc = new Scanner(System.in);
			String name, address;
			int age;

		// 2) 입력
			System.out.print("이름 입력 : ");
			name = sc.nextLine();
			
			System.out.print("나이 입력  : ");
			age = sc.nextInt();
			
			sc.nextLine();
			System.out.print("주소 입력 : ");
			address = sc.nextLine();
			
			System.out.println("".equals(address)); // address가 빈문자인지 비교하는 코드 
			// String name = request.getParameter("name");
			// String age = request.getParameter("age");
			// int _age = Integer.parseInt(age);		// 키보드로 발생하는 모든 입력은 문자열이기에 integer을 사용하여 정수로 바꾸어준다
			
		// 3) 출력
			System.out.println("당신의 이름은 \"" + name + "\" 입니다.");
			System.out.println("당신의 나이는 " + age + "살 입니다.");
			System.out.println("당신의 주소는 \"" + address + "\" 입니다.");
			
			
		// 4) 마무리
			sc.close();
		
		
		
		
		
	}
}
