package variable;

// ���� : �����͸� �����ϴ� ����, ���ϴ� ��

public class Ex01 {
	public static void main(String[] args) {
		// ������ ���� : ������ �����ϴ� ��
		// �ۼ���� : �ڷ��� ������;
		
		int n;
		
		n = 10;		// = �� ���Կ����̶�� �ϸ�, ������ ���� �Ҵ��Ѵ�
		
		System.out.println("n");		// ""�� ���� �����ʹ� ���ڿ� -> ��, �״�� ���
		
		System.out.println(n);			// ""�� ���� ������ �ۼ� -> ������ ȣ��
		//		   println(10);
		
		
		n = 20;		// ������ ���� ��������, ���� ���� �Ҵ�Ǹ� �����~
		
		System.out.println(n);
		System.out.println();
		
		// ���ڿ��� �̾ ����ϴ� ���
		System.out.println("n = " + n);		// + �������� �̾� ���ϼ� �ִ�
		System.out.printf("n = %d", n);		// Ȥ�� printf()�� ���Ĺ���(= ���乮��)�� ���ؼ� ��� ����
	}
}
