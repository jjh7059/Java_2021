package basic;

public class SwitchApp {
	public static void main(String[] args) {
		
		int choice = 2;
		
		switch(choice) {
		case 1:
			System.out.println("수성으로 이동합니다.");
		case 2:
			System.out.println("금성으로 이동합니다.");
		case 3:
			System.out.println("화성으로 이동합니다.");
		}
		System.out.println("==========================");
		
		choice = 4;
		
		switch(choice) {  //해당되는 값이 없으면 실행X
		case 1:           //default: 모든 케이스 값이 맞지 않을 경우 무조건 실행
			System.out.println("수성으로 이동합니다.");
		case 2:
			System.out.println("금성으로 이동합니다.");
		case 3:
			System.out.println("화성으로 이동합니다.");
		default:
			System.out.println("지구으로 이동합니다.");
		}
		System.out.println("==========================");
		
		choice = 1;
		
		switch(choice) {
		case 1:
			System.out.println("수성으로 이동합니다.");
			break;  //switch 구문 강제 종료
		case 2:
			System.out.println("금성으로 이동합니다.");
			break;
		case 3:
			System.out.println("화성으로 이동합니다.");
			break;
		default:
			System.out.println("지구으로 이동합니다.");
		}
		System.out.println("==========================");
		
		int jumsu = 88;
		//변수 값이  0~100 범위의 유효 값인지 아닌지를 구분하여 출력 - 유효성 검사
		//변수 값에 따른 등급을 구분하여 출력
		//100~90: A, 89~80: B, 79~70: C, 69~60: D, 59:~0: F
		String grade = "";
		if(jumsu >=0 && jumsu <= 100) {
			switch(jumsu / 10) {  //10.0이라면 에러 (switch에서 실수 값은 사용 불가)
			case 10:
			case 9: grade = "A"; break;
			case 8: grade = "B"; break;
			case 7: grade = "C"; break;
			case 6: grade = "D"; break;
			default: grade = "F";
			}
			System.out.println("[결과]" + jumsu + "점 >> " + grade + "학점");
		} else {
			System.out.println("[에러]0~100 범위를 벗어난 비정상적인 값이 입력 되었습니다.");
		}
		System.out.println("==========================");
		
		//JDK1.7 이상에서는 switch 구문으로 문자열을 비교하여 명령 선택 실행 가능
		String kor = "둘";
		String eng = "";  //초기값 없으면 에러!!
		
		switch(kor) {
		case "하나": eng = "One"; break;
		case "둘": eng = "Two"; break;
		case "셋": eng = "Three"; break;
		}
				
		System.out.println("[결과]" + kor + " = " + eng);
		System.out.println("==========================");
	}
}
