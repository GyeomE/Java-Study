package input;

import java.util.Scanner;
//jvava.lang이 아닌 애들은 전부 import가 필요하다

public class Ex02 {
	public static void main(String[] args) {
		//입력을 좀 더 수월하게 하기 위해서 
		//Scanner라고 하는 데이터를 읽어 오는 도구를 사용
		
		Scanner sc;
		
		sc = new Scanner(System.in); // new 클래스명() : 클래스의 공간을 생성해라
		//Resource leak: 'sc' is never closed
		sc.next();
		
		int n;
		
		System.out.print("정수입력 : ");
		n= sc.nextInt(); // next자료형() : 입력 스트림에서 해당 자료형의 데이터를 가져온다
		
		System.out.println("n = " + n+ "\n");
		
		double r;
		
		System.out.print("반지름 입력: ");
		r = sc.nextDouble();
		
		System.out.println("원넓이 : "+r*r*3.14);
		
		sc.close(); //Scanner는 다 쓰면 닫는 습관을 들이자~
	}

}
