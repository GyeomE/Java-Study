package casting;

// ����ȯ : ������ Ÿ��(=�ڷ���)�� �����ϴ� ��
// - 1. �ڵ� ����ȯ : ����� �ڵ����� �߻��ϸ�, �ٸ� Ÿ�԰��� ������ �����ϰ� �ϴ� ����ȯ
// - 2. ���� ����ȯ : �����ڰ� ���� �ڷ����� ��ȯ�ϴ� ���
public class Ex01 {
	public static void main(String[] args) {
		
		System.out.println(10 + 3.14);		// int + double -> double + double
		System.out.println("10" + 3.14);	//String + double -> String + String
		System.out.println("10" + "3.14");	
		
		System.out.println("10 + 3 = " + 10 + 3);
		//String + int + int 
		//String + String + int
		//String + String + String
		System.out.println("10 + 3 = " + (10 + 3));
	}

}
