package com.yedam.variable;

public class castiong {

	public static void main(String[] args) {
    // 자동타입변환 
	byte byteValue = 10;
	int intValue =byteValue;
	
	System.out.println("intValue:"+intValue);
	
	char charValue = '가';
	intValue = charValue;
	System.out.println("가의 유니코드:" +intValue);
	
	intValue =50;
	long longValue = intValue;
	System.out.println("longValue:" +longValue);
	double doubleValue = longValue;
	System.out.println("doubleValue" +doubleValue);
	System.out.println("안녕");
	
	int intVar2 = 44032;
	char charVar = (char)intVar2;
			
	System.out.println("charVar:"+charVar);
	double doubleVar = 3.14;
	intVar2 = (int)doubleVar;
	System.out.println(intVar2);
	}

	
	
    
}
