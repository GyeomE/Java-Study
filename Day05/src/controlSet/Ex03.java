package controlSet;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// ��ø ���ǹ� : ���ǹ� �ȿ� ���ǹ��� �����ϴ� ���
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("���� �Է�  :");
		num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println(num + "(��)�� ¦��");
			
			if(num % 3 == 0) {		//������ ���������� �Ǻ��ϱ� ���ؼ� ����Ѵ�
				System.out.println(num + "(��)�� ¦���̸� 3�� ���");
			}
			
			else {
				System.out.println(num + "(��)�� ¦�������� 3�� ����� �ƴϴ�");
			}
		}
		
		else {
			System.out.println(num + "(��)�� Ȧ��");
			
			// Ȧ���̸� 3�� �����
			// Ȧ�������� 3�� ��� �ƴ��� ���� ����ϰ� �غ���
			if(num%3==0) {
				System.out.println(num + "(��)�� Ȧ���̸� 3�� ���");
			}
			else {
				System.out.println(num + "(��)�� Ȧ�������� 3�� ����� �ƴϴ�");
			}
		}
		
		sc.close();
		
	}
}
