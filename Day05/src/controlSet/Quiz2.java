package controlSet;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor, eng, math, sum;
		double avg;
		char rank= ' ';
		System.out.print("������ �� ������ ���� �Է�: ");
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		sum = kor + eng+ math;
		avg = sum/3.0;
		
		System.out.println("�հ�� : " + sum);
		System.out.printf("����� : %.2f\n" , avg);
		
		if (avg>= 0 && avg<=100) {
			if(avg >= 90)	{rank = 'A';}
			else if(avg >= 80)	{rank = 'B';}
			else if(avg >= 70)	{rank = 'C';}
			else if(avg >= 60)	{rank = 'D';}
			else	{rank = 'F';}
		}
		else {
			System.out.print("���� �� ���� ���� �Դϴ�");
		}
		System.out.print("����� : " + rank);
		
		
		sc.close();
	}
}
