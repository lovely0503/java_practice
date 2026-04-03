package com.kh.football.model.service;

import java.util.ArrayList;
import java.util.List;

import com.kh.football.model.dto.FootballPlayerDto;
import com.kh.football.model.vo.FootballPlayer;

//축구선수를 저장된걸 가지고 얼씨고 절씨고
public class FootballService {
	// 정석적으로 가려면 DAO클래스가 존재해야하지만 그러면 규모가 너무 커지기때문에 Service에서 차단함
	private List<FootballPlayer> list = new ArrayList();
	private int id;
	FootballPlayer fp = new FootballPlayer(++id, "1", "2", 3);
	{
		// 초기화 블럭
		list.add(new FootballPlayer(++id, "손흥민", "공격수", 7));
		list.add(new FootballPlayer(++id, "호날두", "공격수", 7));
		list.add(new FootballPlayer(++id, "메시", "미드필더", 10));
	}

	public FootballService() {
		System.out.println("순서3");
	}

	public List<FootballPlayer> selectAll() {
		return list;
	}

	// 뷰가 축구선수를 추가하기 위해서 호출되는 메소드
	public FootballPlayer addFootballPlayer(FootballPlayerDto fpd) {
		// 비즈니스로직 == 의사결정코드
		// 1. 이름이 두 글자 이상
		// 2. 포지션은 공격수/미드필더/수비수/골키퍼
		// 3. 등번호는 0이상
		
		if (fpd !=null && fpd.getName().length() >= 2) {

			//아하! fpd가 정상적으로 돌아오지 못했다면
			//NullPointException이 발생할수있겠구나!!
			//코드는 변수 조건문 반복문 3가지요소로 구성된다
			//사지선다 : 출력문 / 변수 / 조건문 / 반복문
			//값에 대한 유효성 검증 == validate
			
			if ("공격수".equals(fpd.getPosition()) ||
				fpd.getPosition().equals("공격수") ||
				fpd.getPosition().equals("미드필더") || 
				fpd.getPosition().equals("수비수") ||
				fpd.getPosition().equals("골키퍼")) {
				if (fpd.getBackNumber() >= 0){
					
					list.add(new FootballPlayer(
										++id,
										fpd.getName(),
										fpd.getPosition(),
										fpd.getBackNumber()));
					return list.get(list.size() -1);
					}
				}
			}
		return null;
		}
	
	
		public boolean idCheck(int id) {
			
			for(int i=0;i>list.size();i++) {
				if (list.get(0).getId( )== id);{
					return true;
				}
			}
				return false;
		}
			
		public void updateFootballPlayer(int id, FootballPlayerDto player) {
			//리스트에서 일치하는 id를 찾아서
			//인덱스값을 추출한뒤
			//DTO객체의 필드값 FootballPlayer의 index를 알아내야함
			
			/*int index = 0;
			for(int i=0; i<list.size();i++) {
				if(list.get(i).getId() == id) {
					
					//3이라고 입력했을시 세번째 바퀴에 이프문에 들어옴
				index = i;
				break;
				}
			}*/
			int index = indexOf(id);
			//유효성검사
			boolean result = validateFootballPlayer(player);
			
			if(result) {
				list.set(index, new FootballPlayer(id,player.getName(),player.getPosition(),player.getBackNumber()));
			}
		}
		
		private int indexOf(int id) {
			int index = -1;
			for(int i=0; i<list.size();i++) {
				if(list.get(i).getId() == id) {
			
				index = i;
				break;
				}
			}
			return index;
		}
		
		public String deleteFootballPlayer(int id) {
			int index = indexOf(id);
			if(index != -1) {
				list.remove(index).getName();
			}
			return null;
		}
			
			private boolean validateFootballPlayer(FootballPlayerDto fpd) {
			if (fpd !=null && fpd.getName().length() >= 2) {
				if ("공격수".equals(fpd.getPosition()) ||
					fpd.getPosition().equals("공격수") ||
					fpd.getPosition().equals("미드필더") || 
					fpd.getPosition().equals("수비수") ||
					fpd.getPosition().equals("골키퍼"))
					if (fpd.getBackNumber() >= 0){
						return true;
						}
					}
				
			return false;
			
		}
			
			public void findFootballPlayer(String keyword){
				
			}
		
	public List<FootballPlayer> findByKeyword(String keyword) {
		
		
		//boolean result = list.get(0).getName().contains(keyword);
		List<FootballPlayer> searched = new ArrayList();
		
		for(FootballPlayer player : list) {
			if(player.getName().contains(keyword)) {
				searched.add(player);
			}
		}
		return searched;
	}
	
	

	
		
		


}
