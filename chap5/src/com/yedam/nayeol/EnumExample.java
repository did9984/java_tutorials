package com.yedam.nayeol;

import java.util.Calendar;

public class EnumExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Week today =null;  // enum 안에 있는 배열을 today 안에 넣는다 script src = 같은 느낌
      
     //오늘의 요일 
      Calendar cal = Calendar.getInstance();
      //sun  =1 mon = 2 ~~~~ 
      int week = cal.get(Calendar.DAY_OF_WEEK);
      
      switch (week) {
	case 1:
		today =Week.SUNDAY;
		break;
	case 2:
		today =Week.MONDAY;
		break;
	case 3:
		today =Week.TUESDAY;
		break;
	case 4:
		today =Week.WEDNESDAY;
		break;
	case 5:
		today =Week.THURSDAY;
		break;
	case 6:
		today =Week.FRIDAY;
		break;
	case 7:
		today =Week.SATURDAY;
		break;

	}
     System.out.println("오늘 요일"+ today); 
	}

}
