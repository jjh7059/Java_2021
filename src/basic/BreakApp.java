package basic;

public class BreakApp {
	public static void main(String[] args) {
		//for 구문의 조건식이 거짓인 반복문 종료
		for(int i = 1; i <= 5; i++) {
			if(i == 3) break;
			System.out.print(i + "\t");
		}
		System.out.println();
		System.out.println("========================================");
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				//break 명령이 작성된 블럭의 반복문 종료
				if(j == 3) break;  //for(int j = 1; j <= 5; j++) 반복문 종료
				System.out.println("i = " + i + ", j = " + j);
			}
		}
		System.out.println("========================================");
		//반복문에는 반복문을 구분할 수 있는 라벨 지정 가능
		//라벨명은 식별자 :을 사용하여 선언
		loop:
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				//라벨명으로 지정된 반복문에 지정된 라벨명을
				//이용하여 원하는 반복문을 종료
				if(j==3) break loop; //for(int i=1; i<=5; i++) 반복문 종료
				System.out.println("i = " + i + ", j = " + j);
			}
		}
		System.out.println("========================================");
	}
}
