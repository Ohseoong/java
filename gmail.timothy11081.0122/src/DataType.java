
public class DataType {

	public static void main(String[] args) {
		//��ȣ(����)�� Ű(�Ǽ�)�� ������(�Ǽ�)�� ����
		int number = 1;//������ �����ϸ鼭 �� ����
		double weight, keight; //2���� �ѹ��� ����
		//double keight;
		
		//���� ����
		//number = 8;
		weight = 59.5;
		keight = 170.4;
		
		//���� ���
		System.out.println("��ȣ��" + number + "��");
		System.out.println("Ű��" + keight + "cm");
		System.out.println("�����Դ�" + weight + "kg");
		
		//���ڴ� char�� �����ϰ� �ڵ尪�� �����ص� �ǰ�
		//''�ȿ� �ϳ��� ���ڸ� �����ص� �˴ϴ�.
		//0:48 A:65 a:95
		
		char ch = 'A';
		//char�� �����̴�
		System.out.println("ch��" + ch);
		ch = 65;
		System.out.println("ch��" + ch);
		ch= 'A' + 2;
		System.out.println("ch��" + ch);
		
		//boolean�� ��(true) ����(false)�� �����ϱ� ���� �ڷ���
		//20�� �̻� ���θ� ����
		//boolean ������ boolean�̶�� ǥ���ϱ� ���ؼ�
		//is�� �����ϴ� ��찡 �����ϴ�.
		boolean ist = true;
		System.out.println(ist);
		
		
	}

}
