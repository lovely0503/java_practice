package com.kh.football.model.service;

import java.util.ArrayList;
import java.util.List;

import com.kh.football.model.vo.FootballPlayer;

//축구선수를 저장된걸 가지고 얼씨고 절씨고
public class FootballService {
	//정석적으로 가려면 DAO클래스가 존재해야하지만 그러면 규모가 너무 커지기때문에 Service에서 차단함
	private List<FootballPlayer> list = new ArrayList();
	private int id;
	FootballPlayer fp = new FootballPlayer(++id,"1","2",3);
	{
		//초기화 블럭
		list.add(new FootballPlayer(++id,"손흥민","공격수",7));
		list.add(new FootballPlayer(++id,"호날두","공격수",7));
		list.add(new FootballPlayer(++id,"메시","미드필더",10));
	}
	public FootballService() {
		System.out.println("순서3");
	}
	

	public List<FootballPlayer> selectAll() {
		return list;
	}
}
