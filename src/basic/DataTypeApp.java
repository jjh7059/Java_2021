package basic;

public class DataTypeApp {
	public static void main(String[] args) {
		
		System.out.println("<<정수형>>");
		System.out.println("정수값(10진수) = " + 100);
		System.out.println("정수값(8진수) = " + 0100);
		System.out.println("정수값(16진수) = " + 0x100);
		
		System.out.println("정수값(4Byte) = " + 2147483647);  //int type
//		System.out.println("정수값(4Byte) = " + 2147483648);  4byte 초과
		System.out.println("정수값(4Byte) = " + 2147483648L);  //long type
		
		byte a1 = 127;  //1Byte : -128 ~ 127
		short a2 = 32767;  //2Byte : -32768 ~ 32767
		int a3 = 2147483647;  //4Byte : -2147483648 ~ 2147483647 
		long a4 = 2147483648L;
		
		System.out.println("a1 = " + a1);
		System.out.println("a2 = " + a2);
		System.out.println("a3 = " + a3);
		System.out.println("a4 = " + a4);
		
		int a5 = 100;
		
		System.out.println("a5 = " + a5);
		System.out.println("================================================");
		System.out.println("<<실수형>>");
		System.out.println("실수값(4byte) = " + 1.23F);
		System.out.println("실수값(8byte) = " + 1.23);
		System.out.println("실수값(8byte) = " + 0.00000000123);  //아주 작거나 큰 실수 값을 지수형으로 출력
		System.out.println("실수값(8byte) = " + 1.23E9);
		
		float b1 = 1.23456789F;  //가수부의 표현범위 : 소숫점 이하 7자리
		double b2 = 1.23456789;  //가수부의 표현범위 : 소숫점 이하 15자리
		
		System.out.println("b1 = " + b1);  //1.2345679 오류
		System.out.println("b2 = " + b2);
		
		float b3 = 2147483648L;
		System.out.println("b3 = " + b3);
		System.out.println("================================================");
		System.out.println("<<문자형>>");
		System.out.println("문자값(2Byte) = " + 'A');
		System.out.println("문자값(2Byte) = " + '한');
		System.out.println("문자값(2Byte) = " + '\'');
		System.out.println("문자값(2Byte) = " + '\\');  //Escape character
		
		//Alt+키패드 숫자
		//'A': 65, 'a': 97, '0': 48, ' ': 32, '\n': 13, '가': 44032
		char c1 = 'A';
		char c2 = 65;
		char c3 = 'a' - 32;  //대문자 소문자 변환하려면 32 더하고 빼면 됨
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);
		
		char c4 = 45000;  //완성형
		System.out.println("c4 = " + c4);
		System.out.println("================================================");
		System.out.println("<<논리형>>");
		System.out.println("논리값(1Byte) = " + false);
		System.out.println("논리값(1Byte) = " + true);
		System.out.println("논리값(1Byte) = " + (20>10));
		System.out.println("논리값(1Byte) = " + (20<10));
		
		boolean d1 = false;
		boolean d2 = 20 > 10;
		
		System.out.println("d1 = " + d1);
		System.out.println("d2 = " + d2);
		System.out.println("================================================");
		System.out.println("<<문자열>>");
		System.out.println("문자열 = " + "홍길동");
		System.out.println("유관순 열사가 \"대한독립 만세\"라고 외쳤습니다.");
		
		String e1 = "Java";
		String e2 = "열심히 공부하세요";
		System.out.println("e1 = " + e1);
		System.out.println("e2 = " + e1);
		System.out.println("e1 = " + e2);
		System.out.println("================================================");
		
		
	}
}
