package com.kh.sw.exception;

/**
 * 이 예외 클래스는 RuntimeException을 상속받아 구현하고 있으며,
 * 스위치를 눌렀을때 10%확률로 폭발이 일어나기 떄문에 예외를 발생시키려고 구현하였음
 * 
 *  @author 종로 강의실 강민범
 *  @since 2026-03-27
 */
public class SwitchBoomException extends RuntimeException {
//Alt + Shift +j
	
	public SwitchBoomException() {
		super();
	}

	public SwitchBoomException(String msg) {
		super(msg);
	}


}
