package casting;

public class Quiz {
	public static void main(String[] args) {
		//1. �̸�, �� �� �� ������ ������ ������ ����
		//��, �� �� ���� ���������� �����Ѵ�
		String name = "ȫ�浿";
		int kor = 70, eng = 80 , math = 98;
		int sum = kor+eng+math;
		double avg = (kor+eng+math)/3.0;
		//2. 1���� ������ ���� ä���
		
		//3. �Ʒ��� ���� ��µǰ� �Ѵ�
		System.out.println("�̸� : " + name);
		System.out.println("��  " + kor +" ��  "+ eng +" �� " + math);
		System.out.println("�հ�  : " + sum + "��");
		System.out.println("��� : " + avg);
		// �̸� : ȫ�浿
		// �� 70, �� 80, �� 98
		// �հ� : 248��
		// ��� : 82.66666667
		
		
		
		// �Ҽ��� ����
		// 1. printf()�� ���
		//System.out.printf("��� : %.2f\n", sum/3.0);
		
		// 2. round()�Լ��� ���
		//double avg = sum/ 3.0;
		//double result = Math.round(avg*100)/100.0;
		
		//System.out.println("result = " + result);
	}

}
