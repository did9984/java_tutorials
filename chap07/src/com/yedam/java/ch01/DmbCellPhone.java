package com.yedam.java.ch01;

public class DmbCellPhone extends Cellphone {
   //필드
	int channel;
	
   //생성자
	public DmbCellPhone(String model,String color,int channel){
		super(model, color);
//		this.modelString = model;
//		this.colorString =color;  //생성자
		this.channel =channel;
	}
	//메소드
	void trunOnDmb() {
		System.out.println("채널 "+channel+"번 DMB 방송 수신을 시작합니다.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널"+channel+"번으로 바꿉니다");
		
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다");
	}
}
