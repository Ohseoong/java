import java.util.Scanner;

public class Toggle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i=0;
		//무한반복
		while(true) {
			System.out.print("스위치를 누르세요");
			String input = sc.nextLine();
			if(i%7==0) {
				System.out.println("월");
			}
			else if(i%6==0) {
				System.out.println("화");
			}
			else if(i%5==0) {
				System.out.println("수");
			}
			else if(i%4==0) {
				System.out.println("목");
			}
			else if(i%3==0) {
				System.out.println("금");
			}
			else if(i%2==0) {
				System.out.println("토");
			}
			else if(i%1==0) {
				System.out.println("일");
			}
			i = i + 1;
		}

	}

}
