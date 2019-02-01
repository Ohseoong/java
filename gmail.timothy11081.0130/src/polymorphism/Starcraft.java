//다형성 구현을 위해서 생성: 실제사용X
package polymorphism;

//상속관계를 만들기 위한 클래스임을 객체 생성을 못하도록 abstract class
//로 만듬
public interface Starcraft {
	//오버라이딩을 위해서 메소드 추가
	//실제 이 메소드를 호출을 안합니다.
	//이런 메소드는 내용이 있을 필요가 없습니다.
	//이런경우 abstract 메소드를 만듭니다.
	//메소드 결과형 앞에 abstract를 추가하면 됩니다.
	//이 메소드는 abstract class 나 interface에만 존재해야 합니다
	//상속받은 곳에서 반드시 오버라이딩 해야합니다.
	
	//인터페이스 안에서는 abstract가 없어도 추상메소드 입니다.

	public void attack();
}
