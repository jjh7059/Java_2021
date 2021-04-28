package example;

public class ForExample {
	public static void main(String[] args) {
		//본인 이름을 화면에 7번 출력하세요.
		//ex) 진주현 진주현  ....
		for(int i = 1; i <= 7; i++) {
			System.out.print("진주현 ");
		}
		System.out.println();
		System.out.println("========================================");
		
		
		//1~10 범위의 정수 중 홀수를 화면에 출력하세요.
		//ex) 1  3  5  7  9
		for(int i = 1; i <= 9; i++) {
			if(i % 2 == 1) {
				System.out.print(i + " ");
			} else {
				continue;
			}
		}
		System.out.println();
		System.out.println("========================================");
		
		
		//1~100 범위의 정수에서 3의 배수들의 합계와 5의 배수들의 합계를 계산하여
		//3의 배수의 합계에서 5의 배수의 합계를 뺀 결과를 출력하세요.
		//ex) 결과 = 633
		int sum3 = 0, sum5 = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				sum3 += i;
			}
			if(i % 5 == 0) {
				sum5 += i;
			}
		}
		System.out.println(sum3 - sum5);
		System.out.println("========================================");
		
		
		//구구단 중 7단을 화면에 출력하세요.
		//ex) 7 * 1 = 7
		//    7 * 2 = 14
		//      ...
		//    7 * 9 = 63
		for(int i = 1; i <= 9; i++) {
			System.out.println(7 + " * " + i + " = " + 7 * i);
		}
		System.out.println("========================================");
		
		
		//5!의 결과값을 계산하여 결과값을 출력하세요.(5! = 5 * 4 * 3 * 2 * 1)
		//ex)5! = 120
		int fac = 1;
		for(int i = 5; i >= 1; i--) {
			fac *= i;
		}
		System.out.println("5! = " + fac);
		System.out.println("========================================");
		
		
		//두 변수에 저장된 정수값 사이의 정수들을 화면에 출력하세요.
		//단, 한 줄에 정수값이 7개씩 출력되도록 작성하세요.
		//ex) 36 27 38 39 40 41 42
		int begin = 36, end = 57;
		for(int i = begin-1; i <= end; i++) {
			for(int j = 1; j <= 7; j++) {
				System.out.print(i+j + " ");				
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("========================================");
	}
}
