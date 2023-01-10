package com.yedam.condition;

import java.util.Scanner;

public class SwitchCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = (int) (Math.random() * 6) + 1;
		System.out.println(number);

		switch (number) {
		case 1:
			System.out.println("1번 나옴");
			break;
		case 2:
			System.out.println("2번 나옴");
			break;
		case 3:
			System.out.println("3번 나옴");
			break;
		case 4:
			System.out.println("4번 나옴");
			break;
		case 5:
			System.out.println("5번 나옴");
			break;
		case 6:
			System.out.println("6번 나옴");
			break;
		}

		// char
		char grade = 'B';
		String grade2 = "b";

		switch (grade2) {
		case "A":
			System.out.println("우수 회원");
			break;
		case "B":
		case "b": // b, B 둘다 실행 ;
			System.out.println("일반 회원");
			break;
		default:
			System.out.println("손님");
			break;
		}
		// 입력한 성적을 등급으로 환산
		Scanner sc = new Scanner(System.in);
		// 90,80,70,60
		System.out.println("wtire score");
		int scores = Integer.parseInt(sc.nextLine());
       
		switch ((int) scores / 10 * 10) {
		case 100:
		case 90:
			System.out.println("A등급");
			break;
		case 80:
			System.out.println("B등급");
			break;
		case 70:
			System.out.println("C등급");
			break;
		default:
			System.out.println("D등급");
			break;
		}
	}

}
