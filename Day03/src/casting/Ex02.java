package casting;

public class Ex02 {
	public static void main(String[] args) {
	
		System.out.println("10 / 3 = " + 10 / 3);	//3 int/int�ϱ� ����ȯ X
		System.out.println("10 / 3.0" + 10 / 3.0 +"\n");	//3.33333333333333335 Ÿ���� �ٸ��ϱ� double/double�� ��
	
	
		int n1 = 10, n2 = 3;
		System.out.println("n1 / n2 = " + n1 / n2);
		System.out.println("n1 / n2 = " + n1/ (double)n2);
		//int /double -> double / double =>���� ����ȯ
		
		
		
		System.out.println("n2 = " + (double)n2);
		System.out.println("n2 = " + n2);
		//���� ����ȯ
		// - �ٲٷ��ϴ� ������ ����� �տ� ()�ȿ� �ڷ����� �ۼ��ϸ� �ȴ�
		// - ��������ȯ�� �ش� �������� '�Ͻ���'���� �ٲ��
	}
}
