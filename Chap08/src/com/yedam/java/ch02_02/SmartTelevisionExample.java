package com.yedam.java.ch02_02;

public class SmartTelevisionExample {
	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv;
		rc.turnOff();
		Searchable searchable = tv;
		searchable.search("다음");
		
		
	}
}
