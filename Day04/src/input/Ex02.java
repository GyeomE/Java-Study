package input;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		int age;
		double height;
		String address;
		
		System.out.print("�̸� : ");
		name = sc.next();
		
		System.out.print("���� : ");
		age = sc.nextInt();
		
		System.out.print("���� : ");
		height = sc.nextDouble();
		
		sc.nextLine();			 // 2. ���� ���� ó���� �ʿ��ϴ�
		
		System.out.print("�ּ� : ");
		address = sc.nextLine(); // nextLine()�� ���� ���� �ٹٲ��� �������� �� ��
								 // -> 2������
		
		System.out.println("\n�̸�: " + name);
		System.out.println("���� : " + age);
		System.out.println("���� : " + height);
		System.out.println("�ּ� : " + address);
		
		sc.close();
	
	}
}
