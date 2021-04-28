package example;

public class OperatorExample {
	public static void main(String[] args) {
		//245678초를 일시분초 형식으로 변환하여 출력하세요. 하루 86400초
		int time = 245678;
		int day = time / 86400;
		int hour = (time - (day * 86400)) / 3600;
		int minute = (time - ((day * 86400) + (hour * 3600))) / 60;
		int second = time % 60;
		
		System.out.println(day + "일 " + hour + "시 " + minute + "분 " + second + "초");
		System.out.println("==========================");
		
		
		//한대의 가격이 1억 5천만원인 비행기를 20대 구매할 경우 지불해야될 금액을 계산하여 
		//출력하세요.
		//단, 15대 이상 구매할 경우 1대당 25%의 할인율을 적용하여 계산
		//삼항연산자 이용
		long pay = 150000000;
		int plane = 20;

		pay = plane > 15 ? (pay * plane) - (int)((pay * plane) * 0.25) : (pay * plane);
		System.out.println("비행기 " + plane + "대의 가격은 " + pay + "원 입니다.");
		

		
		pay = plane >= 15 ? (pay * plane) - (pay * plane) / 4 : pay * plane; 
		
		System.out.println("비행기 " + plane + "대의 가격은 " + pay + "원 입니다.");

		System.out.println("==========================");
	}
}
