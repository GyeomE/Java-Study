package operator;

public class Ex04 {
	public static void main(String[] args) {
		// 비교( =관계) 연산자 : 데이터의 대소 관계를 비교하는 연산자
		// - 종류) < , <= , > , >= , == , !=
		
		System.out.println("10 > 9 결과 : " + (10 > 9));
		System.out.println("10 > 9 결과 : " + (10 < 9) + "\n");
		
		System.out.println("10 > 10 결과 : " + (10 > 10));
		System.out.println("10 >= 10 결과 : " + (10 >= 10) + "\n");
		
		System.out.println("10 == 10 결과 : " + (10 == 10));		//일치하면 참, 다르면 거짓
		System.out.println("10 != 10 결과 : " + (10 != 10) + "\n");//일치하면 거짓, 다르면 참
		
		boolean result = 10 > 9; // 결과를 boolean 변수에 저장 해 놓고 사용가능하니 참고
		
		System.out.println("result = " + result);
		
		boolean even = 10 % 2 == 0;
		
		System.out.println("짝수? = " + even);
	}

}
