import java.util.Scanner;

public class Toggle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i=0;
		//���ѹݺ�
		while(true) {
			System.out.print("����ġ�� ��������");
			String input = sc.nextLine();
			if(i%7==0) {
				System.out.println("��");
			}
			else if(i%6==0) {
				System.out.println("ȭ");
			}
			else if(i%5==0) {
				System.out.println("��");
			}
			else if(i%4==0) {
				System.out.println("��");
			}
			else if(i%3==0) {
				System.out.println("��");
			}
			else if(i%2==0) {
				System.out.println("��");
			}
			else if(i%1==0) {
				System.out.println("��");
			}
			i = i + 1;
		}

	}

}
