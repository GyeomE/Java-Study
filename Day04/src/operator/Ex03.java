package operator;

public class Ex03 {
	public static void main(String[] args) {
		// 증감 연산자 : 피연산자를 1 증가 혹은 1 감소 시키는 연산자
		
		int n = 10;
		
		n++;		// 후치
		System.out.println("n = " + n);	//11
		
		n--;
		System.out.println("n = " + n);	//10
		
		++n;		// 전치
		System.out.println("n = " + n);	//11
		
		--n;
		System.out.println("n = " + n + "\n");	//10
		
		// 일반적으로 전치나 후치는 결과에 차이가 없다
		// 단, 다른 연산과 같이 사용될 경우, 결과가 달라진다
		
		int n1 = 10, n2, n3;
		
		n2 = ++n1;		// 전치 : 증감 후 다른 연산을 수행
		System.out.println("n1 = " + n1 + ", n2 = " + n2);
		
		n1 = 10;
		
		n3 = n1++;		// 후치 : 다른 연산 수행 후 증감
		
		System.out.println("n1 = " + n1 + ", n3 = " + n3);
		
		
		int a = 8 , b = 2 , c = 3, d;
		
		d = ++a + b-- + c++;
		
		System.out.println("a = " + a); //9
		System.out.println("b = " + b); //1
		System.out.println("c = " + c); //4
		System.out.println("d = " + d); //14
		
	}
}
