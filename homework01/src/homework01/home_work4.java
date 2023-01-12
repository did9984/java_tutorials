package homework01;

import java.util.Scanner;

import com.sun.org.apache.xpath.internal.operations.String;





public class home_work4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
    
    int product;
    boolean a = true;
    int[] size=null;
    
    
    while (a) {
    	System.out.println("-------------------------------------------------------------");
        System.out.println("\"1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료\"");
        System.out.println("---------------------- -------------------------------------");
        int input = sc.nextInt();
    if (input ==1) {
		System.out.println("상품수>");
        product = sc.nextInt();
		size =new int[product];
		System.out.println(size.length);
	}
	else if (input ==2) {
		  String[] productN =new String[size.length];
		  int price[] = new int[size.length];
		for (int i = 0; i < size.length; i++) {
			System.out.println("상품>");
		    productN[i] = sc.next();
			System.out.println("가격");
			price[i] = sc.nextInt();
		}	
		
	}else if(input ==3) {
		for (int i = 0; i < price.length; i++) {
			
		}
	}
    }
	}

}
