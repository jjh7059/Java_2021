package example;

import java.util.Scanner;

//키보드로 정수값을 입력받아 1~9 범위의 정수값을 곱한 결과를 출력하는 프로그램을 작성하세요
//단, 입력된 정수값은 2~9 범위의 정수값만 허용되며 범위 밖의 정수값을 입력한 경우
//메시지 출력후 재입력
//ex) 단 입력[2~9] >> 7
//    7 * 1 = 7
//       ...
//    7 * 9 = 63
public class GuGuDanExample {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.print("입력[2~9] >> ");
			int num = in.nextInt();
			
			if(num < 2 || num > 9) {
				System.out.println("2~9 범위를 입력해주세요.");
			} else {
				for(int i = 1; i <= 9; i++) {
					System.out.println(num + " * " + i + " = " + num * i);
				}
				break;
			}
		}
		in.close();
	}
}
