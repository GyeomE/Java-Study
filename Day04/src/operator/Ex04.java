package operator;

public class Ex04 {
	public static void main(String[] args) {
		// ��( =����) ������ : �������� ��� ���踦 ���ϴ� ������
		// - ����) < , <= , > , >= , == , !=
		
		System.out.println("10 > 9 ��� : " + (10 > 9));
		System.out.println("10 > 9 ��� : " + (10 < 9) + "\n");
		
		System.out.println("10 > 10 ��� : " + (10 > 10));
		System.out.println("10 >= 10 ��� : " + (10 >= 10) + "\n");
		
		System.out.println("10 == 10 ��� : " + (10 == 10));		//��ġ�ϸ� ��, �ٸ��� ����
		System.out.println("10 != 10 ��� : " + (10 != 10) + "\n");//��ġ�ϸ� ����, �ٸ��� ��
		
		boolean result = 10 > 9; // ����� boolean ������ ���� �� ���� ��밡���ϴ� ����
		
		System.out.println("result = " + result);
		
		boolean even = 10 % 2 == 0;
		
		System.out.println("¦��? = " + even);
	}

}
