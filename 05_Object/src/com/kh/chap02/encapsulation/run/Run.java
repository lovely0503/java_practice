package com.kh.chap02.encapsulation.run;

import java.util.Scanner;

import com.kh.chap02.encapsulation.model.vo.AutosellingMachine;

public class Run {

	//캡슐화(encapsulation)
	//속성(데이터)과 해당 데이터를 조작하는 행동(메소드)를 하나의 단위로 묶는것
	//정보은닉(information hiding)
	
	
	public static void main(String[] args) {
		//객체 생성 == 메모리(heap)에 적재
		AutosellingMachine asm= new AutosellingMachine();
		//변수공간에 대입될수있는 값은 딱 9가지
		//boolean 리터럴값, char 리터럴값, byte 리터럴값, short 리터럴값, int 리터럴값, long 리터럴값
		//float 리터럴값, double 리터럴값
		//주소값 == 객체
		/*
		asm.name = "삼양라면";
		System.out.println(asm.name);
		asm.price = 1100;
		System.out.println(asm.price);
		asm.amount = 5;
		System.out.println(asm.amount);
		*/
		/*
		asm.재고확인하기();
		asm.재고채우기();
		asm.제품판매하기();
		asm.재고확인하기();
		*/
		//asm.openMachine();
		
		//필드가 외부에서는 보이지않아 오류가 발생!
		//접근제한자를 public에서 private으로 변경했기 때문!
		//직접접근이 불가능 => 간접적으로 접근할수 있는 방법을 만들어주어야함
		
		//getter / setter라는 메소드 구현하기
		//asm.checkAmount();
		//라면 가격 1500으로 세팅하고싶다
		
		asm.setPrice(1500);
		//argument,인자값,인수
		System.out.println(asm);
		asm.setName("삼양라면");
		asm.setAmount(5);
		asm.setPriceAndAmount(1000,5);
		//함수 == BuiltInFunction
		//자바의클래스 == 자료형
		//메소드 == 특정 자료형만 수행할수있는 기능
		String name = asm.getName();
		Scanner sc = new Scanner(System.in);
		
		System.out.println(name);
		
		int amount = asm.getAmount();
		System.out.println(amount);
		int price = asm.getPrice();
		System.out.println(price);
	}

}
