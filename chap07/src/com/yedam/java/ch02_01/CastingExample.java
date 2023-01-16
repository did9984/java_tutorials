package com.yedam.java.ch02_01;

public class CastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Parent parent = new Child();
       parent.method1();
       parent.method2();
       
       System.out.println();
       
       
       Child child2 = new Child();
       Child child = (Child)parent;
       child.method1();
       child.method2();
       child.method3();
       
       child2.method1();
       child2.method2();
       child2.method3();
       
       Parent pa =new Parent();
       if (pa instanceof Child) {  //강제 type 변환시 사용 
    	   Child ch = (Child)pa;
           ch.method1();
           ch.method2();
           ch.method3();
	}else {
		System.out.println("변수 pa의 인스턴스는 Child 클래스의 인스턴스가 아닙니다");
	}
       
 	}

}
