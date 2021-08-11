package controlSet;
// 제어문 : 코드의 흐름을 제어하는 구문
// - 1. 조건문 		: 참/거짓에 따라서 코드의 흐름을 분기
// - 2. 반복문		: 참/거짓에 따라서 코드를 루프
// - 3. 보조 제어문 	: 위의 두 구문을 보조하는 구문

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// 조건문 if : 조건식이면 참이면, 종속문장(= 포함한)을 수행
		// 			 거짓이면, 그냥 다음 구문으로 넘어간다.
		
		// 조건문 else : if와 한쌍이 되며, 단독으로 사용 불가능
		// 			 위의 조건이 거짓이면 수행하는 문장, 조건식이 없다
		
		Scanner sc = new Scanner(System.in);
		int age;
		
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		
		if (age >= 20) {	//	if (조건식) { 종속문장  }
			System.out.print("성인 ");
		}
		else {				// else { 종속문장  } 
			System.out.print("미성년자 ");
		}
		
		System.out.println("입니다~");
		
		
		
		sc.close();
	}
}
