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
		
		int n1, n2, bigger;
		
		System.out.println("�� ������ �Է� : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		bigger = (n1>n2) ? n1 : n2;
		
		int num;
		System.out.print("���밪 ���: ");
		num = sc.nextInt();
		
		num = (num<0) ? -num : num;
		System.out.println("���밪 : " + num);
		
		// JAVA�� ���밪 �Լ��� �ִ�
		num = Math.abs(-5);
		System.out.println("-5�� ���밪 : " + num);
		
		sc.close();
		
	}
}
