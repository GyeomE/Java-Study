package operator;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n , result2;
		String result1;
		
		System.out.println("������ �Է� : ");
		n = sc.nextInt();
		
		result1 = (n % 3 == 0) ? "��" : "����";
		System.out.println("n�� 3�� ��� = " + result1);
		System.out.println("���밪 : " + Math.abs(n));
		
	}
}
