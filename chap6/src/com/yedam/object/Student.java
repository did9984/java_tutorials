package com.yedam.object;

public class Student {

	// 필드 , 객체의 속성 ( 정보 , 데이터 )가 저장되는 부분
	// 이름
	String name;
	int age;
	String schoolName;
	int kor;
	int eng;
	int math;

	// 생성자 , 객체 초기화 ( 생성 )할 때 사용하는 부분
	Student() { // 클래스명이랑 같아야 함
		System.out.println("한");
	}

	// 메소드 , 객체를 생성 후 기능을 사용할 때 정의하는 부분

	void getInfo() {
		System.out.println("학생의 이름 : " + name);
		System.out.println("학생의 나이 : " + age);
		System.out.println("학생의 학교 : " + schoolName);
		System.out.println("국어점수 : " + kor);
		System.out.println("영어점수 : " + eng);
		System.out.println("수학점수 : " + math);
	}

}
