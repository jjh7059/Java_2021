package basic;

//형변환(Type Cast): 값의 자료형을 일시적으로 변환하여 사용하는 방법
//자동 형변환(JVM) - 자료형이 다른 값 연산 위해 사용
//강제 형변환(프로그래머)

public class TypeCastApp {
	public static void main(String[] args) {
		
		System.out.println("결과 = " + (3 + 1.5));  //자동 형변환
		
		System.out.println("결과 = " + (95 / 10));
		System.out.println("결과 = " + ((double)95 / 10));  //강제 형변환
		
		int kor = 95, eng = 90;
		int tot = kor + eng;
		double avg = tot / 2.0;  //tot / 2 (X)
		
		System.out.println("총점 = " + tot + ", 평균 = " + avg);
		
		byte su1 = 10, su2 = 20;
		//int 자료형보다 작은 자료형의 값을 연산할 경우 자동으로 int 자료형으로 형변환 됨
		int su3 = su1 + su2;
		System.out.println("su3 = " + su3);
		System.out.println("================================================");
		
		int num = (int)12.3;
		System.out.println("num = " + num);  //12
		
		int num1 = 95, num2 = 10;
		double num3 = num1 / (double)num2;  //강제형변환 + 자동형변환
		System.out.println("num3 = " + num3);  //9.5
		
		int num4 = 100_000_000, num5 = 30;  //언더바로 자릿수 구분
		long num6 = (long)num4 * num5;
		System.out.println("num6 = " + num6);
		
		double number = 1.23456789;
		System.out.println("number = " + number);
		System.out.println("number(버림) = " + (int)(number * 100) / 100.0);
		System.out.println("number(반올림) = " + (int)(number * 100 + 0.5) / 100.0);
		System.out.println("number(올림) = " + (int)(number * 100 + 0.9) / 100.0);
	}
}