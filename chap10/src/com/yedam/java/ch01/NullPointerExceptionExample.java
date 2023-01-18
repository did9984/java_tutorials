package com.yedam.java.ch01;

public class NullPointerExceptionExample {
	public static void main(String[] args) { 
		//NullPointerException
//		String data = null;
//		System.out.println(data.toString()); // 사용불가
//		
//		
//		System.out.println(data.toCharArray()); // 사용불가 
         
		
		//ArrayIndexOutOfBoundsException  //배열 예외(exception)
		
		if (args.length>2) { 
			String data1 = args[0];//run -> run configuration -> Argument 위에칸에 args 값을입력 
			String data2 = args[1];
			//if에 만족하지않아서 출력안됨
			System.out.println("args[0]: " + data1);
			System.out.println("args[1]: " + data2);
		}
			
			
			//NumberFormatExceptionExample
			String data3 = "100";
			String data4 = "a100";
					
			int value1 = Integer.parseInt(data3);
			int value2 = Integer.parseInt(data4);
			
			int result = value1 + value2;
			System.out.println(data3 + "+" + data4 + "=" + result);
		
		
	}
	
}


