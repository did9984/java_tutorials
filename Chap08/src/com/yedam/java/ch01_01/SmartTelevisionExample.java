package com.yedam.java.ch01_01;

public class SmartTelevisionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SmartTelevsion sm = new SmartTelevsion();
        
        
        sm.turnOn();
        sm.search("낚시 tv");
        sm.setVolume(9999);
        sm.setVolume(-9999);
        sm.turnOff();
        
        RemoteControl re = sm;
        Searchable se =sm;
        
        
        
	}

}
