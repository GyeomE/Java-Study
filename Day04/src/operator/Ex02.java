package operator;

public class Ex02 {
	public static void main(String[] args) {
		// ���� ������ : ���� �Ҵ��ϴ� ������
		// ����) = 
		
		// ��
		// 1. ���� �������� �º��� '����', �캯�� '�����'�� �ǹ�
		// 2. ���� ������ �׻� �캯���� ó���Ѵ�
		// 3. ���� �������� �纯�� �ڷ����� ��ġ ��Ų��->error �߻���Ŵ
		
		
		int n = 10 + 2 + 3 + 5;// �⺻�� int
		//int n2 = (int)3.14;// �⺻�� double
		
		System.out.println("n = " + n + "\n");
		
		int n1, n2, n3 = 30;
		// n3 �� 30�ϱ�? ��� 30�ϱ�?
		
		n1 = n2 = n3 = 30;
		System.out.println("n1 = " + n1);
		System.out.println("n2 = " + n2);
		System.out.println("n3 = " + n3 + "\n");
		
		// ���� ���� ������ : ��� + ����
		// - ����) += , -=, *=, /=, %=
		
		n1 += 2; // n1 = n1 + 2;
		System.out.println("n1 = " + n1); //32
		
		n1 -= 3;
		System.out.println("n1 = " + n1); //29
		
		n1 *= 2;
		System.out.println("n1 = " + n1); //58
		
		n1 /= 4;
		System.out.println("n1 = " + n1); //14
		
		n1 %= 3;
		System.out.println("n1 = " + n1); //2
		
		
		
		//����
		int a= 10, b=3 , c= 5;
		
		a += b -= c -= 4;
		
		System.out.println(" a = "+ a);//12
		System.out.println(" b = "+ b);//2
		System.out.println(" c = "+ c);//1
	}

}
