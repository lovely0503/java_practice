package com.kh.chap02.encapsulation.model.vo;

//필드부,생성자부,메소드부
public class AutosellingMachine { //단한개의 제품을 파는 자판기
		//필드(Field)부
		/*
		 * 객체가 가질수 있는 속성을 기술하는 부분
		 * 
		 * 값을 담는 부분
		 * 
		 * 필드 == 멤버변수
		 * 
		 * 객체들이 가져야할 공통적인 속성을 기술해 놓는것
		 * 
		 * 접근제한자 자료형 필드식별자;
		 */
	/*
	 *  + 업무에 대한 도메인 지식
	 *  
	 *  주말 숙제 : 어떤 분야 개발자 할지 정해오기,관련분야 지식,자격증
	 *  
	 */
	//자판기 == 제품이름, 제품가격, 수량
	private String name;
	private int price;
	private int amount;
	//Dependency(의존) 관계중요
	
	private void checkAmount() {
		System.out.println("재고는 총" + amount + "개입니다");
	}
	private void sellingProduct() {
		amount -=1;
		
	}
	private void insert() {
		amount += 3;
	}
	public void openMachine() {
		checkAmount();
		insert();
		sellingProduct();
		checkAmount();
	}
	//객체의 속성값을 기록 및 수정하는 기능의 메소드 : setter()
	/*
	 * vo -> setter메소드를 구현하지않음
	 * DTO -> setter를 구현해서
	 * 
	 * DTO를 배우려면 짧게 잡아도 한달 반정도는 더 수업을 해야함
	 * 그래서 DTO배울때 까지만 VO에 setter를 구현해서 사용하겠음
	 * 
	 * setter만들기 규칙
	 * 
	 * 1.setter메소드는 외부에서 접근이 가능하기 때문에 접근제한자 public을 이용
	 * 2.set필드명으로 식별자를 작성하며 낙타봉표기법(cameCase)를 꼭 지키도록한다
	 */
	//price필드 값을 set할수 있는 메소드 구현
	public void setPrice(int price) {
				//parameter,매개변수
				//매개변수는 메소드 호출시 초기화가 강제됨
		
		System.out.println(price);
		//scope안에서는 해당 영역안에 있는 지역변수가 식별자 우선권을 가진다
		System.out.println("내 주소가 뭐지 : "+this);
		//this : 해당객체의 주소값을 가리키는 역할
		
		this.price = price;
		
		}
	
	
	}
