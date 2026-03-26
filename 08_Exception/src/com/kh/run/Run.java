package com.kh.run;

import com.kh.controller.UncheckedException;

public class Run {

	public static void main(String[] args) {
		/*
		 * 에러(Error)
		 * 
		 * - 시스템에러 : 컴퓨터의 오작동으로 발생하는 에러
		 * 				=>(심각) 소스코드로 해결이안됨
		 * 
		 * - 컴파일에러 : 프로그램 실행 전 소스코드상에서 문법적인 문제로 발생하는 에러
		 * 				=> 소스코드를 수정해서 해결이 가능(빨간줄로 알려줌)
		 * 
		 * - 런타임에러 : 프로그램 실행중 발생하는 에러 문법적으로는 문제가 없음
		 * 				=> 사용자가 개발자가 의도한대로 입력값을 넣어주지 않을 가능성이 높지만...?
		 * 				=> 개발자가 이러한 상황을 미리 예측해서 처리해 주어야함!
		 * 
		 * - 로지컬에러 : 소스코드 상 문제없음, 실행했을때도 문제없이 잘 돌아감
		 * 				=> 의도와는 다르게 동작
		 * 
		 * 예외 : 시스템에러를 제외한 나머지 컴파일 런타임 로지컬 에러와 같이 비교덜 심각한애들
		 * 		그 중에서도 주로 런타임 에러를 의미함
		 */
		
		UncheckedException ue = new UncheckedException();
		//ue.divZero();
		//ue.code();
		//ue.multiCatch();
		ue.orderByCatch();
		}

}
