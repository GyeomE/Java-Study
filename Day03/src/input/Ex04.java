package input;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		// Ex03���� ����(char)�� �Է¹��� ����
		// nextChar() ���� �Լ��� ����
		
		String str = "apple";
		
		System.out.println("Str = "+ str);
		System.out.println("str[0] = " + str.charAt(0));
		System.out.println("str[0] = " + str.charAt(3));
		
		Scanner sc = new Scanner(System.in);
		char ch;
		
		System.out.print("���� �Է� : ");
		ch = sc.next().charAt(0);
		//Type mismatch: cannot convert from String to char
		
		System.out.println("ch = " + ch);
		
		sc.close();
	}
}
