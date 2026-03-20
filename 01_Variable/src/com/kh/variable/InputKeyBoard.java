package com.kh.variable;

import java.util.Scanner;

public class InputKeyBoard {
/*
 * 키보드를 이용해서 프로그램을 사용하는 사용자에게 값을 입력받아 볼것!!
 * 자바에서 제공해주는 Scanner라는 클래스를 사용
 * Scanner라는 클래스에 존재하는 메소드들을 호출해서 입력을 받을수 있음
 * 
 */
	public void inputTest() {
		Scanner sc = new Scanner(System.in);
		//System.in : 표준 입력 도구에서 입력하는 값들을 받겠음(바이트 단위)
		
		System.out.println("피자헛에 오신것을 환영합니다");
		System.out.println("--------------피자헛 메뉴판---------------");
		System.out.println("1. 치즈/페페로니 피자");
		System.out.println("2. 블랙bbq 스테이크 뇨끼 피자");
		System.out.println("3. 이재모피자");
		System.out.println("-------------------------------------");
		System.out.print("주문하실 메뉴를 선택해주세요 > ");
		
		//next(): 사용자가 입력한값 중 공백문자가 있을경우 공백문자 이전까지만 입력받음
		String select = sc.next();
		//사용자가 어떤값을 입력하던지 입력한값을 다시 화면상에 출력!!! <--목표
		System.out.println(select+"을 주문하셨습니다");
		
		//개수 : 몇판이요?
		System.out.print("몇판 주문하시겠습니까?(숫자로 입력해주세요) > ");
		int pizzaNumber = sc.nextInt();
		System.out.print(select + "를" + pizzaNumber + "판 주문하셨습니다");
		
		System.out.print("주소를 입력하세요 > ");
		//nextLine() : 사용자가 입력한 값을 공백과 무관하게 개행문자 이전까지 전체를 다 읽어오는 기능
		//nextLine() : 입력버퍼에서 개행문자 이전까지의 모든값을 가져온후 입력버퍼에 존재하는 "개행문자"를 날려줌!!!
		sc.nextLine();
		String address = sc.nextLine();
		System.out.print(address + "로 배달합니다.");
	}
}
