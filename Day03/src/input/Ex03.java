package input;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		//�Ʒ� ������ ���� �Է� �޾ƺ���
		Scanner sc = new Scanner(System.in);
		
		String str;
		boolean bo;
		byte by;
		short sh;
		int it;
		long lo;
		float fl;
		double db;
		// 1. ���ڿ�
		System.out.print("���ڿ� �Է� : ");
		str = sc.next(); // ���ڿ��� next()��
		System.out.println("str = " + str);
		// 2. ����
		System.out.print("boolean �Է� : ");
		bo = sc.nextBoolean();
		System.out.println("bo = " + bo);
		// 3. ������
		System.out.print("byte �Է� : ");
		by = sc.nextByte();
		System.out.println("by = " + by);
		
		System.out.print("short �Է� : ");
		sh = sc.nextShort();
		System.out.println("sh = " + sh);
		
		System.out.print("int �Է� : ");
		it = sc.nextInt();
		System.out.println("it = " + it);
		// 4. �Ǽ���
		System.out.print("long �Է� : ");
		lo = sc.nextLong();
		System.out.println("lo = " + lo);
		
		System.out.print("float �Է� : ");
		fl = sc.nextFloat();
		System.out.println("fl = " + fl);
		
		System.out.print("double �Է� : ");
		db = sc.nextDouble();
		System.out.println("db = " + db);
		
		
		
		sc.close();
	}
}
