package casting;

public class Ex02 {
	public static void main(String[] args) {
	
		System.out.println("10 / 3 = " + 10 / 3);	//3 int/int니까 형변환 X
		System.out.println("10 / 3.0" + 10 / 3.0 +"\n");	//3.33333333333333335 타입이 다르니까 double/double로 됨
	
	
		int n1 = 10, n2 = 3;
		System.out.println("n1 / n2 = " + n1 / n2);
		System.out.println("n1 / n2 = " + n1/ (double)n2);
		//int /double -> double / double =>강제 형변환
		
		
		
		System.out.println("n2 = " + (double)n2);
		System.out.println("n2 = " + n2);
		//강제 형변환
		// - 바꾸려하는 변수나 결과값 앞에 ()안에 자료형을 작성하면 된다
		// - 강제형변환은 해당 구간에서 '일시적'으로 바뀐다
	}
}
