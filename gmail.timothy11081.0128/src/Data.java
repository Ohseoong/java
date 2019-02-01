
public class Data {
	//클래스 안에서 static이라는 키위드 없이 만들면 인스턴스 변수
	//각 인스턴스가 별도로 메모리 할당을 받아서 사용
	//인스턴스만 접근이 가능합니다.
	public String name;
	public int age;
	//접근 지정자가 public이면 클래스 내부와 외부에서 모두 사용이 가능
	public double height;
	
	//접근 지정자가 private이 되면 클래스 외부에서는 사용이 불가능
	//private double height;
	
	//static 변수
	//클래스 코드 안에 1개만 생성
	//클래스와 인스턴스 모두 접근이 가능
	//데이터를 공유할 때 이용
	public static String school;
	
	//static초기화: 클래스를 처음 사용할 때 1번만 수행하는 코드
	//인스턴스 변수는 사용 못합니다.
	static {
		System.out.println("처음 한 번만 수행되는 코드");
		school = "도제원초등학교";
		//인스턴스 변수를 사용해서 에러
		//name = "오세웅";		
	}
	
	public void disp() {
		for(int i=0; i<5; i++) {
			System.out.println("Hello Method");
		}
	}
	
	//함수를 호출할 때 대입한 정수만큼 문자열을 출력하는 메소드
	//이름은 위의 함수랑 동일한 disp인데 매개변수의 개수가 다릅니다.
	//이렇게 이름은 같고 매개변수의 개수나 자료형이 다른 메소드를
	//만드는 것을 Method Overloading 이라고 합니다.
	//하는 일이 비슷한 메소드의 이름을 동일하게 만들기 위해서 합니다.
	public void disp(int n) {
		for(int i=0; i<n; i++) {
			System.out.println("Hello Method");
		}
	}
}
