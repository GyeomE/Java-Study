package operator;

public class Ex02 {
	public static void main(String[] args) {
		// 대입 연산자 : 값을 할당하는 연산자
		// 종류) = 
		
		// 팁
		// 1. 대입 연산자의 좌변은 '공간', 우변은 '결과값'을 의미
		// 2. 대입 연산은 항상 우변부터 처리한다
		// 3. 대입 연산자의 양변의 자료형은 일치 시킨다->error 발생시킴
		
		
		int n = 10 + 2 + 3 + 5;// 기본값 int
		//int n2 = (int)3.14;// 기본값 double
		
		System.out.println("n = " + n + "\n");
		
		int n1, n2, n3 = 30;
		// n3 만 30일까? 모두 30일까?
		
		n1 = n2 = n3 = 30;
		System.out.println("n1 = " + n1);
		System.out.println("n2 = " + n2);
		System.out.println("n3 = " + n3 + "\n");
		
		// 복합 대입 연산자 : 산술 + 대입
		// - 종류) += , -=, *=, /=, %=
		
		n1 += 2; // n1 = n1 + 2;
		System.out.println("n1 = " + n1); //32
		
		n1 -= 3;
		System.out.println("n1 = " + n1); //29
		
		n1 *= 2;
		System.out.println("n1 = " + n1); //58
		
		n1 /= 4;
		System.out.println("n1 = " + n1); //14
		
		n1 %= 3;
		System.out.println("n1 = " + n1); //2
		
		
		
		//연습
		int a= 10, b=3 , c= 5;
		
		a += b -= c -= 4;
		
		System.out.println(" a = "+ a);//12
		System.out.println(" b = "+ b);//2
		System.out.println(" c = "+ c);//1
	}

}
