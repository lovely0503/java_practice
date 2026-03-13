package com.kh.variable;

public class Variable {
	
	// 변수 : Memory(RAM)에 값을 저장하기 위한 공간
	
	//변수 그냥 한번 써보기
	public void savePants() {
		String 옷장 = "긴바지";
		String 행거 = "반바지";
		System.out.println(옷장);
		
	}
	public void findLunchMenu() {
		//1. 메뉴들을 출력(메뉴명,가격)
		//2. 여러분들이 메뉴판을보고 주문을 했다고 가정
		//3.여러분들이 내야할 금액 출력
		System.out.println("---변수를 사용하기 전---");
		System.out.println("메뉴판 >");
		System.out.println("1.트리플 치즈버거 세트(15000)");
		System.out.println("2.빅맥(8397)");
		System.out.println("3.탱글한 통새우살 가득 슈슈버거세트~(9210)");
		
		//트리플치즈버거 4명
		//빅맥 9명
		//1955 4명
		System.out.println("-------------------");
		System.out.println("트리플치즈버거 4개 주문");
		System.out.println((15000*4)+"원입니다");
		
		System.out.println("빅맥 9개 주문");
		System.out.print((8397 * 9)+"원 입니다");
		
		System.out.println("슈슈버거 4개 주문");
		System.out.println((9210*4)+"원 입니다");
		System.out.println("--------------------");
		
		System.out.println("=====================");
		System.out.println("변수를 사용해 봅시다");
		//메뉴명과 가격이라는 값을 담을공간
		//변수를 선언하고 변수공간에 값을 대입해서 사용
		String setOne = "KH아카데미표 슈슈버거 세트";
		int setOnePrice = 9800;
		String setTwo="KH아카데미표 빅맥세트";
		int setTwoPrice = 8800;
		
		System.out.println("메뉴판 >");
		System.out.println(setOne + ",가격 :" +setOnePrice);
		System.out.println(setTwo + ",가격 :" +setTwoPrice);
		
		System.out.println(setOne + "를 10개 시켰습니다");
		System.out.println((setOnePrice*10)+"원입니다");
		System.out.println(setTwo+"를 5개 시켰습니다");
		System.out.println((setTwoPrice*5)+"원입니다");
		/*
		 * 변수를 사용해 봤더니?
		 * 1.딱 한번 값을 대입해서 필요한 순간마다 다시 사용할수있음
		 * =>재사용성이 높아짐
		 * 2.동일한 값을 수정해야 할때 한번만 수정하면됨
		 * =>실수의 확률이 줄어든다
		 * 3.값에 의미를 부여할수있음
		 * =>가독성이 높아짐
		 * 
		 */
		
	}
	//변수를 사용하는 방법에 대해서 알아봅시다!
	public void declareVariable() {
		/*
		 * 변수 선언 방법
		 * 
		 * int price;
		 * 
		 * 자료형(DataType) 변수 식별자;
		 * 권장하는 방법은 아니지만 동일한 타입의 변수를 선언할때는 한번에 선언할수있음
		 * 변수를 선언하고 난뒤 처음값을 대입하는 과정을 초기화(Initialzation)라고함
		 * 초기화를 통해 대입한값을 초기값이라고함
		 * 
		 */
		int price;//변수 선언
		int a;
		int b;
		//local variable(지역변수)
		/*
		 * 식별자(Identifier)
		 * 
		 * 클래스명,메소드명,변수명등 개발자가 만들어서 이용하는 고유의 이름
		 * 
		 * -식별자를 만들때 꼭 지켜야하는 규칙!(안지키면 안만들어짐)
		 * 
		 * 1.keyword(예약어)는 식별자로 사용할수없음
		 * 2. 공백은 포함할 수 없음
		 * 3. 대,소문자를 구분하고 길이제한은 없음
		 * 4.문자,숫자_,$를 포함할수 있음
		 * 문자,_,$ 로만 시작할수있음
		 * 
		 * - 개발자들끼리 암묵적인 약속 => 영어만 사용가능
		 * 
		 * 1.클래스 / 인터페이스 명명규칙
		 * 
		 * - 첫글자는 대문자로 표기
		 * - 연결된 단어들의 첫글자도 대문자로 표기
		 * - 명사, 형용사를 서술적으로 연결해서 사용
		 * -> WelcomeToJavaWorld
		 * 
		 * 2.변수 명명 규칙
		 * 
		 * -명사적 의미를 갖게 만들어줌
		 * -첫글자를 소문자로표기, 연결된 단어들의 첫글자를 대문자로 표기
		 * 
		 * -> phoneNumber
		 * 
		 * 3. 메소드 명명 규칙
		 * 
		 * -동사적 의미를 갖게 만들어줌
		 * -첫 글자를 소문자로 표기,연결된 단어들의 첫글자를 대문자로 표기
		 * -메소드 식별자의 경우 식별자뒤에 반드시 한쌍의 "()"를 붙임
		 * -메소드에는 일반적으로 _를 사용하지않음
		 * 
		 * ->join(), signup()
		 * 
		 * 4. 상수 명명규칙
		 * 
		 * -모든 문자를 대문자로 표기
		 * -단어와 단어 사이를 _를 사용해서 구분한다
		 * 
		 * ->LOGIN_OK
		 * 
		 */
		
		//변수에 값을 대입하고 출력하기 위해서는 선언 및 초기화 작업이 필요함!!
		
		//변수의 자료형
		//Java의 기본자료형, 원시자료형(Primitive Type)
		
		/*
		 * 1.논리 자료형(논리 값 : true/false)
		 */
		//변수선언 : 자료형 변수 식별자;
		
		boolean isTrue; //변수 선언
		//System.out.println(isTrue);
		//지역변수 (local variable)는 초기화를 하지않으면 사용할수없음
		isTrue = true;//초기화
		System.out.println(isTrue);
		isTrue = false;//변수에 값을 대입
		System.out.println(isTrue);
	
		/*
		 * 2.숫자 자료형
		 * 
		 * 정수형
		 * 
		 * 정수형에는 4가지 자료형이 존재함
		 * byte,short,int,long형이 있음
		 * int형 쓰세요
		 * long형 사용할때는 대입할 숫자뒤에 "L"을 붙임
		 * 
		 * 실수형
		 * 
		 * 실수형에는 2가지 자료형이 존재함
		 * float,double
		 * float형을 사용하기 위해서는 할당할 숫자뒤에 "F"를 붙여야함
		 */
		
		//2_1.정수형
		byte byteNumber=1;
		short shortNumber=2;
		int intNumber=3;
		long longNumber=4;
		
		//2_2.실수형
		float floatNumber = 2.22F;
		double doubleNumber = 3.33;
		
		//선언과 동시에 초기화
		
		//3.(단일)문자형
		char money = '돈';//2byte
		//단일문자에는 반~~~~드시 홈 따옴표를 붙임
		
		//여기까지가 기본자료형 / 원시자료형8개
		
		//4.문자열 : 참조자료형
		String str = "문자열";//문자열은 반드시 쌍따옴표를 앞뒤로 붙여줌
		
		//9개의 자료형을 가지고 변수를 선언
		//각각의 변수에 초기값을 대입 초기화를 진행
		//9개의 변수에 값이 잘 들어갔나?
		
		//논리자료형 1개
		System.out.println("논리 자료형 :"+ isTrue);
		
		//정수자료형 4개
		System.out.println("정수 자료형 :"+ byteNumber);
		System.out.println("정수 자료형 :"+ shortNumber);
		System.out.println("정수 자료형 :"+ intNumber);
		System.out.println("정수 자료형 :"+ longNumber);
		
		//실수자료형 2개
		System.out.println("실수자료형 :"+floatNumber);
		System.out.println("실수자료형 :"+doubleNumber);
		
		//문자자료형 1개
		System.out.println("문자자료형 :"+money);
		
		//문자자료형 1개
		System.out.println("문자자료형 :"+str);
		
		//System.out.print();
		//System.out.println(); => 개행한다
		//System.out.printf(); => f는 format,개행 안함
		//System.out.println("논리 자료형 :"+isTrue + ",정수자료형 : "+ intNumber +",정수..");
		System.out.printf("논리 자료형 : %b, 정수 자료형 : %d \n",isTrue,intNumber);
		//%b : 논리타입
		//%d : 정수타입
		//%f : 실수타입
		//%c,%C : (단일)문자 타입
		//%s,%S : 문자열
		System.out.printf("doubleNum 값 : %.2f",doubleNumber);
	}
}
