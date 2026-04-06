package com.kh.Class.ClassMain;

import java.util.List;
import java.util.Scanner;

public class ClassMenu {
		Scanner sc = new Scanner(System.in);
		public void HappyClass() {
			System.out.println("아름답고 이상적이고 행복한 우리반~~");
			
			System.out.println("1. 우리반 학생들");
			System.out.println("2. 우리반 시간표");
			System.out.println("3. 우리반 오늘의교훈");
			System.out.println("0. 즐거운 학교생활끝~~~");
			
			ClassName();
			Classtime();
			SpecialClass();
		}
		private void ClassName() {
			System.out.println("우리반에 어떤 학생들이 있을까?");
			int name = Integer.parseInt(sc.nextLine());
			
			switch(name) {
			case 1 : System.out.println("민범"); break;
			case 2 : System.out.println("채린"); break;
			case 3 : System.out.println("승호"); break;
			case 4 : System.out.println("채연"); break;
			case 5 : System.out.println("남이"); break;
			
			default : System.out.println("그 사람은 없습니다");
			}return;			
			
		}
		private void Classtime() {
			
			int time;
			System.out.println("우리반 시간표가 어떻게되더라?");
			
			String tmc = sc.nextLine();
			time = Integer.parseInt(tmc);
			
			if(time == 1) {
				System.out.println("1교시는 체육입니다~~~");
			}
			else if(time == 2) {
				System.out.println("2교시는 국어입니다~~~~~");
			}
			else if(time == 3) {
				System.out.println("3교시는 수학입니다~~~~");
			}
			else if(time == 4) {
				System.out.println("4교시는 미술입니다~~~~~");
			}
			else if(time == 5) {
				System.out.println("5교시는 음악입니다~~~~~~~");
			}
			else {
				System.out.println("그외의 시간표는 없습니다");
			}
		}
		private void SpecialClass(){
				System.out.println("인생은 즐겁고 행복하게~~~~");
		}
		
}
