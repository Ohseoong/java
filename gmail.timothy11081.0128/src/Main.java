//main �޼ҵ带 ������ �ִ� Ŭ������ ���� Ŭ�����Դϴ�.
public class Main {

	public static void main(String[] args) {
		//Data Ŭ������ �ν��Ͻ� �����
		Data data = new Data();
		data.name = "������";
		data.age = 17;
		data.height = 171.3;
		
		//�ν��Ͻ� ������ Ŭ���� �̸����� ������ �Ұ�
		//Data.name = "������"
		
		//static ������ Ŭ���� �̸��� �ν��Ͻ��̸����� ���� ����
		Data.school = "�������ʵ��б�";
		//�ν��Ͻ� �̸����� �����ϸ� ���
		data.school = "�������б�";
		
		//�ߺ��� �ڵ带 ���� �� �ۼ��ϰ� �Ǹ� ���������� ��������ϴ�.
		//�����ϰ��� �ϴ� ��� ���� ã�Ƽ� ���� �����ؾ� �մϴ�.
		//�̷��� �ߺ��� �ڵ带 ���İ�Ƽ �ڵ��� �մϴ�.
		//�� ������ �ߺ��� �ڵ带 �Լ��� ���� �ذ��մϴ�.
		for(int i=0; i<5; i++) {
			System.out.println("Hello NoMethod");
		}
		
		System.out.println("=====================");
		
		for(int i=0; i<5; i++) {
			System.out.println("Hello NoMethod");
		}
		
		//�ν��Ͻ��� �̿��ؼ� Data Ŭ������ ���� disp �޼ҵ� ȣ��
		data.disp();
		data.disp();
		//�Ź躯���� �ִ� �޼ҵ�: �Ű������� ������ ���� �� ����
		//�پ��ϰ� ���� ��ų �� �ֽ��ϴ�.
		data.disp(3);
		data.disp(2);
	}
}
