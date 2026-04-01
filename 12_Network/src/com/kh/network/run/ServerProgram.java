package com.kh.network.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		ServerSocket server = null;
		PrintWriter pw = null;
		BufferedReader br = null;
		
		int portNumber = 1234;
		try {
			
			server = new ServerSocket(portNumber);
			
			System.out.println("클라이언트 요청을 기다리는중");
			Socket socket = server.accept();
			System.out.println("클라이언트와 연결성공");
			
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			pw = new PrintWriter(socket.getOutputStream());
			
			
			while(true) {
				String message = br.readLine();
				if(message.equals("null")) {
					break;
				}
				System.out.println("클라이언트로부터 받은 메세지 :" + message);
				
				System.out.print("클라이언트에게 전송할 메시지 >");
				String sendMessage = sc.nextLine();
				pw.println(sendMessage);
				
				pw.flush();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			pw.close();
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sc.close();
			
				try {
					server.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}

	}

}
/*
 * 통신을 하기위해서는 서버와 클라이언트 연결이 필요함
 * 
 * ServerSocket -> 포트번호와 연결(Bind)해서 외부의 연결요청을  기다리다가 요청이 들어오면 수락해줄 용도 -> 수락하는 순간
 * 서버의 Socket 객체를 생성 Socket -> Process 간의 통신을 담당 -> Socket객체를 이용해서 통신을 위한 기반 스트림
 * InputStream / OutStream 을 제공받음 -> 기반스트림만으로 한글 전송에 제약이있어서 보조스트림을 사용
 * 
 * 소켓 통신용 서버측 프로그램 작성절차
 * 1) 포트번호 지정(서버에서 몇번 포트를 열것인지)
 * 2) ServerSocket 객체생성 => 매개변수 생성자 호출시 포트번호 인자로 전달(포트결합/Binding)
 * 3) 대기상태
 * 4) 클라이언트가 연결 요청을 보내면 수락후 통신가능한 Socket 객체를 반환받음
 * 5) Socket 객체를 이용해서 입/출력용 스트림 열어주기
 * 6) 보조스트림을 사용해서 성능개선
 * 7) 데이터를 주고받는 코드
 * 8) 자원반납
 * 
 */
