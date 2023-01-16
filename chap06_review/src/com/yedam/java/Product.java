package com.yedam.java;


public class Product {
   // 상품의 정보를 담는 클래스
	
	//필드-해당 클래스가 가지는 모든 정보
	private String pronameString; // 상품명
	private int proPrice;  //상품정보 
	
	//생성자-인스턴스를 생성할 때 필요한 프로세스 
	public Product(String pronameString,int proPrice) {
		this.pronameString=pronameString;
		this.proPrice =proPrice; //this =해당 인스턴스	static 이 붙어있는 method에는 this를 사용불가
	}
	//메소드 -해당 클래스가 가지는 모든 기능 
	public void setProName(String proName) {  //필드는 무조건 대문자 ,interface 의 이름은 대문자(오류는 나지않음)
		this.pronameString =proName;
	}
	
	public String getPromName() {
		return this.pronameString;
	}
	
	public void setProPrice(int proPrice) {
		this.proPrice = proPrice;
	}
	
	public int getProPrice(){
		return this.proPrice;
	}

}
