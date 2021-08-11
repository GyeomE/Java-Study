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
		System.out.println("절대값 : " + Math.abs(n));
		
	}
}
