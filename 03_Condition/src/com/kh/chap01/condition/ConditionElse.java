package com.kh.chap01.condition;

import java.util.Scanner;

public class ConditionElse {
	/*
	 * if~else
	 * 
	 * [표현법]
	 * if(조건식){
	 * 	조건식의 결과가 true일 경우 실행할코드 - a
	 * } else {
	 * 	조건식의 결과가 false일 경우 실행할코드 - b
	 * }
	 * 
	 * ->조건식의 결과가 true일 경우 a를 실행
	 * ->조건식의 결과가 false일 경우 b를 실행
	 */
	public void method1(){
		
		//핸드폰 번호 뒷자리 입력받아서
		//당첨자 번호랑 같으면 축하 아니면 다음기회에
		//당첨 핸드폰 번호 뒷자리 => 7777
		
		//계획
		//사용자에게 핸드폰번호 뒷자리를 입력받아서
		//당첨 핸드폰번호와 일치한다면 축하를 출력해주고
		//				일치하지않는다면 다음기회에 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("핸드폰 번호 뒷부분 네자리를 입력해주세요 > ");
		String phoneNumber = sc.nextLine();
		System.out.println(phoneNumber);
		
		//어떤 값을 가지고 사용자가 입력한 폰번호 == phoneNumber / "7777"
		//어떤 연산		동등비교
		//문자열값을 비교하고 싶을때 : ==(동등비교 연산자)의 경우 기본타입 자료형 8개끼리만 사용가능하기때문에
		//						equals()라는 메소드를 호출해서 비교해주어야함
		//						문자열 값이 일치할 경우 true를 반환 일치하지않을경우 false를 반환
		if(phoneNumber.equals("7777")) {
			System.out.println("축하합니다");
		} else {
			System.out.println("아쉽지만 다음기회에~");
		}
		/*
		if(!(phoneNumber.equals("7777"))) {
			System.out.println("아쉽지만 다음기회에");
		}*/
		
		
	}
	public void method2() {
		//핸드폰 뒷자리를 입력받아서 1등 2등 3등 아쉽지만 미당첨 출력해주기
		Scanner sc = new Scanner(System.in);
		System.out.print("핸드폰 번호 뒷자리를 입력해주세요 > ");
		String phoneNumber = sc.nextLine();
		System.out.println("사용자가 입력한 폰번호 : "+phoneNumber);
	}
}
