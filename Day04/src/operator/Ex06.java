package operator;

import java.util.Scanner;

// 일항 : 증감  ex) a++
// 이항 : 산술, 대입, 비교, 논리  ex) a + b
// 삼항 : 조건

public class Ex06 {
	public static void main(String[] args) {
		// 조건 연산자 : 조건에 따라서 값을 '선택'하는 연산자
		// 형태 
		// (조건식) ? 참 : 거짓
		
		Scanner sc = new Scanner(System.in);
		int n;
		String result;
		
		System.out.print("정수 입력 : ");
		n = sc.nextInt();
		
		result = (n%2 ==0) ? "짝수" : "홀수";
		
		System.out.println("result = " + result + "\n");
		
		
		// 연습
		// 두 정수를 입력 받아서 큰 수를 출력 해본다
		// 단, 같은 경우는 어떤 수를 출력하든 상관없다
		int n1, n2, result2;
		System.out.print("정수 입력: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		result2 = (n1>n2) ? n1 : n2;
		System.out.println("result2 = " + result2 + "\n");
		
		
		sc.close();
	}
}
