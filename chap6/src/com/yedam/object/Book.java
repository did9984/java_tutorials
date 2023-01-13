package com.yedam.object;

public class Book {
	
	String kinds = "학습서";
	int price = 12345;
	String publisher = "한빛미디어";
	String bookNumer = "yedam-001";
	String isbn; 
	public Book(String n,String y,String z,String m) {
		n = kinds;
		
		z = publisher;
		m =bookNumer;
	}
	String kinds2 = "학습서";
	String price2 = "24000원";
	String publisher2 = "한빛미디어";
	String bookNumer2 = "yedam-001";
	Book(String isbn,int price){
		this.price = price;
		this.isbn = isbn;
		}
	
	//매개 변수 갯수
	Book(int price){
		this.price = price;
	}
}
	
	

