package com.yedam.java.ch02_01;

public class Child extends Parent {
   @Override
   public void method2() {
	   System.out.println("Child-method2()");  //자식이 먼저 출력 
   }
   
   public void method3() {
	   System.out.println("Child-method3()");
   }
}
