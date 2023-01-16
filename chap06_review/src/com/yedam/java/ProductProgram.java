package com.yedam.java;

import java.util.Scanner;

public class ProductProgram {
   
	public ProductProgram() {
		Scanner sc = new Scanner(System.in);
		Product[] listProducts = null; //클래스 배열
		int prodctNum = 0;
		boolean run =true;
		while(run) {
			System.out.println("===1.상품 수 |2.상품 및 가격입력|3.제품별가격|4.분석|5.종료====");
			System.out.println("선택>");
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if (selectNo == 1) {
				System.out.println("상품 수>");
				prodctNum = Integer.parseInt(sc.nextLine());
				listProducts = new Product[prodctNum];
			}else if(selectNo==2) {
				for (int i = 0; i < listProducts.length; i++) {
					System.out.print("상품명>");
					String nameString = sc.nextLine();
					System.out.print("상품가격>");
					int price = Integer.parseInt(sc.nextLine());
					
					Product product = new Product(nameString, price); // Product 파일에 변수를 불러옴 
					
					listProducts[i]=product;
				}
			}else if(selectNo==3) {
				for (Product i : listProducts) {
					System.out.printf("%s :%d\n",i.getPromName(),i.getProPrice());
				}
				
			}else if(selectNo==4) {
				int max = 0;
				int productIndex =0;
			}else if(selectNo==5) {
				System.out.println("프로그램을 종료합니다");
				run = false;
			}else {
				System.out.println("메뉴를 잘못 선택했습니다");
			}
		}
	}
}
