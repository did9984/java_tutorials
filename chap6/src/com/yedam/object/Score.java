package com.yedam.object;

public class Score {
   // 필드
	int kor;
	int math;
	int eng;
	//생성자
	Score(int kor, int math,int eng){
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
	//메소드
	int getSum() {
		return kor+math+eng;
	}
	
	double getAvg() {
		int sum =getSum();
		return sum/3.0;
	}
	
	void getinfo() {
		int sum = getSum();
		double avg = getAvg();
		
		System.out.println("score:"+sum);
		System.out.println("average:"+avg);
	}
}
