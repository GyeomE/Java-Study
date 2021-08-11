package input;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		//1. 이름, 국 영 수 점수를 저장할 변수를 선언
		String name;
		int kor, eng, math, sum;
		double avg;

		//2. 1번의 변수에 Scanner를 활영해서 입력받는다
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		name=sc.next();
		
		System.out.print("국어: 영어 : 수학: ");
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		
		sum = kor + eng + math;
		avg = sum / 3.0;
		
		//3. 출력시
		System.out.println("\n이름: " + name);
		System.out.println("국어 : " + kor + "영어 : " + eng + "수학: "+ math );
		//System.out.printf("국 %d, 영 %d, 수%d\n" , kor, eng, math);
		System.out.println("합계  : " + sum + "(=" + avg + ")");
		
		
		//이름: 홍길동
		// 국 70 영 80 수 98
		// 합계 : 248 (=83.67)
	}

}
