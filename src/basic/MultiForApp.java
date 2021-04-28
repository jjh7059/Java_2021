package basic;

public class MultiForApp {
	public static void main(String[] args) {
		
		int cnt = 0;  //이동방법의 갯수를 저장하기 위한 변수
		for(int i = 1; i <= 3; i++) {  //A나라 에서 섬 : 반복
			for(int j = 1; j <= 4; j++) {  //섬에서 B나라 : 반복
				cnt++;
			}
		}
		System.out.println("이동방법의 갯수 = " + cnt);
		System.out.println("========================================");
		
		//★★★★★★★
		//★★★★★★★
		//★★★★★★★
		//★★★★★★★
		//★★★★★★★
		//★★★★★★★
		for(int j = 1; j <= 5; j++) {  //행(Row)을 반복 처리하기 위한 명령
			for(int i = 1; i <= 7; i++) {  //열(Column)을 반복 처리하기 위한 명령
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("========================================");
		
		//구구단
		for(int i = 1; i <= 9; i++) {  //행(Row)을 반복 처리하기 위한 명령
			for(int j = 2; j <= 9; j++) {  //열(Column)을 반복 처리하기 위한 명령
				System.out.print(j + "*" + i + "=" + (i*j) + "\t");
			}
			System.out.println();
		}
		System.out.println("========================================");
		
		//★			i=1 별=1
		//★★			i=2 별=2
		//★★★		i=3 별=3
		//★★★★		i=4 별=4
		//★★★★★	i=5 별=5
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("========================================");
		
		//☆☆☆☆★	i=5 흰별=4 검은별=1
		//☆☆☆★★	i=4 흰별=3 검은별=2
		//☆☆★★★	i=3 흰별=2 검은별=3
		//☆★★★★	i=2 흰별=1 검은별=4
		//★★★★★	i=1 흰별=0 검은별=5
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5-i; j++) {
				System.out.print("☆");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("========================================");
		
		//☆☆☆☆★	i=1 
		//☆☆☆★★	i=2 
		//☆☆★★★	i=3 
		//☆★★★★	i=4 
		//★★★★★	i=5 
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				if(i+j < 6) {
					System.out.print("☆");	
				} else {
					System.out.print("★");	
				}
			}
			
			System.out.println();
		}
		System.out.println("========================================");
	}
}
