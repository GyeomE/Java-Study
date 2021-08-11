package input;

import java.util.Scanner;

// 버퍼(=buffer) : 데이터를 저장하는 임시 공간
// - Scanner는 입력시 버퍼에서 '띄어쓰기'나 '줄바꿈'을 구분자로 데이터를 가져온다

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1,n2;
		
		System.out.print("두 정수 입력 : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		System.out.println("n1 = "+n1+", n2= " + n2 + "\n");
		
		
		sc.nextLine(); // 버퍼에서 줄바꿈 전까지 모두 가져온다
					   // 즉, 버퍼의 모든 내용을 끄집어 낸다
		int n3, n4;
		
		System.out.print("다시 두 정수 입력: ");
		n3 = sc.nextInt();
		n4 = sc.nextInt();
		
		System.out.println("n3 = "+n3+", n4= " + n4);
		sc.close();
	}
}
