package com.yedam.object;

public class CircleSingle {
   //싱글톤
   static CircleSingle ins =new CircleSingle();
   static CircleSingle getins() {
	   return ins;
   }
	
	static final double pi =3.14;  // final 이있으면 pi 값 변경불가
	 static double r;
	
	
	
	private CircleSingle(){}
	
	//r 필드 초기화 생성자 
	CircleSingle(double r){
		this.r = r;
	}
		
	
	double area() {

		double result = pi * r * r;
		return result;
	}

}
//static CircleSingle ins =new  CircleSingle();
//static CircleSingle getIns() {
//	return ins;
//}