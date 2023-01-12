package homework01;

import java.util.ArrayList;
import java.util.Arrays;

import javax.security.auth.callback.ConfirmationCallback;

public class Homework03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 10, 20, 30, 50, 3, 60, -3 };
		System.out.println(arr1[5]);
		//문제 2 
		System.out.println(arr1[0]+","+arr1[1]+","+arr1[2]+","+arr1[3]+","+arr1[5]+","+arr1[6]);
		//문제 3 
		arr1[1] = 1000;
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+",");
		}
		System.out.println();
		//문제 4 
		int max = 0;
		for (int i = 0; i < arr1.length; i++) {
			if (max < arr1[i]) {
				max = arr1[i];
			}
			
		}System.out.println(max);
		int min =0; 
		for (int i = 0; i < arr1.length; i++) {
			if (min > arr1[i]) {
				min = arr1[i];
			}
		}System.out.println(min);
		System.out.println();
		//문제 5 
		int[] arr2 = { 10, 20, 30, 50, 3, 60, 3 };
		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] % 3==0) {
				System.out.println(arr2[i]);
			}
			
		}
		System.out.println();
		//추가문제
		
		int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
	
		int[] counter = new int[4];
		
		for (int i = 0; i < answer.length; i++) {
			
			if (answer[i] == 1) {
				System.out.println();
				  System.out.print("*");
				  
			}
			if (answer[i] == 2) {
				System.out.println();
				  System.out.print("*");
				  
			}
			if (answer[i] == 3) {
				 System.out.println();
				  System.out.print("*");
				 
			}
			if (answer[i] == 4) {
				 System.out.println();
				  System.out.print("*");
				 
			}
			}
		
	}

}
