package print;

public class Ex03 {
	public static void main(String[] args) {
		// escape sequence : ���ڿ� ������ Ư���� ���·� ���Ǵ� ���ڵ�
	
		System.out.println("1. Hello\nWorld");				// \n : new line, �� �� or �ٹٲ�
		System.out.println("2. Hello\t World");				// \t : tab, �鿩����
		
		System.out.println();	// �� println()�� �ٹٲ޿����� ���Ǳ⵵ �Ѵ�
		
		System.out.println("3. Hello\n\nWorld\n");			// �̽��������� ���ڿ� ������ ������ ��� ����
		
		System.out.println("���� �ڹ� ������ \"jdk1.8\" �Դϴ�");	// \" : ���ڿ� ���� ����� ����. ��, �Ϲ� ���ڰ� ��
		System.out.println("���� ���� : \\\\192.168.0.37");		// \\ : �̽������� ����� ����
	}
}
