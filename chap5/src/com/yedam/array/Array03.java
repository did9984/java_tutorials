package com.yedam.array;

import java.util.Scanner;



public class Array03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scanner = new Scanner(System.in);
      //배열
      int[] ary;
      //배열의 크기(인덱스 갯수)
      int no;
      
      System.out.println("배열의 크기>");
      no = Integer.parseInt(scanner.nextLine());
      
      ary= new int[no];
      
//      System.out.println(ary.length);
      
      for (int i = 0; i < ary.length; i++) {
		System.out.println("입력>");
		ary[i] = Integer.parseInt(scanner.nextLine());
	}
 
     int max=ary[0];
     for (int i = 0; i < ary.length; i++) {
		if (max < ary[i]) {
			max = ary[i];
		}
		
	}
     System.out.println(max);
     int min = ary[0];
     for (int j = 0; j < ary.length; j++) {
		if (min>ary[j]) {
			min = ary[j];
		}
		
	}
     System.out.println(min);
	}

}
