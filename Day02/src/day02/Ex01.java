package day02;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) throws Exception {
		
		System.out.println(System.in);
		System.out.println(System.out);
		System.out.println(System.err);
		
		InputStream stdin = System.in;		// 0번 통로
		PrintStream stdout = System.out;	// 1번 통로
		PrintStream stderr = System.err;	// 2번 통로
		
//		System.out.println(10 / 3);
//		System.out.println(10 / 0);
		
		System.out.print("아무 키나 입력하세요 : ");
		int data = System.in.read();	// keyCode를 정수로 입력받는다
		System.out.println("data : " + data);
		System.out.println((char)44032);
		
		// System.in.read()는 1바이트의 표준 입력을 처리하는 함수이다
		
		System.in.read();
		System.in.read();
		
		// 한글은 처리할 수 없으므로, 2바이트 입력을 처리할 수 있는 새로운 함수를 사용하게 된다
		// 1바이트 입력을 처리하는 객체를 재료로 사용하여 2바이트를 처리하는 새로운 객체를 생성한다
		InputStreamReader isr = new InputStreamReader(System.in); 
		
		System.out.print("한글 하나 입력 : ");
		int num2 = isr.read();
		System.out.println(num2);
		
		// 한글자씩 입력받으면 문장단위 입력이 매우 까다롭기 때문에 일정크기로 입력받는 형식으로 바꾼다
		// 2바이트 입력기를 이용하여 문장단위 입력을 처리하는 객체를 생성한다
		BufferedReader br = new BufferedReader(isr);
		br.readLine();	// 이전에 남아있던 데이터를 가져와서 버림
		
		System.out.print("문장을 입력하세요 : ");
		String str = br.readLine();
		System.out.println("출력 : " + str);
		
		// 자바 1.4까지는 이렇게 사용함
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		
		// 자바 1.5부터 입력을 처리하는 새로운 객체가 등장
		Scanner sc = new Scanner(System.in);
		
		// Scanner는 생성자 매개변수에 넣는 대상을 읽어내는 객체이다
		String path = "C:\\windows\\system32\\drivers\\etc\\hosts";
		File f = new File(path);
		Scanner sc2 = new Scanner(f);
		
		while(sc2.hasNextLine()) {			// 파일에 읽어내지 않은 다음 줄이 있으면
			String line = sc2.nextLine();	// 한 줄을 읽어내서 (\n 이전까지)
			System.out.println(line);		// 그 줄을 화면에 출력한다
		}
		System.out.println("End");
		
		sc.close();
		sc2.close();
		
		URL url = new URL("https://mgr.kgitbank.com");
		URLConnection conn = url.openConnection();
		InputStream in = conn.getInputStream();
		Scanner sc3 = new Scanner(in);
		
		while(sc3.hasNextLine()) {
			String line2 = sc3.nextLine();
			System.out.println(line2);
		}
		System.out.println("close");
		sc3.close();
		
		
	}
}












