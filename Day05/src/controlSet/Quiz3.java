package controlSet;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count, price = 5000, result;
		
		System.out.print("USB�� � �����Ͻðڽ��ϱ�? : ");
		count = sc.nextInt();
		
		if(count>=100) {
			result = (count*price)/100*88;
		}
		else if(count>=10) {
			result = (count*price)/100*90;
		}
		else{
			result = count*price;
		}
		if(count<0) {
			System.out.print("������ �Է��ϽǼ� �����ϴ�");
			return;
		}
		System.out.println("�ʿ��� �ݾ��� : " + result);
		sc.close();
	}
}
