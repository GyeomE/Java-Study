package variable;

public class Ex04 {
	public static void main(String[] args) {
		int n = 2000000000;		// 20억
		
		System.out.println("n = " + n + "\n");
		
		
		// 나머지도 작성해보자
		boolean bo = true;
		byte by = 127;
		short sh = 32767;
		char ch = 'A';
		long lo = 3000000000L;	// L : 리터럴 공간을 long(= 8byte)로 잡아라~
		
		// The literal 3000000000 of type int is out of range
		// ※ 리터럴 : 변수에 저장되지 않은 값을 의미. 즉, 임시값
		// - 리털값은 자료형의 기본값으로 공간이 할당된다
		// - 정수는 기본이 int이고, 실수는 double이다
		
		float fl = 3.14F;		// F : 리터럴  공간을 float으로 잡아라~
		double db = 3.14;
		
		System.out.println("bo = " + bo);
		System.out.println("리터럴 = " + true + "\n");		// 참고 : 거짓은 false
		
		System.out.println("by = " + by);
		System.out.println("sh = " + sh);
		System.out.println("ch = " + ch);
		System.out.println("lo = " + lo);
		System.out.println("fl = " + fl);
		System.out.println("db = " + db);
		
		
	}
}
