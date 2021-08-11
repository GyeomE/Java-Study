package operator;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n , result2;
		String result1;
		
		System.out.println("정수를 입력 : ");
		n = sc.nextInt();
		
		result1 = (n % 3 == 0) ? "참" : "거짓";
		System.out.println("n은 3의 배수 = " + result1);
		
		int n1, n2, bigger;
		
		System.out.println("두 정수를 입력 : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		bigger = (n1>n2) ? n1 : n2;
		
		int num;
		System.out.print("절대값 출력: ");
		num = sc.nextInt();
		
		num = (num<0) ? -num : num;
		System.out.println("절대값 : " + num);
		
		// JAVA는 절대값 함수가 있다
		num = Math.abs(-5);
		System.out.println("-5의 절대값 : " + num);
		
		sc.close();
		
	}
}
