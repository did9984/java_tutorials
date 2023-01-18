package com.yedam.java.ch01_01;



public interface RemoteControl {
	// interface = static final 없이 상수 선언 가능
	// 상수(Constant) =static final 이 언제나 붙어있다
	// 상수 상수는 무조건초기값이 있어야함 ex int max =10; int max; =오류
//  public static final int MAX_VALUE =10;
	public int MAX_VALUE = 10;
	public int MIN_VALUE = 0;
	// 추상 메소드
//	public default void method() //interface 에서는 default 를 사용하면 일반 class 처럼 입력가능
//	{System.out.println("일반 메소드입니다");}
	
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
