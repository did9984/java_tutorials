package com.yedam.java.ch01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
      DmbCellPhone dmbCellPhone = new DmbCellPhone("nokia", "회색", 3);
     
      dmbCellPhone.changeChannelDmb(9);
      //CellPhone의 필드
      System.out.println("모델:"+dmbCellPhone.modelString);
      System.out.println("색깔:" +dmbCellPhone.colorString);
      dmbCellPhone.turnOffDmb();
      //DmbCellPhone의 필드
      System.out.println("채널:" +dmbCellPhone.channel);
      
      //cellPhone 의 메소드
      dmbCellPhone.powerOn();
      dmbCellPhone.bell();
      dmbCellPhone.sendVoice("moshimoshi");
      dmbCellPhone.receiveVoice("hello");
      
      //DmbCellPhone의 메소드
      dmbCellPhone.trunOnDmb();
      
	}

}
