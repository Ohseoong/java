
public class Data {
	//Ŭ���� �ȿ��� static�̶�� Ű���� ���� ����� �ν��Ͻ� ����
	//�� �ν��Ͻ��� ������ �޸� �Ҵ��� �޾Ƽ� ���
	//�ν��Ͻ��� ������ �����մϴ�.
	public String name;
	public int age;
	//���� �����ڰ� public�̸� Ŭ���� ���ο� �ܺο��� ��� ����� ����
	public double height;
	
	//���� �����ڰ� private�� �Ǹ� Ŭ���� �ܺο����� ����� �Ұ���
	//private double height;
	
	//static ����
	//Ŭ���� �ڵ� �ȿ� 1���� ����
	//Ŭ������ �ν��Ͻ� ��� ������ ����
	//�����͸� ������ �� �̿�
	public static String school;
	
	//static�ʱ�ȭ: Ŭ������ ó�� ����� �� 1���� �����ϴ� �ڵ�
	//�ν��Ͻ� ������ ��� ���մϴ�.
	static {
		System.out.println("ó�� �� ���� ����Ǵ� �ڵ�");
		school = "�������ʵ��б�";
		//�ν��Ͻ� ������ ����ؼ� ����
		//name = "������";		
	}
	
	public void disp() {
		for(int i=0; i<5; i++) {
			System.out.println("Hello Method");
		}
	}
	
	//�Լ��� ȣ���� �� ������ ������ŭ ���ڿ��� ����ϴ� �޼ҵ�
	//�̸��� ���� �Լ��� ������ disp�ε� �Ű������� ������ �ٸ��ϴ�.
	//�̷��� �̸��� ���� �Ű������� ������ �ڷ����� �ٸ� �޼ҵ带
	//����� ���� Method Overloading �̶�� �մϴ�.
	//�ϴ� ���� ����� �޼ҵ��� �̸��� �����ϰ� ����� ���ؼ� �մϴ�.
	public void disp(int n) {
		for(int i=0; i<n; i++) {
			System.out.println("Hello Method");
		}
	}
}
