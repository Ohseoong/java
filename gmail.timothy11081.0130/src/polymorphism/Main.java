package polymorphism;

public class Main {

	public static void main(String[] args) {
		//저그의 공격
		Starcraft star = new Zerg();
		star.attack();
		
		//테란의 공격
		star = new Terran();
		star.attack();
		
		//프로토스의 공격
		star = new Protoss();
		star.attack();
		
		//Starcraft가 일반 클래스라면 인스턴스 생성이 가능
		//Starcraft는 상속관계를 만들기 위한 클래스지 실제 사용할
		//클래스가 아닙니다. - 인트턴스 생성을 못하도록 해야합니다.
		//class 앞에 abstract를 추가하면 됩니다.
		//abstract 클래스의 객체를 생성하려고 하면
		//인스턴스화 할 수 없다고 에러 발생
		//star = new Starcraft();
		
		final int a = 20;
		//final 변수는 수정 못함
		//a = 20;
	}

}
