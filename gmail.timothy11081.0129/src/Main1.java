import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// Person Ŭ������ �ν��Ͻ� ����
		Person person1 = new Person();
		//setter�� ȣ���ؼ� ������ ����
		person1.setName("������");
		person1.setAge(17);
		person1.setHeight(171.3);
		//getter�� �̿��ؼ� �����͸����
		System.out.println("�̸�:" + person1.getName());
		
		//���ڿ��� �Ű������� �޴� �����ڸ� �̿��ؼ� �ν��Ͻ��� ����
		Person person2 = new Person("noname");
		System.out.println("�̸�:" + person2.getName());
		
		Scanner sc = new Scanner(System.in);
	}
}
