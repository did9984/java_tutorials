
package homework01;

public class Homework1 {
	

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
				System.out.printf("%d %s\n", var1,"int");
				String var2 = "B";
				System.out.printf("%s %s\n", var2,"string");
				int var3 = 44032;
				System.out.printf("%d %s\n", var3,"string");
				long var4 = 100000000000L;
				System.out.printf("%d %s\n",var4,"long");
				Double var5 = 43.93106;
				System.out.printf("%f %s\n",var5,"double");
			    Double var6 = 301.3;
			    System.out.printf("%f %s\n",var6,"double");
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
				System.out.println(str+(intValue1+intValue2)+intValue3+strValue+(double)intValue4);
				// 추가문제 
				int value = 485;
				int answer = 0;
				while(value>0) {
					answer += value%10;
							value/=10;
				}
				System.out.println(answer);
			}

			
		
	}

