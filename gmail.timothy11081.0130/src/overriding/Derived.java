package overriding;

//Base Ŭ�����κ��� ��ӹ޴� Derived Ŭ����
public class Derived extends Base {
	//�޼ҵ� �������̵�
	//���� Ŭ������ �ִ� �żҵ�� ������ ������ �޼ҵ�
	public void method() {
		System.out.println("���� Ŭ�������� �������̵� �� �޼ҵ�");
	}
	
	public void subMethod() {
		System.out.println("���� Ŭ�������� �����ϴ� �żҵ�");
	}
}
