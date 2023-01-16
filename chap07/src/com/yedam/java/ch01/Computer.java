package com.yedam.java.ch01;

public class Computer extends Calculator {
    
	@Override
	double areaCircle(double r) {
	System.out.println("Computor 객체의 areaCircle() 실행");
		return super.areaCircle(r);
	} //오른쪽 클릭 -> source -> override/implemnet

}
