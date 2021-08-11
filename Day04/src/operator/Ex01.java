package operator;

// 연산자 : 데이터를 가공하여 새로운 데이터를 얻는 기호들
// - 종류) 산술, 대입, 증감, 비교, 논리, 조건

public class Ex01 {
	public static void main(String[] args) {
		int n1= 10, n2 =3;
		//산술 연산자 : 사칙 연산을 수행하는 연산자
		System.out.println("n1 = " + n1 + ", n2 = "+ n2 + "\n");
		
		System.out.println("n1 + n2 = " + (n1 + n2));
		System.out.println("n1 = " + n1 + ", n2 = " + n2 + "\n");
		//ㄴ> 산술 연산은 각 자리에 연산만 할 뿐, 변수에 변화를 주지 않는다
		
		System.out.println("n1 - n2 = " + (n1 - n2));
		System.out.println("n1 * n2 = " + n1 * n2);
		System.out.println("n1 / n2 = " + n1 / n2);
		System.out.println("n1 % n2 = " + n1 % n2);
	}
}
