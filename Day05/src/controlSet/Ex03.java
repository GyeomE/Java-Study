package controlSet;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// 중첩 조건문 : 조건문 안에 조건문을 구성하는 방식
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("정수 입력  :");
		num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println(num + "(은)는 짝수");
			
			if(num % 3 == 0) {		//조건을 세부적으로 판별하기 위해서 사용한다
				System.out.println(num + "(은)는 짝수이며 3의 배수");
			}
			
			else {
				System.out.println(num + "(은)는 짝수이지만 3의 배수는 아니다");
			}
		}
		
		else {
			System.out.println(num + "(은)는 홀수");
			
			// 홀수이며 3의 배수와
			// 홀수이지만 3의 배수 아님을 나눠 출력하게 해보라
			if(num%3==0) {
				System.out.println(num + "(은)는 홀수이며 3의 배수");
			}
			else {
				System.out.println(num + "(은)는 홀수이지만 3의 배수는 아니다");
			}
		}
		
		sc.close();
		
	}
}
