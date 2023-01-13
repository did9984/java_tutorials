package com.yedam.object;

public class CircleTest {
	// 반지름이 5인 원의 면적 계산
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//static ==정적 공유
		System.out.println(Circle.pi);
		// circle 객체 생성
		Circle cir = new Circle(5);
		// area
		double result = cir.area();
		
		// 결과 출력
		System.out.println(result);
		
		Circle cir2 = new Circle();
		cir2.r = 10;
		
		CircleSingle circleSingle = CircleSingle.getins();
		circleSingle.r =5;
		double result3 = circleSingle.area();
		System.out.println(result3);
	}

}
//CircleSingle circleSingle = CircleSingle.getIns();
//CircleSingle.r =5;
//CircleSingle circlesingle2 = CircleSingle.getIns();
//circlesingle2.r =10;  // 싱글톤은 변수 두개를 만들어도 밑에있는거 하나만 출력 
//
//double result222 = circleSingle.area();
//System.out.println("넓이는 : " + result222);
