package com.yedam.java.ch02_01;

public class Car {
	Tire frontLe = new HankookTire();
	Tire frontRi = new HankookTire();
	Tire backLe = new HankookTire();
	Tire backRi = new HankookTire();

	
	public void run() {
		 frontLe.roll();
		 frontRi.roll();
		 backLe.roll();
		 backRi.roll();
	}
}
