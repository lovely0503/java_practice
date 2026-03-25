package com.kh.vips.model.vo;

public class Lee {
		private String name;
		public Lee(String name) {
			this.name = name;
		}
		public void cooking() {
			System.out.println(name + "이승철 요리 시작~");
		}
		public void breakTime() {
			System.out.println(name + "이승철 쉬는시간");
		}
}
