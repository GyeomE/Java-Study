package controlSet;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count, time, result, hour, minute;
		System.out.print("정거장 수 : ");
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
			System.out.println("총 소요 시간은 " + hour + "시간 "+ minute + "분 " + "입니다.");
		}
		else{
			System.out.println("총 소요 시간은 " + result +" 분"+ "입니다.");
		}
		
		sc.close();
	}
}
