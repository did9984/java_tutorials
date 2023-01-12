package com.yedam.reference;

import java.util.Scanner;



public class studnetAry {

	public static void main(String[] args) {
		// 학생의 성적을 입력.
        // 과목수
	
	
	 
	 
	 int subjectNum = 0;
	 boolean end= true;
	 
	 int[] scores = null;
	 Scanner sc = new Scanner(System.in);
	 while (end) {
	  System.out.println("=======================================");
	  System.out.println("1.과목수|2.점수입력|3.점수리스트|4.분석|5.종료");
	  System.out.println("=======================================");
	  System.out.println("메뉴입력>");
	  
	  int selectNo = Integer.parseInt(sc.nextLine());
        if(selectNo == 1) 
        {    System.out.println("과목수>");
           subjectNum = Integer.parseInt(sc.nextLine());
           scores= new int[subjectNum];
		}
         
        else if(selectNo == 2) {
          for (int i = 0; i < scores.length; i++) {
        	  System.out.println("점수를 입력해주세요");
			scores[i] =sc.nextInt(); // enter를 날려준다 
			sc.nextLine();
		}
        }	  
        else if(selectNo == 3) {
        	for (int i = 0; i < scores.length; i++) {
				
				System.out.println(scores[i]);
			}
        }
        else if(selectNo == 4) {
        	//총합 평균
        	int answer = 0;
        	for (int i = 0; i < scores.length; i++) {
				answer += scores[i];
				
			}System.out.println(answer/scores.length);
        }
        else if(selectNo ==5) {
        	end = false;
        	System.out.println("end of prog");
        }
   	}

}
}