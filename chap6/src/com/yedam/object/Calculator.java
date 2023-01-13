package com.yedam.object;

public class Calculator {
	// 필드

	// 생성자

	// 메소드
	// 메소드 리턴 타입이 존재할때
    int sum(int a,int b) {
    	return a+b;	
    }
    
    double sub(int a ,int b) {
    	return a-b;
    }
    
    String result(String value) {
    	String tempString = "value 테스트:" +value;
    	return tempString;
    }
    
    //return 없이 method 생성 
    void powerOn() {
    	System.out.println("turn on");
    }
    void powerOff() {
    	System.out.println("turn off");
    	}
    
    //매개변수 정확한 갯수 모를때.
    int sum2(int ...values) {
    	int total = 0;
    	for(int a : values) {
    		total +=a;
    	}
		return total;
    }
    
    
}
