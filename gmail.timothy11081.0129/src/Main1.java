import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// Person 클래스의 인스턴스 생성
		Person person1 = new Person();
		//setter를 호툴해서 데이터 저장
		person1.setName("오세웅");
		person1.setAge(17);
		person1.setHeight(171.3);
		//getter를 이용해서 데이터를출력
		System.out.println("이름:" + person1.getName());
		
		//문자열을 매개변수로 받는 생성자를 이용해서 인스턴스를 생성
		Person person2 = new Person("noname");
		System.out.println("이름:" + person2.getName());
		
		Scanner sc = new Scanner(System.in);
	}
}
