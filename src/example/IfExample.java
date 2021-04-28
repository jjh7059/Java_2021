package example;

public class IfExample {
	public static void main(String[] args) {
		
		//변수에 저장된 문자값을 출력하세요.
		//단, 변수에 저장된 문자 값이 소문자인 경우 대문자로 변환하여 출력하세요.
		char mun = 'x';
		if(mun >= 'a' && mun <= 'z') {
			mun -= 32;
			System.out.println("mun = " + mun);
		} else {
			System.out.println("mun = " + mun);
		}
		System.out.println("==========================");
		
		
		
		//변수에 저장된 정수 값이 4의 배수인지를 구분하여 출력하세요.
		int num = 345644;
		if(num % 4 == 0) {
			System.out.println("4의 배수입니다.");
		} else {
			System.out.println("4의 배수가 아닙니다.");
		}
		
		
		System.out.println("==========================");
		
		
		//올해가 평년인지 윤년인지 구분하여 출력하세요.
		//연도를 4로 나누어 나머지가 0인 경우 윤년
		//위 조건을 만족하는 년도 중 100으로 나누어 나머지가 0인 경우 평년
		//위 조건을 만족하는 년도 중 400으로 나누어 나머지가 0인 경우 윤년
		int year = 2021;
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("윤년입니다.");
		} else {
			System.out.println("평년입니다.");
		}
		System.out.println("==========================");
		
		
		//이름이 [홍길동]인 학생이 국어 89점, 영어 93점, 수학 95점일때
		//총점, 평균을 계산하여 이름, 총점, 평균을 출력
		//국어,영어,수학 중 하나라도 0~100 범위가 아닌 경우 프로그램 강제 종료
		//System.exit(0); : 프로그램을 강제 종료하는 메소드
		//평균을 이용한 학점 계산 100~90: A, 89~80: B, 79~70: C, 69~60: D, 59~0: F
		//단, 평균은 소숫점 한자리까지만 출력
		
		String name = "홍길동", grade = "";
		int kor = 89, eng = 93, math = 95;
		int sum = kor + eng + math;
		double avg = (int)((sum / 3.0) * 10) / 10.0;
		
		if(kor < 0 || kor > 100 || eng < 0 || eng > 100 || math < 0 || math > 100) {
			
			System.exit(0);
			
		} else {
			System.out.println("이름: " + name);
			System.out.println("총점: " + sum);
			System.out.println("평균: " + avg);
			
			if(avg >= 90) {
				grade = "A";
				System.out.println("학점: " + grade);
			} else if(avg >= 80) {
				grade = "B";
				System.out.println("학점: " + grade);
			} else if(avg >= 70) {
				grade = "C";
				System.out.println("학점: " + grade);
			} else if(avg >= 60) {
				grade = "D";
				System.out.println("학점: " + grade);
			} else {
				grade = "F";
				System.out.println("학점: " + grade);
			}
		}

	}
}