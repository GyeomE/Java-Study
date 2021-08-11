package casting;

// 형변환 : 데이터 타입(=자료형)을 변경하는 것
// - 1. 자동 형변환 : 연산시 자동으로 발생하며, 다른 타입간의 연산이 가능하게 하는 형변환
// - 2. 강제 형변환 : 개발자가 직접 자료형을 변환하는 방식
public class Ex01 {
	public static void main(String[] args) {
		
		System.out.println(10 + 3.14);		// int + double -> double + double
		System.out.println("10" + 3.14);	//String + double -> String + String
		System.out.println("10" + "3.14");	
		
		System.out.println("10 + 3 = " + 10 + 3);
		//String + int + int 
		//String + String + int
		//String + String + String
		System.out.println("10 + 3 = " + (10 + 3));
	}

}
