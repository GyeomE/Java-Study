package input;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		int age;
		double height;
		String address;
		
		System.out.print("이름 : ");
		name = sc.next();
		
		System.out.print("나이 : ");
		age = sc.nextInt();
		
		System.out.print("신장 : ");
		height = sc.nextDouble();
		
		sc.nextLine();			 // 2. 따라서 버퍼 처리가 필요하다
		
		System.out.print("주소 : ");
		address = sc.nextLine(); // nextLine()은 앞의 남은 줄바꿈을 제거하지 못 함
								 // -> 2번으로
		
		System.out.println("\n이름: " + name);
		System.out.println("나이 : " + age);
		System.out.println("신장 : " + height);
		System.out.println("주소 : " + address);
		
		sc.close();
	
	}
}
