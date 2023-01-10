package com.yedam.loop;



public class LoopFor2 {

	public static void main(String[] args) {
		// 중첩 for 문
		// for(){}
		// for(){}
		
		//2단 ~9단 출력
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <=9; j++) {
//		
				System.out.println(i+"*"+j+"="+(i*j));
			}
			System.out.println();
		}
		
		//별찍기 
	   for (int i = 5; i > 0 ; i--) {
		for (int j = 0; j <i ; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	   
	}

}
