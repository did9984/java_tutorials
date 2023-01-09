package com.yedam.print;

public class printExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      // println
		System.out.println("출력과 동시에 행을 변경(Enter)");
		//pritn
		System.out.print("출력만 함. \n");
		//printf
		System.out.printf("이름:%s,나이%d,온도:%f","park",28,9.5);
		
		//printf 메소드 사용법 
		System.out.println();
		int value  =123; 
		System.out.printf("상품의 가격:%d원\n",value);  //123
		System.out.printf("상품의 가격:%6d원\n",value); //           123
		System.out.printf("상품의 가격:%-6d원\n",value);
		System.out.printf("상품의 가격:%06d원\n",value);
		
		double area =3.14*10*10;
		
		System.out.printf("반지름이 %d인 원의 넓이 : %f\n",10,area);
		
		System.out.printf("%6d | %-10s | %10s\n",1,"전우치","소울마스터");
		
	}

}
