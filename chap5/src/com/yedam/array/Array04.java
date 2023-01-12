package com.yedam.array;

import java.util.Arrays;

public class Array04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[][] intAry  = {{1,2},{1,2,3}};
    
    int[][] mathScore = new int[2][3];
    for (int i = 0; i < mathScore.length; i++) {
//		System.out.println(mathScore.length);
		for (int j = 0; j < mathScore.length; j++) {
			System.out.println("mathScore["+i+"]["+j+"]="+mathScore[i][j]);
		}
		
	}
    //이차원 배열에 구구단 결과값 저장 
    //[[2],[3],[4],[5],[6].....[7],[8],[9]]
    int[][] multiTable = new int[8][9];
    for (int i = 2; i < 10; i++) {
    	//각 단수 마다 곱셈 
		for (int j = 1; j < 10; j++) {
			multiTable[i-2][j-1] = i*j;
		}
		
	}
    for (int i = 0; i < multiTable.length; i++) {
		System.out.print((i+2)+":단");
		System.out.print(Arrays.toString(multiTable[i]));  // 선택된 배열의 정보 출력하는 메소드 
		System.out.println();
	}
    
    //참조 타입 배열 
    String[] strArray = new String[3];
    strArray[0] = "yedam";
    strArray[1] = "yedam";
    strArray[2] = new String("yedam");
    // 주소값 비교 
    System.out.println(strArray[0] == strArray[1]);
    System.out.println(strArray[0] == strArray[2]);
    //string 데이터 비교 
    System.out.println(strArray[0].equals(strArray[2]));
    
    //배열복사 
    int[] oldArray = {1,2,3};
    int[] newArray = new int[5];
    for (int i = 0; i < oldArray.length; i++) {
		newArray[i] =oldArray[i];
		
	}
    for (int i = 0; i < newArray.length; i++) {
		int j = newArray[i];
		
	}
    for (int i = 0; i < newArray.length; i++) {
		System.out.println(newArray[i]);
		
	}
    int[] oldArray2 = {1,2,3,4,5,6,7};
    int[] newArray2  =new int[10];
    
    System.arraycopy(oldArray2, 0, newArray2,0,oldArray2.length);
    for (int i = 0; i < newArray2.length; i++) {
		System.out.print(newArray2[i]);
		
	}
    for (int temp : newArray2) {
		System.out.print(temp+"\t");
		
	}
	}
	
	
	

}
