package input;

import java.util.Scanner;

// ����(=buffer) : �����͸� �����ϴ� �ӽ� ����
// - Scanner�� �Է½� ���ۿ��� '����'�� '�ٹٲ�'�� �����ڷ� �����͸� �����´�

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1,n2;
		
		System.out.print("�� ���� �Է� : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		System.out.println("n1 = "+n1+", n2= " + n2 + "\n");
		
		
		sc.nextLine(); // ���ۿ��� �ٹٲ� ������ ��� �����´�
					   // ��, ������ ��� ������ ������ ����
		int n3, n4;
		
		System.out.print("�ٽ� �� ���� �Է�: ");
		n3 = sc.nextInt();
		n4 = sc.nextInt();
		
		System.out.println("n3 = "+n3+", n4= " + n4);
		sc.close();
	}
}
