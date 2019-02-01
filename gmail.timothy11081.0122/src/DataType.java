
public class DataType {

	public static void main(String[] args) {
		//번호(정수)과 키(실수)와 몸무게(실수)를 저장
		int number = 1;//변수를 생성하면서 값 대입
		double weight, keight; //2개를 한번에 생성
		//double keight;
		
		//값을 저장
		//number = 8;
		weight = 59.5;
		keight = 170.4;
		
		//값을 출력
		System.out.println("번호는" + number + "번");
		System.out.println("키는" + keight + "cm");
		System.out.println("몸무게는" + weight + "kg");
		
		//문자는 char로 생성하고 코드값을 대입해도 되고
		//''안에 하나의 문자를 대입해도 됩니다.
		//0:48 A:65 a:95
		
		char ch = 'A';
		//char도 숫자이다
		System.out.println("ch는" + ch);
		ch = 65;
		System.out.println("ch는" + ch);
		ch= 'A' + 2;
		System.out.println("ch는" + ch);
		
		//boolean은 참(true) 거짓(false)을 저장하기 위한 자료형
		//20세 이상 여부를 저장
		//boolean 변수는 boolean이라는 표시하기 위해서
		//is로 시작하는 경우가 많습니다.
		boolean ist = true;
		System.out.println(ist);
		
		
	}

}
