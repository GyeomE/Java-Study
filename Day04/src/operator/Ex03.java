package operator;

public class Ex03 {
	public static void main(String[] args) {
		// ���� ������ : �ǿ����ڸ� 1 ���� Ȥ�� 1 ���� ��Ű�� ������
		
		int n = 10;
		
		n++;		// ��ġ
		System.out.println("n = " + n);	//11
		
		n--;
		System.out.println("n = " + n);	//10
		
		++n;		// ��ġ
		System.out.println("n = " + n);	//11
		
		--n;
		System.out.println("n = " + n + "\n");	//10
		
		// �Ϲ������� ��ġ�� ��ġ�� ����� ���̰� ����
		// ��, �ٸ� ����� ���� ���� ���, ����� �޶�����
		
		int n1 = 10, n2, n3;
		
		n2 = ++n1;		// ��ġ : ���� �� �ٸ� ������ ����
		System.out.println("n1 = " + n1 + ", n2 = " + n2);
		
		n1 = 10;
		
		n3 = n1++;		// ��ġ : �ٸ� ���� ���� �� ����
		
		System.out.println("n1 = " + n1 + ", n3 = " + n3);
		
		
		int a = 8 , b = 2 , c = 3, d;
		
		d = ++a + b-- + c++;
		
		System.out.println("a = " + a); //9
		System.out.println("b = " + b); //1
		System.out.println("c = " + c); //4
		System.out.println("d = " + d); //14
		
	}
}
