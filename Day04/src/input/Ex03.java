package input;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		//1. �̸�, �� �� �� ������ ������ ������ ����
		String name;
		int kor, eng, math, sum;
		double avg;

		//2. 1���� ������ Scanner�� Ȱ���ؼ� �Է¹޴´�
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� : ");
		name=sc.next();
		
		System.out.print("����: ���� : ����: ");
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		
		sum = kor + eng + math;
		avg = sum / 3.0;
		
		//3. ��½�
		System.out.println("\n�̸�: " + name);
		System.out.println("���� : " + kor + "���� : " + eng + "����: "+ math );
		//System.out.printf("�� %d, �� %d, ��%d\n" , kor, eng, math);
		System.out.println("�հ�  : " + sum + "(=" + avg + ")");
		
		
		//�̸�: ȫ�浿
		// �� 70 �� 80 �� 98
		// �հ� : 248 (=83.67)
	}

}
