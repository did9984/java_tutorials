package com.yedam.java.ch02_01;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Car myCar = new Car();
    
    myCar.run();
    
    System.out.println();
    myCar.frontLe =new KumhoTire();
    myCar.backRi =new KumhoTire();
    
    myCar.run();
	}

}
