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
    String[] productN = null;
    
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
		  productN =new String[size.length];
		for (int i = 0; i < size.length; i++) {
			System.out.println("상품>");
		    productN[i] = sc.next();
			System.out.println("가격");
			size[i]= sc.nextInt();
		}	
		
	}else if(input ==3) {
		for (int i = 0; i < size.length; i++) {
			System.out.println("제품명: " + productN[i]+ "제품가격:" +size[i]);
		}
	}else if(input ==4) {
		int max = 0;
		int result = 0;
		for (int i = 0; i < size.length; i++) {
			if (max < size[i]) {
				max = size[i]; 
			}result += size[i];
			
		}System.out.println("최대값: "+ max);
		System.out.println("총합: " +(result -max));
		
	}else if(input ==5) {
		a=false;
		System.out.println("종료");
	}
		
    }
	}

}
