package example;

import java.util.Scanner;

//컴퓨터로부터 제공받은 정수 난수값을 키보드로 입력하여 맞추는 프로그램을 작성하세요.
//1~100 범위의 정수 난수값을 제공받도록 작성
//난수값을 맞출 수 있는 기회는 10번만 제공되도록 작성
//키보드 입력값이 1~100 범위가 아닌 경우 메시지 출력 후 재입력
//난수값과 입력값이 같은 경우 입력 횟수 출력 후 프로그램 종료
//난수값과 입력값이 다른 경우 "큰값 입력" 또는 "작은값 입력" 형식의 메시지 출력
//난수값을 10번 안에 맞추지 못한 경우 난수값 출력되도록 작성
public class UpAndDownExample {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int user = 0;
		int com = (int)(Math.random() * 100) % 100 + 1;  
		int count = 0, count_limit = 10;
		
		while(true) {
			while(true) {
				System.out.print("[입력] >> ");
				user = in.nextInt();
				
				if(user < 1 || user > 100) {
					System.out.println("[에러]1~100 범위 내의 정수값을 입력해주세요.");
				} else {
					break;
				}
			}
			
			count++;
			
			if(count == count_limit) {
				System.out.println("[종료]기회 " + count_limit + "회가 소진되었습니다.");
				System.out.println("정답 >> " + com);
				break;
			}
			
			if(com > user) {
				System.out.println("큰값 입력");
			} else if(com < user) {
				System.out.println("작은값 입력");
			} else {
				System.out.println("[종료]정답입니다.");
				break;
			}
		}
		in.close();	
	}
}
