package polymorphism;

public class Main {

	public static void main(String[] args) {
		//������ ����
		Starcraft star = new Zerg();
		star.attack();
		
		//�׶��� ����
		star = new Terran();
		star.attack();
		
		//�����佺�� ����
		star = new Protoss();
		star.attack();
		
		//Starcraft�� �Ϲ� Ŭ������� �ν��Ͻ� ������ ����
		//Starcraft�� ��Ӱ��踦 ����� ���� Ŭ������ ���� �����
		//Ŭ������ �ƴմϴ�. - ��Ʈ�Ͻ� ������ ���ϵ��� �ؾ��մϴ�.
		//class �տ� abstract�� �߰��ϸ� �˴ϴ�.
		//abstract Ŭ������ ��ü�� �����Ϸ��� �ϸ�
		//�ν��Ͻ�ȭ �� �� ���ٰ� ���� �߻�
		//star = new Starcraft();
		
		final int a = 20;
		//final ������ ���� ����
		//a = 20;
	}

}
