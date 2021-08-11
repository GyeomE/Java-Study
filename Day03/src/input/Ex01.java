package input;

import java.lang.System;
import java.io.IOException;
import java.lang.Math;

// lang은 자바 개발에 필수적인 클래스들이 있기 때문에 자동으로 import된다

public class Ex01 {
	public static void main(String[] args) throws IOException {
		// System 클래스 : 표준 입출력을 위한 클래스
		// - out : 표준 출력 스트림
		// - in : 표준 입력 스트림
		
		// 스트림(stream)? : 데이터가 지나가는 통로
		
		System.out.println("문자열이 출력 \n");
		
		
		
		System.out.print("단어 하나 입력 : ");
		int n = System.in.read();
		// Unhandled exception type IOException
		
		
		//read()는 입력받은 키값을 uni-code로 가져오게 된다 => 쓰기 불편하다
		
		System.out.println("n = " + n);
		System.out.println("n = "+(char)n);
	}

}
