package com.yedam.ch06;

import java.security.PublicKey;

public class Car {
	private int speed;
	private int maxSpeed;
	private String modelString;

	public Car(String model, int maxSpeed) {
		this.modelString = model;
		this.maxSpeed = maxSpeed;
		this.speed = 0;
	}

	public String getModelString() {
    	return this.modelString;
    }

	

	public int getMaxspeed() {
		return this.maxSpeed;
	}

	public void getSpeed(int speed) {
		this.speed = speed;
	}
}