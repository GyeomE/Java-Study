package operator;

public class Ex05 {
	public static void main(String[] args) {
		//논리 연산자 : 참/거짓을 연산하는 연산자
		// - 종류) and(&&), or(||), not(!)
		
		// 1. and 양쪽 모두 참이면 결과가 참
		// 다른말로 곱(*)연산이라고 한다
		System.out.println("true and true 결과 : " + (true&&true));
		System.out.println("true and flase 결과 : " + (true&&false));
		System.out.println("flase and true 결과 : " + (false&&true));
		System.out.println("flase and flase 결과 : " + (false&&false) + "\n");
		
		
		// 2. or : 양쪽 모두 거짓이면 결과가 거짓
		// 다른말로 합(+)연산이라고 한다
		System.out.println("true and true 결과 : " + (true||true));
		System.out.println("true and flase 결과 : " + (true||false));
		System.out.println("flase and true 결과 : " + (false||true));
		System.out.println("flase and flase 결과 : " + (false||false)+ "\n");
		
		
		// 3. not : 참을 거짓으로, 거짓을 참으로 부정
		// 다른말로 반전 연산이라고 한다
		System.out.println("not true 결과 : " + !true);
		System.out.println("not flase 결과 : " + !false);

	}
}
