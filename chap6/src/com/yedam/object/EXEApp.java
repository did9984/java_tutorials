package com.yedam.object;

public class EXEApp {

	public static void main(String[] args) {
		
		Book B1 =new Book(null, null, null, null);
		System.out.println(B1.publisher);
		System.out.println(B1.kinds);
		System.out.println(B1.price);
		System.out.println(B1.bookNumer);
		
		
		// TODO Auto-generated method stub
		// Book 클래스
		// 책의 종류, 가격, 출판사 ,도서번호의 정보
		// 정보는 원하는 방식 아무거나 활용해서 정보 입력.
		// getInfo 메소드 객체가 가진 정보 출력.
		// getInfo의 출력 예시
		// 혼자 공부하는 자바
		// # 내용
		// 1) 종류 : 학습서
		// 2) 가격 : 24000원
		// 3)출판사 : 한빛미디어
		// 4) 도서번호 :yedam-001

		// 다른 예시
		// 이것이 리눅스다
		// #내용
		// 혼자 공부하는 자바
		// # 내용
		// 1) 종류 : 학습서
		// 2) 가격 : 32000원
		// 3)출판사 : 한빛미디어
		// 4) 도서번호 :yedam-002
		
		
		Car car1 = new Car("");
		System.out.println("car1.company :"+car1.compayString);
		System.out.println(car1.maxSpeed);
		System.out.println();
		
		Car car2 = new Car("자가용");
		System.out.println("2"+car2.compayString);
		System.out.println("2:"+car2.minSpeed);
		
		Calculator calculator =new Calculator();
		double result =calculator.sub(1,1);
		System.out.println(result);
		
		calculator.powerOff();
		calculator.powerOn();
		
		int sumResult = calculator.sum2(1,2,3,4,5,6,7,8,9);
		System.out.println(sumResult);
		sumResult= calculator.sum2(1,2,3,4,5);
		System.out.println(sumResult);
		
		Score score =new Score(10,1,20);
		
		score.getinfo();
		
	}

	
}
