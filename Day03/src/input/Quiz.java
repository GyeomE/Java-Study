package input;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		// 1. �̸�, ����, Ű, ������ �Է¹��� ������ �����Ѵ�
		// ��, ������ �� char�� �����Ѵ�
		String name;
		int age;
		double height;
		char sex;
		
		//2. 1���� ������ �Է±����� Ȱ���ؼ� �Է� �޴´�
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� : ");
		name = sc.next();
		System.out.print("���� : ");
		age = sc.nextInt();
		System.out.print("���� : ");
		height = sc.nextDouble();
		System.out.print("���� : ");
		sex = sc.next().charAt(0);
		
		// 3. �Ʒ��� ���� ���
		
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age + "��");
		System.out.println("���� : " + height + "cm");
		System.out.println("����: " + sex);
		
		
		// �̸� : ȫ�浿
		// ���� : 23��
		// ���� : 181.5cm
		// ���� : ��
		sc.close();
	}
}
