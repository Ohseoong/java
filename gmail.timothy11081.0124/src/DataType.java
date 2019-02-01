import java.util.Scanner;

public class DataType {

	public static void main(String[] args) {
		//키보드로부터 입력받는 객체 생성
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요:");
		int score = sc.nextInt();
		*/
		//score가 60점 이상이면 합격이라고 출력
		/*
		if (score >= 60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		*/
		
		//score가 100이상이면 미션성공
		//그렇지 않으면 미션실패라고 출력
		/*
		if(score >= 100) {
			System.out.println("미션성공");
		}else {
			System.out.println("미션실패");
		}
		*/
		
		
		//score가 90~100이면 A
		//score가 80~89이면 B
		//score가 70~79이면 C
		//score가 0~59이면 F
		/*
		if(score >= 90 && score <= 100) {
			System.out.println("A");
		}else if(score >= 80 && score < 90) {
			System.out.println("B");
		}else if(score >= 70 && score < 80) {
			System.out.println("C");
		}else if(score >= 0 && score < 70) {
			System.out.println("F");
		}else {
			System.out.println("점수는 0-100사이로 입력하세요!!!");
		}
		sc.close();
		*/
		
		//키보드로 받기 위한 객체 생성
		Scanner sc = new Scanner(System.in);
		//하나의 문자열 입력받기
		/*
		System.out.print("1.중국집 2.분식집 3.한식집 4. 일식집: ");
		String menu = sc.nextLine();
		//switch 이용
		switch(menu) {
		case "1":
			System.out.println("중국집에 전화걸기");
			break;
		case "2":
			System.out.println("분식집에 전화걸기");
			break;
		case "3":
			System.out.println("한식집에 전화걸기");
			break;
		case "4":
			System.out.println("일식집에 전화걸기");
			break;
		default:
			System.out.println("메뉴를 잘못선택했습니다.");
			break;
			
		}
		*/
		
		
		//동일한 작업이나 일정한 패턴을 가진 작업은
		//반복문을 이용해서 작성이 가능합니다.
		
		//Hell Java를 3번 출력 - While을 이용해서 작업
		
		
		//1부터 5까지를 순서대로 출력
		
		
		//for룰 이용해서 Hello Java를 5번 출력
		
		//제어문 안에서 만든 변수는 제어문 안에서만 사용이 가능
		//수행할 내용이 한 줄이면 {}를 생략해도 됩니다.
		for(int i=0; i<5; i++) 
			System.out.println("Hello Java");
		
		for(int i=1; i<10; i++) {
			if(i%4==0) {
				break;
			}
			System.out.println("i = "+ i);
		}
		for(int i=1; i<10; i++) {
			//i가 4의 배수이면 i=i+1 자리로 이동
			//continue는 아래에 있는 문장을 수행하지 않습니다.
			if(i%4==0) {
				continue;
			}
			System.out.println("i = "+ i);
		}
	}

}
