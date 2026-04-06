package com.kh.Class.ClassMain;

public class ClassDto {
	private String name;
	private String time;
	private String special;
	public ClassDto() {
		super();
	}
	public ClassDto(String name, String time, String special) {
		super();
		this.name = name;
		this.time = time;
		this.special = special;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getSpecial() {
		return special;
	}
	public void setSpecial(String special) {
		this.special = special;
	}
	
	@Override
	public String toString() {
		return "ClassDto [name=" + name + ", time=" + time + ", special=" + special + "]";
	}
	


}
