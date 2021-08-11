package controlSet;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		// 1. 두 정수를 입력 받아서 큰 수를 출력
		// 단, 같으면 '같다'라고 출력한다
		Scanner sc = new Scanner(System.in);
		
		int n1, n2;
		String result;
		System.out.print("두 정수를 입력: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		if(n1>n2) {
			System.out.println(n1+" 이(가) " + n2+"보다 크다");
		}
		else if( n1< n2) {
			System.out.println(n2+" 이(가)" + n1 + "보다 크다");
		}
		else {
			System.out.println("두 수는 같다");
		}
		
		// 2. 정수를 입력 받아서 절대값을 출력
		int n3;
		System.out.print("정수를 입력: ");
		n3 = sc.nextInt();
		
		if(n3<0) {
			System.out.println("정수의 절대값은 : " + -n3);
		}
		else {
			System.out.println("정수의 절대값은 : "+ n3);
		}
		// 3. 세 정수를 입력 받아서 가장 큰 수를 출력한다
		int n4,n5,n6;
		System.out.print("세 정수를 입력하시오 : ");
		n4 = sc.nextInt();
		n5 = sc.nextInt();
		n6 = sc.nextInt();
		if(n4 > n5) {
			if(n4>n6) {
				System.out.println("가장 큰 수는 : " + n4);
			}
			else {
				System.out.println("가장 큰 수는 : " + n6);
			}
		}
		else if(n5>n6){
			System.out.println("가장 큰 수는 : " + n5);
		}
		else {
			System.out.println("가장 큰 수는: " + n6);
		}
		int max, min;
		min = max = n1;
		
		//최대
		if ( max < n2)	{ max = n2;}
		if  (max < n3)  { max = n3;}
		
		//최소
		if(min>n2) {min=n2;}
		if(min>n3) {min=n3;}

		//4. 정수를 입력 받아서 3과 7의 공배수를 판별
		int n7;
		System.out.print("정수를 입력: ");
		n7 = sc.nextInt();
		if(n7 % 21 ==0) {
			System.out.println(n7 + "은(는) 3과 7의 공배수이다");
		}
		else if(n7%3==0) {
			System.out.println(n7 + "은(는) 3의 공배수이다");
		}
		else if(n7 % 7==0) {
			System.out.println(n7 + "은(는) 7의 공배수이다");
		}
		else {
			System.out.println(n7 + "은 3과 7의 공배수 어느것도 아니다");
		}
		
		sc.close();
	}
}
