package input;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		//아래 변수에 각각 입력 받아보자
		Scanner sc = new Scanner(System.in);
		
		String str;
		boolean bo;
		byte by;
		short sh;
		int it;
		long lo;
		float fl;
		double db;
		// 1. 문자열
		System.out.print("문자열 입력 : ");
		str = sc.next(); // 문자열은 next()로
		System.out.println("str = " + str);
		// 2. 논리형
		System.out.print("boolean 입력 : ");
		bo = sc.nextBoolean();
		System.out.println("bo = " + bo);
		// 3. 정수형
		System.out.print("byte 입력 : ");
		by = sc.nextByte();
		System.out.println("by = " + by);
		
		System.out.print("short 입력 : ");
		sh = sc.nextShort();
		System.out.println("sh = " + sh);
		
		System.out.print("int 입력 : ");
		it = sc.nextInt();
		System.out.println("it = " + it);
		// 4. 실수형
		System.out.print("long 입력 : ");
		lo = sc.nextLong();
		System.out.println("lo = " + lo);
		
		System.out.print("float 입력 : ");
		fl = sc.nextFloat();
		System.out.println("fl = " + fl);
		
		System.out.print("double 입력 : ");
		db = sc.nextDouble();
		System.out.println("db = " + db);
		
		
		
		sc.close();
	}
}
