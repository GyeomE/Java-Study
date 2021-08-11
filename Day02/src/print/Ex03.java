package print;

public class Ex03 {
	public static void main(String[] args) {
		// escape sequence : 문자열 내에서 특수한 형태로 사용되는 문자들
	
		System.out.println("1. Hello\nWorld");				// \n : new line, 새 줄 or 줄바꿈
		System.out.println("2. Hello\t World");				// \t : tab, 들여쓰기
		
		System.out.println();	// 빈 println()은 줄바꿈용으로 사용되기도 한다
		
		System.out.println("3. Hello\n\nWorld\n");			// 이스케이프는 문자열 내에서 여러개 사용 가능
		
		System.out.println("저희 자바 버전은 \"jdk1.8\" 입니다");	// \" : 문자열 묶는 기능을 제거. 즉, 일반 문자가 됨
		System.out.println("공유 폴더 : \\\\192.168.0.37");		// \\ : 이스케이프 기능을 제거
	}
}
