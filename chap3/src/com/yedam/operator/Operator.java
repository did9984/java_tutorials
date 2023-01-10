package com.yedam.operator;

public class Operator {

	public static void main(String[] args) {
		//++num , num ++
		int num = 0;
		System.out.println(num++); // 0 num = num +1 실행문 실행후
		//num == 1
		System.out.println(++num); // 2 num = num +1 실행문 실행전
		
		System.out.println(num--);

		System.out.println(--num);
	}

}
