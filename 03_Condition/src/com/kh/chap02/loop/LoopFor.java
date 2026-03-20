package com.kh.chap02.loop;

import java.util.Scanner;

public class LoopFor {
	
	
		
	public void gugudan() {
		//구구단 프로그램
		//사용자에게 정수를 입력받아서
		//입력한 정수의 단을 출력해보기
		
		// 구구단을 외자
		//몇단을 풀력하시겠습니까?
		//4단을 출력하겠습니다
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단을 외우자");
		System.out.println("몇단을 출력하시겠습니까 >");
		int dan = sc.nextInt();
		System.out.println(dan + "단을 출력하겠습니다.");
		
			/*
			System.out.println(dan + " X 1 =" + (dan * 1));
			System.out.println(dan + " X 2 = " + (dan * 2));
			System.out.println(dan +" X 3 = " + (dan * 3));
			System.out.println(dan + " X 4 = " + (dan * 4));
			System.out.println(dan + " X 5 = " + (dan * 5));
			System.out.println(dan + " X 6 = " + (dan * 6));
			System.out.println(dan + " X 7 = " + (dan * 7));
			System.out.println(dan + " X 8 = " + (dan * 8));
			System.out.println(dan + " X 9 = " + (dan * 9));
			 */
		
		for(int i=1;i<=9;i++) {
			System.out.println (dan + "X" + i + "="+(dan * i));
		}
	}
	
	//어제 o/x 퀴즈,구구단 놀이 
	public void mainMenu() {
		for(;;) {
			System.out.println("*메인메뉴 입니다*");
			System.out.println("1. 구구단 놀이 시작하기");
			System.out.println("2. o/x퀴즈 시작하기");
			System.out.println("3. 프로그램 종료하기");
			Scanner sc = new Scanner(System.in);
			System.out.print("메뉴를 선택해주세요 > ");
			int menuNo = sc. nextInt();
			sc.nextLine();
			//System.out.println(menuNo);
			if(menuNo == 1) {
				gugudan();
			}else if(menuNo == 2) {
				
			}else if(menuNo == 3) {
				System.out.println("프로그램을 종료합니다");
				return;
			} else {
				System.out.println("없는 메뉴를 선택하셨습니다~");
			}
			System.out.println();
		}
	}
	
}
