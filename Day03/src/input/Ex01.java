package input;

import java.lang.System;
import java.io.IOException;
import java.lang.Math;

// lang�� �ڹ� ���߿� �ʼ����� Ŭ�������� �ֱ� ������ �ڵ����� import�ȴ�

public class Ex01 {
	public static void main(String[] args) throws IOException {
		// System Ŭ���� : ǥ�� ������� ���� Ŭ����
		// - out : ǥ�� ��� ��Ʈ��
		// - in : ǥ�� �Է� ��Ʈ��
		
		// ��Ʈ��(stream)? : �����Ͱ� �������� ���
		
		System.out.println("���ڿ��� ��� \n");
		
		
		
		System.out.print("�ܾ� �ϳ� �Է� : ");
		int n = System.in.read();
		// Unhandled exception type IOException
		
		
		//read()�� �Է¹��� Ű���� uni-code�� �������� �ȴ� => ���� �����ϴ�
		
		System.out.println("n = " + n);
		System.out.println("n = "+(char)n);
	}

}
