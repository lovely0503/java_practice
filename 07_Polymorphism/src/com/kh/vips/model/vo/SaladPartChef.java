package com.kh.vips.model.vo;

public class SaladPartChef extends Chef{

	public SaladPartChef(String name) {
		super(name);
	}
	@Override
	public void Cooking() {
		System.out.println(getName()+"샐러드 요리합니다");
	}

}
