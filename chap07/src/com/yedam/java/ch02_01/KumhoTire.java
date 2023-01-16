package com.yedam.java.ch02_01;

public class KumhoTire extends Tire {

	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
		// TODO Auto-generated constructor stub
	}

	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + "kumhoTire 수명:" + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + "kumhoTire펑그***");
			return false;
		}
	}

}
