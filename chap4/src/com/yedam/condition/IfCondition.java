package com.yedam.condition;

import java.util.Scanner;

public class IfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 93;

		if (score >= 90) {
			System.out.println("점수가 90이상이고,등급 A");
			System.out.println("스코어가 90");
		}
		// 실행문이 한 줄 일때만 사용
		if (score >= 90)
			System.out.println("점수가 90이상이고, 등급 A");
		System.out.println("스코어가 90"); // 별도 태그

		// if-else
		if (score >= 90) {
			System.out.println("점수가 90이상입니다.");
			System.out.println("등급은 A입니다");
		} else {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다");
		}

		// else - if
		// if문(조건식을 여러 개 사용 할 때)
//		score = 70;
//		if (score >= 90) {
//			System.out.println("등급 A");
//
//		} else if (score >= 80) {
//			System.out.println("등급 B");
//
//		} else if (score >= 70) {
//			System.out.println("등급 C");
//
//		} else {
//			System.out.println("등급 D");
//
//		}

		System.out.println(Math.random() * 10);
		// 0*10 <= Math.random() *10 <1*10

		// 0<= Math.random() *10 <10
		// int number = (int) 5.12; 소수점은 int 로 되지않아 오류가 난다

		// 0~9 => 1~10
		// (int) 0+1 <= (int)Math.random() *10 +1 <(int) 10+1

		// 주사위의 번호 뽑기
		// 0 <= x <6
		// 1 <=x+1 <6
		int number = (int) (Math.random() * 6) + 1;
		System.out.println(number);
		if (number == 1) {
			System.out.println("1번나옴");
		} else if (number == 2) {
			System.out.println("2번나옴");
		} else if (number == 3) {
			System.out.println("3번나옴");
		} else if (number == 4) {
			System.out.println("4번나옴");
		} else if (number == 5) {
			System.out.println("5번나옴");
		} else if (number == 6) {
			System.out.println("6번나옴");
		}

		// 중첩 if문
		// data -> 조건 여러 번 검색
//		int no = 10;
//		// no 가 2의 배수
//		if (no%2 ==0) {
//			if (no%5==0) {
//				if (no%10==0) {
//					System.out.println("no는 10의 배수입니다");
//				}
//				
//			}
//		}
		Scanner sc = new Scanner(System.in);
		System.out.println("점수입력>");
		score = Integer.parseInt(sc.nextLine());
		String gradeString = "";
		if (score >= 90) {
			if (score >= 95) {
                gradeString = "A+";
			} else {
                 gradeString="A";
			}
		}
	System.out.println("획득한 학점 :" +gradeString);
	}
	

}
