package com.yedam.java.ch01_01;

public class SmartTelevsion implements Searchable, RemoteControl {

	private int volume;
	

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Tv를 끕니다");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Tv를끕 니다");
	}

	@Override
	public void setVolume(int volume) {

		if (volume > RemoteControl.MAX_VALUE) {
			this.volume = RemoteControl.MAX_VALUE;
		} else if (volume < RemoteControl.MIN_VALUE) {
			this.volume = RemoteControl.MIN_VALUE;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Tv 볼륜:" + this.volume);
	}

	@Override
	public void search(String url) {
		System.out.println(url+"를 검색합니다.");

	}

}
