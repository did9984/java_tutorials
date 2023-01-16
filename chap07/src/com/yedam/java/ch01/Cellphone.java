package com.yedam.java.ch01;

public class Cellphone { // 부모 클래스
   //필드
	String modelString;
	String colorString;
	
	//생성자
	public Cellphone(String model, String color) {
		this.modelString = model;
		this.colorString = color;
	}
	
	//메소드
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	void sendVoice(String message) {
		System.out.println("자기:"+message);
	}
	
	void receiveVoice(String message) {
		System.out.println("상대방 : "+message);
	}
}
