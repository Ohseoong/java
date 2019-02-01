//main 메소드를 가지고 있는 클래스가 실행 클래스입니다.
public class Main {

	public static void main(String[] args) {
		//Data 클래스의 인스턴스 만들기
		Data data = new Data();
		data.name = "오세웅";
		data.age = 17;
		data.height = 171.3;
		
		//인스턴스 변수는 클래스 이름으로 접근이 불가
		//Data.name = "강감찬"
		
		//static 변수는 클래스 이름과 인스턴스이름으로 접근 가능
		Data.school = "도제원초등학교";
		//인스턴스 이름으로 접근하면 경고
		data.school = "퇴계원중학교";
		
		//중복된 코드를 여러 번 작성하게 되면 유지보수가 어려워집니다.
		//변경하고하 하는 경우 전부 찾아서 직접 변경해야 합니다.
		//이렇게 중복된 코드를 스파게티 코드라고 합니다.
		//이 문제는 중복된 코드를 함수를 만들어서 해결합니다.
		for(int i=0; i<5; i++) {
			System.out.println("Hello NoMethod");
		}
		
		System.out.println("=====================");
		
		for(int i=0; i<5; i++) {
			System.out.println("Hello NoMethod");
		}
		
		//인스턴스를 이용해서 Data 클래스에 만든 disp 메소드 호출
		data.disp();
		data.disp();
		//매배변수가 있는 메소드: 매개변수가 있으면 없을 때 보다
		//다양하게 일을 시킬 수 있습니다.
		data.disp(3);
		data.disp(2);
	}
}
