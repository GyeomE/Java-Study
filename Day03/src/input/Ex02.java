package input;

import java.util.Scanner;
//jvava.lang�� �ƴ� �ֵ��� ���� import�� �ʿ��ϴ�

public class Ex02 {
	public static void main(String[] args) {
		//�Է��� �� �� �����ϰ� �ϱ� ���ؼ� 
		//Scanner��� �ϴ� �����͸� �о� ���� ������ ���
		
		Scanner sc;
		
		sc = new Scanner(System.in); // new Ŭ������() : Ŭ������ ������ �����ض�
		//Resource leak: 'sc' is never closed
		sc.next();
		
		int n;
		
		System.out.print("�����Է� : ");
		n= sc.nextInt(); // next�ڷ���() : �Է� ��Ʈ������ �ش� �ڷ����� �����͸� �����´�
		
		System.out.println("n = " + n+ "\n");
		
		double r;
		
		System.out.print("������ �Է�: ");
		r = sc.nextDouble();
		
		System.out.println("������ : "+r*r*3.14);
		
		sc.close(); //Scanner�� �� ���� �ݴ� ������ ������~
	}

}
