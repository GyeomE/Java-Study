package controlSet;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count, price = 5000, result;
		
		System.out.print("USB를 몇개 구매하시겠습니까? : ");
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
			System.out.print("음수는 입력하실수 없습니다");
			return;
		}
		System.out.println("필요한 금액은 : " + result);
		sc.close();
	}
}
