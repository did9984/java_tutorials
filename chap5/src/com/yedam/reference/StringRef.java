package com.yedam.reference;

public class StringRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVal1 = "yedam";
		String strVal2 = "yedam";
		// 문자열 주소값으로 비교
		if (strVal1 == strVal2) {
			System.out.println("strVal1과 strVal2는 메모리주소가같다");
		} else {
			System.out.println("strVal1과 strVal2는 메모리주소가다르다");
		}

		// 문자열(String) 데이터로 비교
		if (strVal1.equals(strVal2)) {
			System.out.println("strVal1과 strVal2는 데이터 동일");
		} else {
			System.out.println("strVal1과 strVal2는 데이터 다름");
		}

		String strVal3 = new String("yedam");
		String strVal4 = new String("yedam");

		if (strVal3 == strVal4) {
			System.out.println("strVal3과 strVal4는 같은 메모리 주소");
		} else {
			System.out.println("strVal3과 strVal4는 다른 메모리 주소");

			if (strVal3.equals(strVal4)) {
				System.out.println("strVal3과 strVal4는 데이터 같다");

			} else {
				System.out.println("strVal3과 strVal4는 데이터가 다르다");
			}
			System.out.println(strVal1==strVal3);
			System.out.println(strVal1.equals(strVal3));
		}
	}

}
