import java.util.Random;

public class Document {

	public static void main(String[] args) {
		//String �ν��Ͻ� ����
		String str = new String("Hello String");
		//������ �ִ� �޼ҵ�� ����� �����ϰ� ���
		String temp = str.toString();
		System.out.println(temp);
		
		//random()�� static �޼ҵ��̹Ƿ� Ŭ���� �̸����� ȣ��
		double r = Math.random();
		System.out.println(r);
		
		//Runtime �ν��Ͻ� ����
		Runtime run = Runtime.getRuntime();
		
		//java.util.Random Ŭ������ nextInt ��� �޼ҵ忡 ������ �����ϸ�
		//������ ���� ������ ���� �����ϰ� ������ �ݴϴ�.
		//�� �޼ҵ带 �̿��ؼ� 1-45������ ������ ���� 1���� �޾Ƽ� ���
		//RandomŬ������ �ν��Ͻ��� ����
		Random a = new Random();
		int x = a.nextInt(45) + 1;
		System.out.println(x);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.out.println("���ܳ���:" + e1.getMessage());
		}
		
		int k = 0;
		int result = -1;
		try {
			result = x / k;
		}
		//���ܰ� �߻��ؾ߸� ����
		catch(Exception e) {
			System.out.println("���ܳ���:" + e.getMessage());
		}
		//������ ����
		finally {
			System.out.println("���� �߻����ο� ������� ������ ����");
		}
		
		System.out.println("result:" + result);
		
		
	}

}
