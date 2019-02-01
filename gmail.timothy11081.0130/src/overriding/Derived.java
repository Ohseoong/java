package overriding;

//Base 클래스로부터 상속받는 Derived 클래스
public class Derived extends Base {
	//메소드 오버라이딩
	//상위 클래스에 있는 매소드와 동일한 윈형의 메소드
	public void method() {
		System.out.println("하위 클래스에서 오버라이딩 된 메소드");
	}
	
	public void subMethod() {
		System.out.println("하위 클래스에만 존재하는 매소드");
	}
}
