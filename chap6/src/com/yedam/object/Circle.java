package com.yedam.object;

public class Circle {

	static final double pi=3.14;  // final 이있으면 pi 값 변경불가
	private double r;
	
	//r read/write
	//setR 이 없으면 외부에서 변경 불가능 
	public void setR(double r) {  //
		this.r = r;
	}

   

	public double getR() {
		return r;
	}



	public Circle() {} // 설정해줘야 다른 폴더 사이에서도 생성가능 
	
	
	
	//r 필드 초기화 생성자 
	Circle(double r){
		this.r = r;
	}
		
	
	public double area() {

		double result = pi * r * r;
		return result;
	}




}
