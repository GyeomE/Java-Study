package controlSet;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count, time, result, hour, minute;
		System.out.print("������ �� : ");
		count = sc.nextInt();
		
		if(count >=10) {
			time = 4;
			result = time*count;
		}
		else {
			time = 2;
			result = time*count;
		}
		if(result>=60) {
			hour= result/60;
			minute = result%60;
			System.out.println("�� �ҿ� �ð��� " + hour + "�ð� "+ minute + "�� " + "�Դϴ�.");
		}
		else{
			System.out.println("�� �ҿ� �ð��� " + result +" ��"+ "�Դϴ�.");
		}
		
		sc.close();
	}
}
