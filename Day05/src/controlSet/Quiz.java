package controlSet;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		// 1. �� ������ �Է� �޾Ƽ� ū ���� ���
		// ��, ������ '����'��� ����Ѵ�
		Scanner sc = new Scanner(System.in);
		
		int n1, n2;
		String result;
		System.out.print("�� ������ �Է�: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		if(n1>n2) {
			System.out.println(n1+" ��(��) " + n2+"���� ũ��");
		}
		else if( n1< n2) {
			System.out.println(n2+" ��(��)" + n1 + "���� ũ��");
		}
		else {
			System.out.println("�� ���� ����");
		}
		
		// 2. ������ �Է� �޾Ƽ� ���밪�� ���
		int n3;
		System.out.print("������ �Է�: ");
		n3 = sc.nextInt();
		
		if(n3<0) {
			System.out.println("������ ���밪�� : " + -n3);
		}
		else {
			System.out.println("������ ���밪�� : "+ n3);
		}
		// 3. �� ������ �Է� �޾Ƽ� ���� ū ���� ����Ѵ�
		int n4,n5,n6;
		System.out.print("�� ������ �Է��Ͻÿ� : ");
		n4 = sc.nextInt();
		n5 = sc.nextInt();
		n6 = sc.nextInt();
		if(n4 > n5) {
			if(n4>n6) {
				System.out.println("���� ū ���� : " + n4);
			}
			else {
				System.out.println("���� ū ���� : " + n6);
			}
		}
		else if(n5>n6){
			System.out.println("���� ū ���� : " + n5);
		}
		else {
			System.out.println("���� ū ����: " + n6);
		}
		int max, min;
		min = max = n1;
		
		//�ִ�
		if ( max < n2)	{ max = n2;}
		if  (max < n3)  { max = n3;}
		
		//�ּ�
		if(min>n2) {min=n2;}
		if(min>n3) {min=n3;}

		//4. ������ �Է� �޾Ƽ� 3�� 7�� ������� �Ǻ�
		int n7;
		System.out.print("������ �Է�: ");
		n7 = sc.nextInt();
		if(n7 % 21 ==0) {
			System.out.println(n7 + "��(��) 3�� 7�� ������̴�");
		}
		else if(n7%3==0) {
			System.out.println(n7 + "��(��) 3�� ������̴�");
		}
		else if(n7 % 7==0) {
			System.out.println(n7 + "��(��) 7�� ������̴�");
		}
		else {
			System.out.println(n7 + "�� 3�� 7�� ����� ����͵� �ƴϴ�");
		}
		
		sc.close();
	}
}
