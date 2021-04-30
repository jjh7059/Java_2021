package example;

public class ArrayExample {
	public static void main(String[] args) {
		//사람들의 나이들을 저장한 배열 선언
		int[] age = {27, 16, 22, 36, 57, 60, 43, 23, 14, 29, 44, 52, 69, 51, 39, 33, 11};
		
		//배열에 저장된 사람들의 평균 나이를 계산하여 출력
		//평균 나이 = 36살
		int sum = 0;
		for(int i = 0; i < age.length; i++) {
			sum += age[i];
		}
		System.out.println("평균 나이 = " + sum / age.length + "살");
		System.out.println("========================================");
		
		
		//배열에 저장된 사람들의 나이를 연령별로 구분하여 인원수를 계산하여 출력하세요.
		//ex) 10대 = 3명
		//    20대 = 4명
		//    ...
		//    60대 = 2명
		int[] age_cnt = new int[6];
		
		for(int i = 0; i < age.length; i++) {
			age_cnt[(age[i] / 10)-1]++;
		}
		
		for(int i = 0; i < age_cnt.length; i++) {
			System.out.println((i+1)*10 + "대 = " + age_cnt[i] + "명");
		}
	}
}
