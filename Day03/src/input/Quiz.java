package input;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		// 1. 이름, 나이, 키, 성별을 입력받을 변수를 선언한다
		// 단, 성별은 꼭 char로 선언한다
		String name;
		int age;
		double height;
		char sex;
		
		//2. 1번의 변수에 입력구문을 활용해서 입력 받는다
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		name = sc.next();
		System.out.print("나이 : ");
		age = sc.nextInt();
		System.out.print("신장 : ");
		height = sc.nextDouble();
		System.out.print("성별 : ");
		sex = sc.next().charAt(0);
		
		// 3. 아래와 같이 출력
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "세");
		System.out.println("신장 : " + height + "cm");
		System.out.println("성별: " + sex);
		
		
		// 이름 : 홍길동
		// 나이 : 23세
		// 신장 : 181.5cm
		// 성별 : 여
		sc.close();
	}
}
