package controlSet;
// ��� : �ڵ��� �帧�� �����ϴ� ����
// - 1. ���ǹ� 		: ��/������ ���� �ڵ��� �帧�� �б�
// - 2. �ݺ���		: ��/������ ���� �ڵ带 ����
// - 3. ���� ��� 	: ���� �� ������ �����ϴ� ����

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// ���ǹ� if : ���ǽ��̸� ���̸�, ���ӹ���(= ������)�� ����
		// 			 �����̸�, �׳� ���� �������� �Ѿ��.
		
		// ���ǹ� else : if�� �ѽ��� �Ǹ�, �ܵ����� ��� �Ұ���
		// 			 ���� ������ �����̸� �����ϴ� ����, ���ǽ��� ����
		
		Scanner sc = new Scanner(System.in);
		int age;
		
		System.out.print("���� �Է� : ");
		age = sc.nextInt();
		
		if (age >= 20) {	//	if (���ǽ�) { ���ӹ���  }
			System.out.print("���� ");
		}
		else {				// else { ���ӹ���  } 
			System.out.print("�̼����� ");
		}
		
		System.out.println("�Դϴ�~");
		
		
		
		sc.close();
	}
}
