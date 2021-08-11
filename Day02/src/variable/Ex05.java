package variable;

public class Ex05 {
	public static void main(String[] args) {
		// 앞서 사용해본 자료형 중 문자열이 없었다~
		// 문자열은 기본자료형이 아닌 클래스로 만들어져 있고
		// 이는 '참조 자료형'에 해당한다
		
		char ch = 'A';			// 단일 문자는 ' ' (홑따옴표)
		
		String str = "apple";// 문자열은 " " (쌍따옴표)
		//String str = new String("apple");	같은 의미다. 라이브러리에 편하게 쓰라고 저장되어있음.
		
		// ※ 배열도 참조형
		int[] arr = new int[] { 10,20,30,40,50 };
		
		System.out.println("ch = " + ch);
		System.out.println("str = " + str);
		
		System.out.println("arr = " + arr);
		// ㄴ> 참조 변수를 바로 출력하면 이상한 값이 출력
		// ㄴ> '해시 코드'라고 한다
		
		//index값을 넣어줘야한다 => arr[0] or arr[4] 
		//범위를 벗어나면 쓰레기값이 아닌 잘못됐다고 말해준다.
	}
}
