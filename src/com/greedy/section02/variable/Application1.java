package com.greedy.section02.variable;

public class Application1 {

	public static void main(String[] args) {
		
		/* 변수의 사용 목적 */
		/* 1. 값의 의미를 부여하기 위한 목적
		 * 2. 한 번 저장해둔 값을 재사용하기 위한 목적
		 * 3. 시간에 따라 변하는 값을 저장하기 위한 목적
		 * */
		
		/* 1. 값에 의미를 부여하기 위한 목적 */
		System.out.println("================= 값에 의미 부여 테스트 ==================");
		System.out.println("보너스를 포함한 급여 : " + (1000000 + 200000) + "원");
		
		int salary = 1000000;
		int bonus = 200000;
		System.out.println("보너스를 포함한 급여 : " + (salary + bonus) + "원");
		
		/* 2. 한 번 저장해둔 값을 재사용하기 위한 목적 */
		System.out.println("================= 변수에 저장한 값 재사용 테스트 ================");
		System.out.println("1번 고객에게 포인트를 100포인트 지급하였습니다.");
		System.out.println("2번 고객에게 포인트를 100포인트 지급하였습니다.");
		System.out.println("3번 고객에게 포인트를 100포인트 지급하였습니다.");
		System.out.println("4번 고객에게 포인트를 100포인트 지급하였습니다.");
		System.out.println("5번 고객에게 포인트를 100포인트 지급하였습니다.");
		System.out.println("6번 고객에게 포인트를 100포인트 지급하였습니다.");
		System.out.println("7번 고객에게 포인트를 100포인트 지급하였습니다.");
		System.out.println("8번 고객에게 포인트를 100포인트 지급하였습니다.");
		System.out.println("9번 고객에게 포인트를 100포인트 지급하였습니다.");
		System.out.println("10번 고객에게 포인트를 100포인트 지급하였습니다.");
		
		int point = 100;
		System.out.println("1번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
		System.out.println("2번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
		System.out.println("3번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
		System.out.println("4번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
		System.out.println("5번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
		System.out.println("6번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
		System.out.println("7번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
		System.out.println("8번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
		System.out.println("9번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
		System.out.println("10번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
		
		/* 3. 시간에 따라 변경되는 값을 저장하고 사용할 수 있다. */
		System.out.println("================== 변수에 저장된 값 변경 테스트 =================");
		
		int sum = 0;
		
		sum = sum + 10;
		System.out.println("sum에 10을 더하면 sum의 값은 ? : " + sum);
		
		sum = sum + 10;
		System.out.println("sum에 10이 있었으니 10을 추가로 더하면? : " + sum);
	}

}












