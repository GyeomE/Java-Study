package variable;

public class Ex05 {
	public static void main(String[] args) {
		// �ռ� ����غ� �ڷ��� �� ���ڿ��� ������~
		// ���ڿ��� �⺻�ڷ����� �ƴ� Ŭ������ ������� �ְ�
		// �̴� '���� �ڷ���'�� �ش��Ѵ�
		
		char ch = 'A';			// ���� ���ڴ� ' ' (Ȭ����ǥ)
		
		String str = "apple";// ���ڿ��� " " (�ֵ���ǥ)
		//String str = new String("apple");	���� �ǹ̴�. ���̺귯���� ���ϰ� ����� ����Ǿ�����.
		
		// �� �迭�� ������
		int[] arr = new int[] { 10,20,30,40,50 };
		
		System.out.println("ch = " + ch);
		System.out.println("str = " + str);
		
		System.out.println("arr = " + arr);
		// ��> ���� ������ �ٷ� ����ϸ� �̻��� ���� ���
		// ��> '�ؽ� �ڵ�'��� �Ѵ�
		
		//index���� �־�����Ѵ� => arr[0] or arr[4] 
		//������ ����� �����Ⱚ�� �ƴ� �߸��ƴٰ� �����ش�.
	}
}
