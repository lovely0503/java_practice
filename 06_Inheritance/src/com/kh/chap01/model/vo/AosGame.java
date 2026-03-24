package com.kh.chap01.model.vo;

public class AosGame {
	private String gameName;
	private String publisher;
	private int characterCount;
	//기본 생성자,매개변수 생성자
	//게터,세터
	//Alt + shift + s -> o ->Alt + d -> Alt + g
	//Alt + shift + s -> o -> Alt+g
	//Alt + shift + s -> r -> Alt+a -> Alt+r
	//기본생성자 단축키
	
	
	public AosGame() {
		super();
	}
	public AosGame(String gameName, String publisher, int characterCount) {
		super();
		this.gameName = gameName;
		this.publisher = publisher;
		this.characterCount = characterCount;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getCharacterCount() {
		return characterCount;
	}
	public void setCharacterCount(int characterCount) {
		this.characterCount = characterCount;
	}
	
	public String info() {
		return "게임정보 [게임명 :"+gameName+"운영사 : "+ publisher +"캐릭터 개수"+characterCount+"]";
	}
	
}
