package controlSet;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor, eng, math, sum;
		double avg;
		char rank= ' ';
		System.out.print("국영수 세 과목의 성적 입력: ");
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		sum = kor + eng+ math;
		avg = sum/3.0;
		
		System.out.println("합계는 : " + sum);
		System.out.printf("평균은 : %.2f\n" , avg);
		
		if (avg>= 0 && avg<=100) {
			if(avg >= 90)	{rank = 'A';}
			else if(avg >= 80)	{rank = 'B';}
			else if(avg >= 70)	{rank = 'C';}
			else if(avg >= 60)	{rank = 'D';}
			else	{rank = 'F';}
		}
		else {
			System.out.print("나올 수 없는 점수 입니다");
		}
		System.out.print("등급은 : " + rank);
		
		
		sc.close();
	}
}
