package com.yedam.variable;


public class Variable04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);

		 System.out.println("번호\t이름\t직업");
		 System.out.print("행 단위 출력 \n");
		 System.out.println("우리는\"개발자\"입니다");
		 System.out.println("봄\\여름\\가을\\겨울");
		 
		 float var1 = 3.14f; //float 는 뒤에 f 필수 
		 double var2 = 3.14;
		 
		 float var3 = 0.1234567890f;
		 double var4 =0.1234567890;
		 System.out.println("var3:"+var3);
		 System.out.println("var4:"+var4);
		 
		 double var6 =3e6;
		 float var7 = 3e6F;
		 
		 System.out.println("var6:"+var6);
		 System.out.println("var7:"+var7);
		 
		 boolean stop = true;
		 if(stop) {
			 System.out.println("중지합니다.");
		 }else {
			System.out.println("시작합니다");
		}
	}

}
