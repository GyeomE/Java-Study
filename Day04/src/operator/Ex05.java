package operator;

public class Ex05 {
	public static void main(String[] args) {
		//�� ������ : ��/������ �����ϴ� ������
		// - ����) and(&&), or(||), not(!)
		
		// 1. and ���� ��� ���̸� ����� ��
		// �ٸ����� ��(*)�����̶�� �Ѵ�
		System.out.println("true and true ��� : " + (true&&true));
		System.out.println("true and flase ��� : " + (true&&false));
		System.out.println("flase and true ��� : " + (false&&true));
		System.out.println("flase and flase ��� : " + (false&&false) + "\n");
		
		
		// 2. or : ���� ��� �����̸� ����� ����
		// �ٸ����� ��(+)�����̶�� �Ѵ�
		System.out.println("true and true ��� : " + (true||true));
		System.out.println("true and flase ��� : " + (true||false));
		System.out.println("flase and true ��� : " + (false||true));
		System.out.println("flase and flase ��� : " + (false||false)+ "\n");
		
		
		// 3. not : ���� ��������, ������ ������ ����
		// �ٸ����� ���� �����̶�� �Ѵ�
		System.out.println("not true ��� : " + !true);
		System.out.println("not flase ��� : " + !false);

	}
}
