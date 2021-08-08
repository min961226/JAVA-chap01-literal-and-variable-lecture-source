package com.greedy.section01.literal;

public class Application3 {

	public static void main(String[] args) {
		
		/* 문자열 합치기 테스트 */
		System.out.println("============== 두 개의 문자열 합치기 ================");
		System.out.println(9 + 9);			//18
		System.out.println("9" + 9);		//99
		System.out.println(9 + "9");		//99
		System.out.println("9" + "9");		//99
		
		System.out.println("================ 세 개의 문자열 합치기 ==================");
		System.out.println(9 + 9 + "9");	//189
		System.out.println(9 + "9" + 9);	//999
		System.out.println("9" + 9 + 9);	//999
		
		System.out.println("9" + (9 + 9));	//918
		
		/* 문자열 합치기 응용 */
		System.out.println("============ 10과 20의 사칙연산 결과 ==============");
		System.out.println(10 + 20);
		System.out.println(10 - 20);
		System.out.println(10 * 20);
		System.out.println(10 / 20);
		System.out.println(10 % 20);
		
		System.out.println("============== 10과 20의 사칙 연산 결과 보기 좋게 출력 ==============");
		System.out.println("10과 20의 합 : " + (10 + 20));
		System.out.println("10과 20의 차 : " + (10 - 20));
		System.out.println("10과 20의 곱 : " + (10 * 20));
		System.out.println("10과 20의 나누기 한 몫 : " + (10 / 20));
		System.out.println("10과 20을 나누기 한 나머지 : " + (10 % 20));

	}

}











