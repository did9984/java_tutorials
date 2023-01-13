package com.yedam.object;

import java.util.Calendar; //Calendar = javascript new date() 같은 느낌 

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator calc = new Calculator();
		int Result = calc.sum(10, 20);
		System.out.println(Result);

		Calculator cal1 = new Calculator(); // 싱글톤x 
		int result1 = cal1.sum(10, 20);
		System.out.println(result1);

		System.out.println(calc ==cal1);
		
		CalculatorSingle calsingle = CalculatorSingle.getIns(); // 싱글톤 
		CalculatorSingle calsingle2 =CalculatorSingle.getIns();
		System.out.println(calsingle == calsingle2);
		
		Calendar todayCalendar =Calendar.getInstance();//getinstance = 싱글톤 객체를 하나만 생성해서 사용
		todayCalendar.set(2023,2,1);
		System.out.println(todayCalendar.get(Calendar.DAY_OF_YEAR));
	}

}
