package operator;

import java.util.Scanner;

// ���� : ����  ex) a++
// ���� : ���, ����, ��, ��  ex) a + b
// ���� : ����

public class Ex06 {
	public static void main(String[] args) {
		// ���� ������ : ���ǿ� ���� ���� '����'�ϴ� ������
		// ���� 
		// (���ǽ�) ? �� : ����
		
		Scanner sc = new Scanner(System.in);
		int n;
		String result;
		
		System.out.print("���� �Է� : ");
		n = sc.nextInt();
		
		result = (n%2 ==0) ? "¦��" : "Ȧ��";
		
		System.out.println("result = " + result + "\n");
		
		
		// ����
		// �� ������ �Է� �޾Ƽ� ū ���� ��� �غ���
		// ��, ���� ���� � ���� ����ϵ� �������
		int n1, n2, result2;
		System.out.print("���� �Է�: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		result2 = (n1>n2) ? n1 : n2;
		System.out.println("result2 = " + result2 + "\n");
		
		
		sc.close();
	}
}
