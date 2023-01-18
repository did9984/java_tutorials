package com.yedam.java.ch03_01;

public abstract class Phone { 
	//abstract 가 있으면 자식클래스에서만 불러오기가능 
	//필드
	public String ownerstString;
	
	//생성자
	public Phone(String owner) {
		this.ownerstString =owner;
	}
	//메소드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("폰 전원을 끕니다");
	}

}
