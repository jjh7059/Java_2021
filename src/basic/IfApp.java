package basic;

public class IfApp {
	public static void main(String[] args) {
		
		int su = 50;
		
		//변수 값이 50이상인 경우 변수 값 출력
		if(su >= 50) {
			System.out.println("su = " + su);			
		}
		System.out.println("==========================");
		
		
		int score = 90;
		
		//점수가 60점 이상인 경우 합격 메시지를 출력, 60점 미만인 경우 불합격 메시지 출력
		if(score >= 60) {
			System.out.println("[결과]점수가 60점 이상이므로 합격입니다.");
		} else {
			System.out.println("[결과]점수가 60점 미만이므로 불합격입니다.");
		}
		System.out.println("==========================");
		
		
		int num = 10;
		
		//변수 값을 홀수와 짝수로 구분하여 출력
		if(num % 2 != 0) {
			System.out.println(num + " >> 홀수");
		} else {
			System.out.println(num + " >> 짝수");
		}
		System.out.println("==========================");
		
		
		char mun = 'a';
		//변수 값을 영문자 또는 비영문자로 구분하여 출력
		if(mun >= 'A' && mun <= 'Z' || mun >= 'a' && mun <= 'z') {
			System.out.println("[결과]" + mun + " >> 영문자");
		} else {
			System.out.println("[결과]" + mun + " >> 비영문자");
		}
		System.out.println("==========================");
		
		
		int jumsu = 88;
		//변수 값이  0~100 범위의 유효 값인지 아닌지를 구분하여 출력 - 유효성 검사
		//변수 값에 따른 등급을 구분하여 출력
		//100~90: A, 89~80: B, 79~70: C, 69~60: D, 59:~0: F
		/*
		if(jumsu >= 0 && jumsu <= 100) {  //case 1
			char grade = '\0';
			if(jumsu <= 100 && jumsu >= 90) {
				grade = 'A';
			} else if(jumsu <= 89 && jumsu >= 80) {
				grade = 'B';
			} else if(jumsu <= 79 && jumsu >= 70) {
				grade = 'C';
			} else if(jumsu <= 69 && jumsu >= 60) {
				grade = 'D';
			} else if(jumsu <= 59 && jumsu >= 50) {
				grade = 'F';
			}
			System.out.println("[결과]" + jumsu + "점 >> " + grade + "학점");
		} else {
			System.out.println("[에러]0~100 범위를 벗어난 비정상적인 값이 입력 되었습니다.");
		}
		System.out.println("==========================");
		*/
		if(jumsu >= 0 && jumsu <= 100) {  //case 2 (조건식 단축)
			char grade;
			if(jumsu >= 90) {
				grade = 'A';
			} else if(jumsu >= 80) {
				grade = 'B';
			} else if(jumsu >= 70) {
				grade = 'C';
			} else if(jumsu >= 60) {
				grade = 'D';
			} else {
				grade = 'F';
			}
			System.out.println("[결과]" + jumsu + "점 >> " + grade + "학점");
		} else {
			System.out.println("[에러]0~100 범위를 벗어난 비정상적인 값이 입력 되었습니다.");
		}
		System.out.println("==========================");
	}
}
