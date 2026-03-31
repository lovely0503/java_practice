package com.kh.chap04.run;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRun {

	public static void main(String[] args) {
		//파일은 파일인데 확장자가 .properties
		//변경하지않는 설정정보
		//해당 프로그램이 기본적으로 가져야할 정보들을 담는용도 많이 사용
		Properties prop = new Properties();//상속의 잘못된예
		
		//prop.put("sdfsdf",new Sandwich("맛있음","에그마요"));
		prop.setProperty("List", "LinkedList");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Set", "HashSet");
		
		//prop.put
		try {
		prop.store(new FileOutputStream("test.properties"), "쓰고싶은거");
		}catch(IOException e){
			e.printStackTrace();
		}
		//network
		//통신이 가능한 두개이상의 Device를 물리적/논리적으로 연결해놓은 환경
		//데이터를 전송하기위해 네트워크라는것을 만듬
		//Internet환경에서 통신을 하기위해서 기본적으로 IP Address가 필요함
	}

}
