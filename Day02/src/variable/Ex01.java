package variable;

// 변수 : 데이터를 저장하는 공간, 변하는 수

public class Ex01 {
	public static void main(String[] args) {
		// 변수의 선언 : 변수를 생성하는 것
		// 작성방식 : 자료형 변수명;
		
		int n;
		
		n = 10;		// = 는 대입연산이라고 하며, 변수에 값을 할당한다
		
		System.out.println("n");		// ""로 묶인 데이터는 문자열 -> 즉, 그대로 출력
		
		System.out.println(n);			// ""가 없는 데이터 작성 -> 변수의 호출
		//		   println(10);
		
		
		n = 20;		// 변수는 단일 공간으로, 값이 새로 할당되면 덮어쓴다~
		
		System.out.println(n);
		System.out.println();
		
		// 문자열과 이어서 출력하는 방법
		System.out.println("n = " + n);		// + 연산으로 이어 붙일수 있다
		System.out.printf("n = %d", n);		// 혹은 printf()의 서식문자(= 포멧문자)를 통해서 출력 가능
	}
}
