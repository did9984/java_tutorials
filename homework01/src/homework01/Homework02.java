package homework01;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문제 1 
        int x = 5;
        int y = 7;

        if (x > 0 && y > 0) {
            System.out.println("(x, y) is in the 1st quadrant.");
        } else if (x < 0 && y > 0) {
            System.out.println("(x, y) is in the 2nd quadrant.");
        } else if (x < 0 && y < 0) {
            System.out.println("(x, y) is in the 3rd quadrant.");
        } else if (x > 0 && y < 0) {
            System.out.println("(x, y) is in the 4th quadrant.");
        } else {
            System.out.println("(x, y) is on the x or y axis.");
        }
     // 문제2) 연도가 주어졌을 때 해당 년도가 윤년인지를 확인해서 출력하도록 하세요.
     		// 윤년은 연도가 4의 배수이면서 100의 배수가 아닐 때 또는 400의 배수일때입니다.
     		// 예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이며,
     		// 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아닙니다.
     		// HiNT : 이중 IF문 사용
     		// 문제출처, 백준(https://www.acmicpc.net/) 2753번 문제
        int answer = 2404;
        if (answer%4==0 && answer%100!=0 ||answer%400==0) {
			System.out.println(answer+"=운년입니다");
		}
     // 문제3) switch문을 이용하여 가위, 바위, 보 중 하나가 주어졌을 때 사용자 어떤 값을 가져야 이길 수 있는 지를 출력하도록
     		// 구현하세요.
     		// 예를 들어, 가위가 주어졌을 때 "이기기 위해선 바위를 내야합니다." 라고 출력하도록 하세요.
     		// 한 단어를 입력받을 경우 Scanner객체의 next() 함수를 사용하면 됩니다.
        Scanner rockScanner = new Scanner(System.in);
        System.out.println("rock paper scissors");
       String rockAndSciccer= rockScanner.nextLine();
        switch (rockAndSciccer) {
		case "rock":
			System.out.println("이기기위해선 보자기를 내야합니다");
			break;
		case "Scissors":
			System.out.println("이기기위해선 주먹를 내야합니다");
			break;
		case "paper":
			System.out.println("이기기위해선 가위를 내야합니다");
			break;
		default:
			System.out.println("\"Rock\" \"paper\" \"scissors\"  안에서 입력해 주세요");
			break;
		}
     // 문제4) for문과 "*"를 이용하여 아래와 같이 출력하도록 하세요.
     		// hint) 중첩 for문과 if문(띄어쓰기용도) 활용
     		//     *
     		//    **
     		//   ***
     		//  ****
     		// *****
        for (int i = 5; i > 0; i--) {
			for (int j = 0; j < 5; j++) {
				if (i>j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}System.out.println();
		}
		// 문제5) 차례대로 m과 n을 입력받아 m단을 n번째까지 출력하도록 하세요.
		// 예를 들어 2와 3을 입력받았을 경우 아래처럼 출력합니다.
		// 2 X 1 = 2
		// 2 X 2 = 4
		// 2 X 3 = 6
        int m = 2;
        int n = 3;
        for (int i = 2; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
			
		}
        for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}System.out.println();
	}
    }
}
