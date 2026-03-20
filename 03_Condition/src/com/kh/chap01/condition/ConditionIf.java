package com.kh.chap01.condition;

import java.util.Scanner;

public class ConditionIf {
	/*
	 * (단일) if문
	 * 
	 * [표현법]
	 * 
	 * if(조건식) {
	 * 
	 * 조건식이 true일 경우 실행하고자 하는코드;
	 * }
	 * => 조건식의 결과값이 true일 경우 : if문Scope({})안의 코드가 수행
	 * => 조건식의 결과값이 false일 경우 : if문 Scope({})을 건너뜀
	 * 
	 */
	public void method1() {
		//System.out.println("메소드가 잘 수행되는가");
		if(0<1) {
			System.out.println("0이 1보다 작습니다.");
		}
		//if문의 조건식 자리에는 결론적으로 true아니면 false값이 들어가도록 만들어야함
		if(true) {
			System.out.println("이 코드는 if문을 만나면 무조건 수행되는 코드");
		}
		if(false) {
			System.out.println("이 코드는 if문을 만나면 절대 동작하지않는 코드");
		}
	}
	
	public void quiz() {
		
		int Count =0;
		int wrongCount =0;
		
		//문제를 출력해준 뒤
		System.out.println("문제 : 고양이는 호랑이과 일까요?");
		//사용자에게 o 또는 x를 입력받아서
		Scanner sc =new Scanner(System.in);
		System.out.println("정답을 o또는 x로 입력해주세요 >");
		char answer = sc.nextLine().charAt(0);
		//정답입니다~ / 오답입니다~ 를 출력해주는 퀴즈 프로그램
		//1.무슨 값을 가지고 == 사용자가 입력한값 == answer
		//				'x'
		//2. 무슨 연산을 하지 => == 
		//사용자가 입력한값이 x와 같다면
		//1절 소문자로 체크하기 => 대문자로 입력해도 정답 오답 처리 해주세요.
		//2절 사용자가 입력한값 == answer/'X','O'
		//무슨 연산? => ==
		if(answer == 'x'|| answer == 'X') {
			System.out.println("정답입니다~");
			Count++;
		}
	//	if(answer == 'X') {
	//		System.out.println("정답입니다~");
	//	}
		if(answer == 'o' || answer == 'O') {
			System.out.println("오답입니다~");
			wrongCount++;
		}
		if((answer !='X') && (answer !='x') && (answer !='0') && (answer != 'o')) {
			System.out.println("0또는 X를 입력해주세요");
		}
		if(answer =='O' || answer =='o' || answer =='X' || answer =='x') {
			System.out.println("O또는 X를 입력해주세요");
		}
	//	if(answer == 'O') {
	//		System.out.println("오답입니다~");
	//	}
		System.out.println("문제 : 여우는 개과 일까요?");
		System.out.println("정답을 o/x로 입력해주세요");
		answer = sc.nextLine().charAt(0);
		
		if(answer == 'x' || answer == 'X') {
			System.out.println("정답입니다~");
			Count++;
		}
		if(answer == 'o' || answer == 'O') {
			System.out.println("오답입니다~");
			wrongCount++;
		}
		
		//총 몇문제 풀었고 -> 정답은 몇개 -> 오답은 몇개
		//	저장->출력
		//	세가지 출력
		System.out.printf("퀴즈 끝~ 정답 %d개,오답 %d개 입니다",Count,wrongCount);
	
	}
}
