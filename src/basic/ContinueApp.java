package basic;

public class ContinueApp {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++) {
			//continue : �ݺ����� ����� ó������ �ٽ� �����ϴ� ���
			//continue ����� ����Ǹ� continue ��� �ϴܿ� �ۼ��� ��� �̽���
			if(i == 3) continue;
			System.out.println(i + "\t");
		}
		System.out.println();
		System.out.println("========================================");
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				//continue ����� �ۼ��� ���� �ݺ����� ó������ �ٽ� ����
				if(j == 3) continue; //for(int j = 1; j <= 5; j++) �ݺ��� �����
				System.out.println("i = " + i + ", j = " + j);
			}
		}
		System.out.println("========================================");
		
		// �󺧸����� ��ġ�� ����. break���� ���� �Ǳ⶧���� ���� ����
		loop:
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				if(j == 3) continue loop;  //break loop; �� ������
				System.out.println("i = " + i + ", j = " + j);
			}
		}
		System.out.println("========================================");
	}
}
