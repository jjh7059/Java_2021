package basic;

public class VariableApp {
	public static void main(String[] args) {
		
		int su;
		su = 100;
		
		System.out.print("초기값 = ");
		System.out.println(su);
		
		su = 200;
		
		System.out.print("초기값 = ");
		System.out.println(su);

		System.out.println("================================================");
		
		int num = 100;
		System.out.println("num = " + num);
		System.out.println("================================================");
		System.out.println("올해는" + 2 + 0 + 2 + 1 + "년입니다.");
		System.out.println(2 + 0 + 2 + 1+"년은 소띠해입니다.");
		System.out.println(""+2 + 0 + 2 + 1+"년은 소띠해입니다.");
		System.out.println("================================================");
		
		int num1 = 100, num2 = 200;
		System.out.println("연산결과 = " + num1 + num2);
		System.out.println("연산결과 = " + (num1 + num2));
		System.out.println("연산결과 = " + (num1 * num2));
		System.out.println("연산결과 = " + num1 * num2);
		System.out.println("================================================");
		
		int kor = 88, eng = 90;
		int tot = kor + eng;
		System.out.println("접수 합계 = " + tot);
		System.out.println("================================================");
		
		int number = 10;
		System.out.println("number = " + number);
	}
}
