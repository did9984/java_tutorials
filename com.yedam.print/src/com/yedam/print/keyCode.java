package com.yedam.print;

import java.io.IOException;

import java.util.Scanner;

public class keyCode {

	public static void main(String[] args) throws IOException {
		
      int keyCode = 0; 
      
      System.out.println("입력>");
      keyCode =System.in.read();
      System.out.println("keyCode"+keyCode);
      keyCode =System.in.read();
      System.out.println("keyCode"+keyCode);
      keyCode =System.in.read();
      System.out.println("keyCode"+keyCode);
      
      //Scanner	
      
      Scanner input = new Scanner(System.in);
      System.out.println("What is your name?");
      String name = input.nextLine();
//      input.nextLine();
      System.out.println("Hello "+ name);
      if (name.equals("park")) {
		System.out.println("반갑습니다" + name);
	}
      
      
	}

}
