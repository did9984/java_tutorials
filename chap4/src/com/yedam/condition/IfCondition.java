package com.yedam.condition;

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
		score = 70;
		if (score >= 90) {
			System.out.println("등급 A");

		} else if (score >= 80) {
			System.out.println("등급 B");

		} else if (score >= 70) {
			System.out.println("등급 C");

		} else {
			System.out.println("등급 D");

		}

	}

}
