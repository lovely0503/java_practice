package com.kh.vips.model.vo;

public class MainPartChef extends Chef{

	public MainPartChef(String name) {
		super(name);
	}
		@Override
		public void Cooking() {
			System.out.println(getName() + "소고기 굽습니다");
		}
}
