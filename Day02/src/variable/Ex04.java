package variable;

public class Ex04 {
	public static void main(String[] args) {
		int n = 2000000000;		// 20��
		
		System.out.println("n = " + n + "\n");
		
		
		// �������� �ۼ��غ���
		boolean bo = true;
		byte by = 127;
		short sh = 32767;
		char ch = 'A';
		long lo = 3000000000L;	// L : ���ͷ� ������ long(= 8byte)�� ��ƶ�~
		
		// The literal 3000000000 of type int is out of range
		// �� ���ͷ� : ������ ������� ���� ���� �ǹ�. ��, �ӽð�
		// - ���а��� �ڷ����� �⺻������ ������ �Ҵ�ȴ�
		// - ������ �⺻�� int�̰�, �Ǽ��� double�̴�
		
		float fl = 3.14F;		// F : ���ͷ�  ������ float���� ��ƶ�~
		double db = 3.14;
		
		System.out.println("bo = " + bo);
		System.out.println("���ͷ� = " + true + "\n");		// ���� : ������ false
		
		System.out.println("by = " + by);
		System.out.println("sh = " + sh);
		System.out.println("ch = " + ch);
		System.out.println("lo = " + lo);
		System.out.println("fl = " + fl);
		System.out.println("db = " + db);
		
		
	}
}
