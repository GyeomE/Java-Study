package print;

public class Ex02 {
	public static void main(String[] args) {
		// System : 표준 입출력을 위해 만들어진 클래스
		// out : 출력 객체
		// print, println, printf : 출력 함수
		
		System.out.println("여기는 줄바꿈이 자동 포함된 구문");	// println 	: 출력 마지막에 줄바꿈이 포함
		System.out.print("여기는 줄바꿈이 없어요");			// print	: 줄바꿈이 없는 구문
		
		System.out.print("짜란~\n");						// 이스케이프 시퀀스를 사용하면 줄바꿈이 가능하다
		
		System.out.printf("여기는 C언어랑 똑같은 구문");		// 그리고 줄바꿈이 없다~
		System.out.printf("짠~");
		
		// 기본적으로 print 3구문은 모두 문자열을 출력하는 구문
		// ※ 문자열 : " " (쌍따옴표)로 둘러 싸인 구문을 의미. 단어나 문장을 표현하기 위한 데이터
		
		// System.out.println(Hello World);
		// ㄴ> 따옴표가 없으면 에러~ 
	}
}
