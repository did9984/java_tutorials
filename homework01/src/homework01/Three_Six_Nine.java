package homework01;

public class Three_Six_Nine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for (int i = 1; i <= 50; i++) {
		      if (i % 3 == 0 && i % 10 == 3 && i % 10 == 6 && i % 10 == 9) {
		        System.out.println("짝");
		      } else if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
		        System.out.println("짝짝");
		      } else {
		        System.out.println(i);
		      }
		    }
	}

}
