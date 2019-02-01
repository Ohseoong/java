
public class Sample {
	//call by value: ���� ���� �Ű����� ����
	//�谳������ �ڷ����� value Ÿ��
	//�Ű������� ���Ե� ���������͸� �޼ҵ� �ȿ��� ������ �� ����
	public void cav(int n) {
		n = n + 1;
		
	}
	
	//call by reference: ������ ���� �Ű����� ����
	//�Ű������� �ڷ����� reference Ÿ��
	//�̷� ������ �޼ҵ带 ȣ���� ���� ��ť�յ带 Ȯ���� ���ų�
	//�޼ҵ带 ȣ���� �� ������ �����͸� Ȯ���غ��� ���� �����ϴ�.
	public void car(int [] ar) {
		ar[0] = ar[0] + 1;
	}
	
	
	//�޼ҵ��� �������� ȣ���� ������ �Ѱ��ְ� ���� ��쿡��
	//return�� �̿��մϴ�.
	//�޼ҵ� �̸��տ� void��ſ� return �ϰ��� �ϴ� ��������
	//�ڷ����� �����ϰ� �޼ҵ� ������ return������; �� ������
	//������ָ� �˴ϴ�.
	//�޼ҵ忡�� void(������ ������)type�̸� �޼ҵ带 ȣ���ϰ�
	//������ �� �帧�� �������� �˴ϴ�.
	//�����͸� return�ϸ� �� return�� �����͸� ������ �ٸ� �۾���
	//�����ؼ� ���� �� �� �ֽ��ϴ�.
	//�޼ұ� ȣ�ⱸ�� �ȿ��� �޼ҵ带 ȣ���ϴ� chaining ���ĵ�
	//�����մϴ�.
	public double doubleAdd(double a, double b) {
		return a+b;
	}
	
	//�ν��Ͻ� ����
	public int x = 8;
	
	//static �޼ҵ�
	public static void staticMethod() {
		System.out.println("static mathod");
		//static �޼ҵ忡�� �ν��ϼ� ������ ȣ���ϸ� ����
		//�ν��Ͻ��� ����
		//static�� ����
		//x = 9;
	}
	
	//�ν��Ͻ� �޼ҵ忡�� ���������� �ν��Ͻ� ���� �Ǵ� 
	//static ������ �̸��� ���� �� �ν��Ͻ� ������ static ������
	//ȣ���Ϸ��� �տ� this.�� �ٿ��� �մϴ�.
	public void sameName(int x) {
		//�����̿��� ����x�� ȣ��˴ϴ�.
		System.out.println("x:"+ x);
		//�ν��Ͻ� ���� x�� ȣ��˴ϴ�.
		//this�� ������ �޼ҵ� �ܺο��� ���� ã���ϴ�.
		System.out.println("x:"+ this.x);
	}
	
	
}