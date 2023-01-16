package com.yedam.java;

import java.util.Scanner;


public class ProductProgram {
   private Scanner sc =new Scanner(System.in);
   private Product[] listProducts =null;
   
   
	public ProductProgram() {
		while(true) {
			//메뉴 출력
			menuPrint();
			//메뉴 선택
			int selectNo = menuSelect();
			if (selectNo == 1) {
				//상품 수 입력 
				inputProductNum();
			}else if(selectNo ==2) {
				//상품 및 가격 입력
				inputProductInfo();
			}else if(selectNo ==3) {
				///제품별 가격
				ProductInfoPrint();
			}else if(selectNo ==4) {
				//분석
				ProducAnalysis();
			}else if(selectNo ==5) {
				//프로그램 종료
				exit();
				break;
			}else {
				//잘못된 메뉴를 선택할 경우 안내메세지 출력
				printErrorMessage();
			}
		}
	}

	private void printErrorMessage() {
		// TODO Auto-generated method stub
		System.out.println("메뉴를 잘못 선택했습니다");
	}

	private void exit() {
		// TODO Auto-generated method stub
		System.out.println("프로그램을 종료합니다");
		
	}

	private void ProducAnalysis() {
		// TODO Auto-generated method stub
		int max = 0; // 가장 큰값
		int productIndex =0; // 가장 큰값이 몇번째인지 나옴 
		for (int i = 0; i < listProducts.length; i++) {
			Product product = listProducts[i];
			if (max < product.getProPrice()) {
				max = product.getProPrice();
				productIndex =i;
			}
		}
		
		int sum =0;
		for(int i=0;i<listProducts.length;i++) {
			if (i == productIndex) 
				continue;
				Product product = listProducts[i];
				sum += product.getProPrice();
			}
			System.out.println("최고 가격을 가진 제품은"+listProducts[productIndex].getPromName()+"입니다");
			System.out.println("최고 가격을 제외한 제품들의 합은" +sum+"입니다.");
	}

	private void ProductInfoPrint() {
		// TODO Auto-generated method stub
		for (Product i : listProducts) {
			System.out.printf("%s :%d\n",i.getPromName(),i.getProPrice());
		}
	}

	private void inputProductInfo() {
		// TODO Auto-generated method stub
		for (int i = 0; i < listProducts.length; i++) {
			System.out.print("상품명>");
			String nameString = sc.nextLine();
			System.out.print("상품가격>");
			int price = Integer.parseInt(sc.nextLine());
			
			Product product = new Product(nameString, price); // Product 파일에 변수를 불러옴 
			
			listProducts[i]=product;
		}
	}

	private void inputProductNum() {
		// TODO Auto-generated method stub
		System.out.println("상품 수>");
		int  prodctNum = Integer.parseInt(sc.nextLine());
		listProducts = new Product[prodctNum];
	}

	private int menuSelect() {
		// TODO Auto-generated method stub
		System.out.println("선택>");
		return Integer.parseInt(sc.nextLine());
	}

	private void menuPrint() {
		// TODO Auto-generated method stub
		System.out.println("===1.상품 수 |2.상품 및 가격입력|3.제품별가격|4.분석|5.종료====");
		
		
	}
}
