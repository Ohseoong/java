
public class DataType2 {

	public static void main(String[] args) {
		//byte < short(char) < int < float < double
		
		//������ ������� �ڽ��� ũ�⺸�� ���� �����͸� ������ �� �ֽ��ϴ�
		double d = 10;
		//�ڽ��� ũ�⺸�� ū �����ʹ� ������ �� �����ϴ�.
		//int x = 10.7;
		//byte b = 2000;
		
		byte b1 = 10;
		byte b2 = 20;
		//int���� ���� �����͸� ��������ϸ�
		//int�� �����ؼ� ������ �����ϱ� ������ byte�� ������ ����
		//byte result = b1 + b2;
		
		int result = b1 + b2;
		double sum;
		//������ ����� 3 - ������ ������ �����ϸ� ����� ����
		//double r = b1 / 3;
		
		//�ϳ��� �����͸� double�� ����ȯ�� �ϸ� �̼��� ������
		//���ꤿ�Ƿ� ��� �Ǽ��� �����ؼ� ����
		double r = (double)b1 / 3;
		System.out.println("r:" + r);
		
		sum = 0;
		for(int i = 0; i < 1000; i = i + 1) {
			sum = sum + 1.0;
		}
		System.out.println("sum:" + (sum/10));
		
		//�Ǽ��� ������ ��ȯ�ϸ� �Ҽ��� �������ϴ�.
		int k = (int)19.9;
		System.out.println("k:" + k);
		//ū������ ���������� ��ȯ�ϸ� �����÷ο쳪 ����÷ο찡 
		//�߻��� �� �ֽ��ϴ�.
		byte b = (byte)200; //byte�� 127���� ������ �� �ִµ�
		//�� ū���� ������ ��ȯ�ؼ� ���� : overflow
		System.out.println("b:" + b);
		
		b = (byte)-200; //byte�� -128���� ������ �� �ִµ�
		//�� �������� ������ ��ȯ�ؼ� ���� : underflow
		System.out.println("b:" + b);
		
		
	}

}
