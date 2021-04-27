package example;

public class VariableExample {
	public static void main(String[] args) {
		
		//가로의 길이 7, 세로 길이 10인 사각형의 넓이 출력
		int garo = 7, sero = 10;
		int nulbe = garo * sero;
		System.out.println("사각형의 넓이 = " + nulbe);
		System.out.println("==========================");
		
		//높이의 길이 9, 밑변의 길이 7인 삼각형의 넓이 출력
		int x = 9, y = 7;
		double area = x * y / 2.0;
		System.out.println("삼각형의 넓이 = " + area);
		System.out.println("==========================");
		
		//10명 전체 몸무게가 759kg인 경우 평균 몸무게를 계산하여 출력
		int weight = 759;
		double avg = weight / 10.0;
		System.out.println("평균 몸무게 = " + avg + "kg");
		System.out.println("==========================");
		
		//이름이 [홍길동]인 학생이 국어 89점, 영어 93점, 수학 95점일때
		//총점, 평균을 계산하여 이름, 총점, 평균을 출력
		//단, 평균은 소숫점 한자리까지만 출력
		String name = "홍길동";
		int kor = 89, eng = 93, math = 95;
		int sum = kor + eng + math;
		double avg1 = (int)((sum / 3.0) * 10) / 10.0;
		System.out.println("이름: " + name);
		System.out.println("총점: " + sum + "점");
		System.out.println("평균: " + avg1 + "점");
		
	}
}