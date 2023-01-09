package com.yedam.variable;

import java.util.Scanner;

public class Import {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in); // system.in 은데이터 입력	
		System.out.println("Write your name");
		String name = input.nextLine();	
		System.out.println("How old are you?");
		int number = input.nextInt();// javascript value 같은 의미 값을 불러옴
		input.nextLine();
		System.out.println("What is your favorite food?");
		String food = input.nextLine();
		
		System.out.println("hello" + name);
		System.out.println("your age is:" + number);
		System.out.println("You likes "+food);

	}

}
