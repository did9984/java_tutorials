package com.yedam.java.ch03_01;

public class SmartPhone extends Phone  {

	public SmartPhone(String owner) {
		super(owner); //자식클래스 지칭할때 사용=super
		// TODO Auto-generated constructor stub
	}  //phone 부모클래스 
	
	public void internetSearch() {
		System.out.println("인터넷을 검색합니다");
	}
   

}
