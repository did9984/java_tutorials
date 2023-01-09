package com.yedam.variable;

public class Variable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hour =3;
		int minute = 5; 
    System.out.println(hour + "시간"+minute+"분");
    
    int totalMinite = (hour*60) + minute;
    System.out.println("총"+totalMinite+"분");
    
    int value=0; 
    
    int result = value +10;
    System.out.println(result);
    int x = 3 ; 
    int y = 5 ;
    int a = 0;
    a =x;
    x =y;
    y =a; 
    System.out.println(x);
    System.out.println(y);
	}

}
