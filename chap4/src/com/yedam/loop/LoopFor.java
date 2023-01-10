package com.yedam.loop;

import java.util.Scanner;

public class LoopFor {

	public static void main(String[] args) {
		// for 문

//		for (int i = 0; i <= 100; i++) {
//			System.out.println(i);
//		}
//
//		// 1부터 100 까지의 합 구하기
//		int result = 0;
//		for (int i = 0; i <= 100; i++) {
//			result += i;
//		}
//		System.out.println(result);
//	   for (int i = 0; i <=100; i++) {
//		if (i%2==0) {
//		System.out.println(i + "는짝수");
//		}else if (!(i%2==0)) {
//			System.out.println(i +"는 홀수");
//		}
//		
		// 입력한 숫자에 대한 구구단 출력 
		//스캐너를 활용하여 값을 하나 입력 
		//입력 받은 값에 대한 구구단 출력 
		//2를 입력 -> 2*1 =2... 2*9=18
		Scanner scanner = new Scanner(System.in);
//		System.out.println("구구단입력");
//		int gugu = Integer.parseInt(scanner.nextLine());
//		
//		for (int j = 1; j <= 9; j++) {
//			System.out.println(gugu+"*" +j+ " = " +(gugu*j));
//		}
		
		//입력한 값에 대한 총합, 평균 , 최대값 ,최소값 
	    System.out.println("갯수입력>");
	    int count = Integer.parseInt(scanner.nextLine());
	    
	    int total = 0;
	    int avg = 0;
	    int max=0;
	    int min=0;
	    
	    for (int i=0; i<count; i++) {
	    	System.out.println("데이터 입력>");
	    	int data = Integer.parseInt(scanner.nextLine());
	    	total += Integer.parseInt(scanner.nextLine());
	    	//최대값, 최소값
	    	if (i == 0) {
				max = data;
				min = data;
			}
	    	//최대값
	    	if(max <data) {
	    		data = max;
	    	}
	    	//최소값
	    	if(min>data) {
	    		max =data;
	    	}
	    }
	    
	    System.out.println(total);
	    
	    System.out.printf("평균 : %5.2f",(double)total/count);
	    
	    int randomNo = (int)(Math.random()*100)+1;
	    
	    for(int i = 0; i<5; i++) {
	    	System.out.println("UP &DOWN>>");
	    	int num =Integer.parseInt(scanner.nextLine());
	    	
	    	if (randomNo == num) {
	    		System.out.println("정답입니다");
	    		break;
				}
	    	else if(randomNo >num) {
	    		System.out.println("더 큰 수 입력");
	    	}else {
				System.out.println("더 작은수 입력");
			}
	    	if (i==4) {
				System.out.println("5번의 기회를 다 소진 하였습니다");
			}
	    }
	}
	    
	    
	}
	


