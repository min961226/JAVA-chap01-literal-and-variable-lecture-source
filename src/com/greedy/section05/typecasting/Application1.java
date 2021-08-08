package com.greedy.section05.typecasting;

public class Application1 {

	public static void main(String[] args) {
		
		/* 데이터 형변환 */
		/* 형변환의 종류와 규칙
		 * 1. 자동형변환 (묵시적 형변환) : 컴파일러가 자동으로 수행해주는 타입 변환
		 *   1-1. 작은 자료형에서 큰 자료형으로는 자동 형변환 된다.
		 *   1-2. 정수는 실수로 자동 형변환 된다.
		 *   1-3. 문자형은 int 형으로 자동 형변환 된다.
		 *   1-4. 논리형은 형변환 규칙에서 제외된다.
		 * 2. 강제 형변환 (명시적 형변환) : 형변환(case) 연산자를 이용한 강제적으로 수행하는 형변환
		 *   2-1. 자동 형변환이 적용되지 않는 경우 강제 형변환이 필요하다.
		 * */
		
		/* 1. 자동 형변환 규칙 테스트 */
		/* 1-1. 작은 자료형에서 큰 자료형으로 자동 형변환 테스트 */
		/* 작은 자료형에서 큰 자료형으로 공간만 옮기는 경우 데이터 손실이 발생하지 않기 때문에 컴파일러가 자동으로 처리해준다. */
		/* 1-1-1. 정수끼리의 자동 형변환 */
		byte bnum = 1;
		short snum = bnum;
		int inum = snum;
		long lnum = inum;
		
		int num1 = 10;
		long num2 = 20;
		
//		int result1 = num1 + num2;		//자동으로 큰 쪽 자료형인 long으로 변경 후 계산하기 때문에 int형 변수에 값을 담을 수 없다.
		long result1 = num1 + num2;
		
		System.out.println("result1 : " + result1);
		
		/* 1-1-2. 실수끼리의 자동 형변환 */
		float fnum = 4.0f;
		double dnum = fnum;
		
		double result2 = fnum + dnum;
		System.out.println("result2 : " + result2);
		
		/* 1-2. 정수는 실수로 자동 형변환 된다. */
		long eight = 8;
		float four = eight;
		
		System.out.println("four : " + four);
		
		float result3 = eight + four;
		System.out.println("result3 : " + result3);
		
		/* 1-3. 문자형은 int형으로 자동 형변환 된다. */
		char ch1 = 'a';
		int charNumber = ch1;
		
		System.out.println("charNumber : " + charNumber);
		
		char ch2 = 65;
		System.out.println("ch2 : " + ch2);
		
		/* 1-4. 논리형은 형변환 규칙에서 제외된다. */
		boolean isTrue = true;
//		byte b = isTrue;
//		short s = isTrue;
//		int i = isTrue;
//		long l = isTrue;
//		char c = isTrue;
//		float f = isTrue;
//		double d = isTrue;
	}

}








