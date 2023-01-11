package com.yedam.loop;

import java.util.Iterator;
import java.util.Random;

import sun.java2d.pipe.OutlineTextRenderer;

public class LoopCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while break;
		Random math = new Random();
		while (true) {
			int num = math.nextInt(6) + 1;
			System.out.println(num);
			if (num == 6) {
				break;
			}
		}
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= 10; j++) {
				if (j == 5) {

					System.out.println("i + j= " + (i + j));
					break;
				} else {
					System.out.println(j);
				}

			}

		}
      //for문 label Break;
		System.out.println();
		Outter : for(char upper = 'A'; upper <='z'; upper++) {
			for (char lower = 'a';lower  <='z'; lower++) {
				System.out.println(upper + "-" +lower);
				if (lower =='g') {
					break Outter; // Outter 입력하지않을시 Outter: for 가 계속실행
				}
				
			}
		}
		System.out.println("");
		//continue;
		for (int i = 0; i <=10; i++) {
			if (i%2==0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
