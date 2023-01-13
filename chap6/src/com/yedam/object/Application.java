package com.yedam.object;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 클래스 생성해서 객체 만든 다음 객체 바로 사용.
		// 객체를 한 곳에 모아서 관리하는 형태
		// 배열
		//int[] ary = new int[4];
		//student[] stdAry = new Student[10];
		
		//학생 정보 보관하는 배열 
		Student[] stdAryStudents =null;
		int stdNum = 0;
		Scanner sc = new Scanner(System.in);
		boolean a = true;
		//while문을 활용해서 학생 관리 프로그램 작성.
		while (a) {
			System.out.println("=====================");
			System.out.println("1.학생수|2.정보입력|3.정보확인|4.종료");
			System.out.println("=====================");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if (selectNo ==1) {
				System.out.println("student");
				stdNum = Integer.parseInt(sc.nextLine());
				
			}else if (selectNo ==2) {
				stdAryStudents = new Student[stdNum];
				for (int i = 0; i < stdAryStudents.length; i++) {
//					Student stdStudent= new Student();
					stdAryStudents[i] = new Student();
			
							
				}
				
			}else if (selectNo ==3) {
				for(int i =0 ; i<stdAryStudents.length;i++) {
					System.out.println("국어");
					stdAryStudents[i].kor= Integer.parseInt(sc.nextLine());
					System.out.println("수학");
					stdAryStudents[i].math= Integer.parseInt(sc.nextLine());
					System.out.println("영어");
					stdAryStudents[i].eng= Integer.parseInt(sc.nextLine());
			}else if(selectNo ==4) {
				int iotal = 0; 
				double avg =0;
				System.out.println("전체 학생 총합/평균 조회");
				for (int j = 0; j < stdAryStudents.length; j++) {
					total = stdAryStudents[j].kor +stdAryStudents[j].eng+stdAryStudents[j].math;
					avg= total /3.0;
					System.out.println((i+1) );
					System.out.println(totla+avg);
				}
				
			}else if (selectNo ==5) {
				System.out.println("quit");
				break;
			}
		}
	}

}
