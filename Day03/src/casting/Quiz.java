package casting;

public class Quiz {
	public static void main(String[] args) {
		//1. 이름, 국 영 수 점수를 저장할 변수를 선언
		//단, 국 영 수는 정수형으로 선언한다
		String name = "홍길동";
		int kor = 70, eng = 80 , math = 98;
		int sum = kor+eng+math;
		double avg = (kor+eng+math)/3.0;
		//2. 1번의 변수에 값을 채운다
		
		//3. 아래와 같이 출력되게 한다
		System.out.println("이름 : " + name);
		System.out.println("국  " + kor +" 영  "+ eng +" 수 " + math);
		System.out.println("합계  : " + sum + "점");
		System.out.println("평균 : " + avg);
		// 이름 : 홍길동
		// 국 70, 영 80, 수 98
		// 합계 : 248점
		// 평균 : 82.66666667
		
		
		
		// 소수점 제어
		// 1. printf()를 사용
		//System.out.printf("평균 : %.2f\n", sum/3.0);
		
		// 2. round()함수를 사용
		//double avg = sum/ 3.0;
		//double result = Math.round(avg*100)/100.0;
		
		//System.out.println("result = " + result);
	}

}
