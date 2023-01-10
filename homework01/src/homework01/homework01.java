package homework01;

public class homework01 {
	public static void main(String[] args) {
		// 문제1
		int a = 37;
		int b = 91;
		System.out.println(a);
		System.out.println(b);
		// 문제2
		System.out.println(a + b);
		System.out.println(b - a);
		System.out.println(a * b);
		System.out.println(b / a);
		// 문제3
		int var1 = 128;
		System.out.printf("%d\n", var1);
		String var2 = "B";
		System.out.printf("%s\n", var2);
		int var3 = 44032;
		System.out.printf("%d\n", var3);
		long var4 = 100000000000L;
		System.out.printf("%d\n",var4);
		Double var5 = 43.93106;
		System.out.printf("%f\n",var5);
	    Double var6 = 301.3;
	    System.out.printf("%f\n",var6);
	    //문제4 
	    byte f = 35;
		byte g = 25;
		int c = 463;
		long d = 1000L;
		double e = 45.31;
		int result = (int)f + (int)c + (int)d;
		System.out.printf("%d", result);
		int result2 = (int)f + (int)g + (int)c;
		System.out.printf("%d", result2);
		double result3= (int)c + (int)d + (double)e;
		System.out.printf("%f", result3);
		//문제5 
		int intValue1 = 24;
		int intValue2 = 3;
		int intValue3 = 8;
		int intValue4 = 10;
		char charValue = 'A';
		String strValue = "번지";
		String str = String.valueOf(charValue);
		System.out.println(str);
		System.out.println(str+(intValue1*intValue3+intValue3)+strValue+(double)intValue4);
		
	}
}
