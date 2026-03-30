package com.kh.chap04.model.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04.model.vo.Message;

public class ObjectDao {

	public void outputFile() {
		Message m = new Message("강민범","반가워요");
		
		//출력
		//객체단위로 출력을할때 필요한 보조 스트림
		try(ObjectOutputStream fos = new ObjectOutputStream (new FileOutputStream("e_object.txt"))){
			fos.writeObject(m);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void inputFile() {
		try(ObjectInputStream ois =
			new ObjectInputStream(new FileInputStream("e_object.txt"))){
				Message m = (Message)ois.readObject();
				System.out.println(m);
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
