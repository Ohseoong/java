
public class DataType {

	public static void main(String[] args) {
		//�ڽ��� �̸��� ���̿� ����(���ڴ� M, ���ڴ� f)��
		//�����ϴ� ������ �����ؼ� �����͸� �����ϰ� ���
		
		//�ڷ��� ���, �������� ����
		
		String name = "������";
		int age = 17;
		char gender = 'M';
		System.out.println("�̸��� " + name + "\n" + "���̴� "
		 + age + "\n" + "������ " + gender);
		
		int data1 = 70;
		int data2 = 3;
		
		//�� ���ϱ�
		double d = (double)data1 / data2;
		System.out.println("d: " + d);
		//������ ���ϱ�
		int mod = data1 % data2;
		System.out.println("mod: " + mod);
		//1�ʸ��� ����, �Ķ�, ����� �����ư��鼭 ����ϱ�
		/*
		try {
			int i = 0;
			for(;;) {
				//1�� ��� - �ڹٿ����� �ð��� ������ 1/1000 ��
				Thread.sleep(1000);
				if(i%3 == 0) {
				System.out.println("����");
			}
			if(i%3 == 1) {
				System.out.println("�Ķ�");
			}
			if(i%3 == 2) {
				System.out.println("���");
			}
			i = i + 1;
			}
			
		}catch(Exception e) {}
		*/
		//shift(<<, >>, <<<)�� ��Ʈ������ �гʤ��� �������Դϴ�.
		//<<�� 1�� �� ������ 2�谡 �˴ϴ�.
		//>>�� 1�� �� ������ 1/2�� �˴ϴ�.
		//32�� �̻� �̴°��� �ǹ̰� ��� 32�� ���� ������ ��ŭ��
		//�о���ϴ�.
		
		int x = 17;
		System.out.println("x<<2:" + (x<<2));
		System.out.println("x<<34:" + (x<<34));
		System.out.println("x>>2:" + (x>>2));
		
		//��Ʈ�� ������:��Ʈ ������ �����ؼ� ������ ����� ����
		//&(and): �� �� 1�� ���� 1 ������ ���� 0
		//|(or): �� �� 0�� ���� 0 ������ ���� 1
		//^(exclusive): ������ 0 �ٸ��� 1
		int d1 = 20; //00000000 00000000 00000000 00010100
		int d2 = 17; //00000000 00000000 00000000 00010001
		System.out.println("20&17:" + (d1&d2)); //16
		System.out.println("20|17:" + (d1|d2)); //16+4+1 = 21
		System.out.println("20&17:" + (d1^d2)); //4+1 = 5
		
		boolean result = d1 > 10 && d2 > 10;
		System.out.println("result:" + result);//true
		result = d1 < 10 || d2 < 10;
		System.out.println("result:" + result);//false
		result = !result;
		System.out.println("result:" + result);//true
		
		//���� d2�� 17 d1�� 20
		result = d1 > 10 && d2++ > 20;
		System.out.println("d2:" + d2);//18
		
		//||(or)�� ���� ������ true�̸� ���� ������ �������� �ʽ��ϴ�.
		result = d1 > 10 || d2++ > 20;
		System.out.println("d2:" + d2);//18
		
		//d1�� 4�� ������� Ȯ��
		result = d1 % 4 == 0;
		
		//d1�� 4�� ����̰� 100�� ����� �ƴϰų� 400�� ������� Ȯ��
		result = d1 % 4 == 0 && d1 % 100 != 0 || d1 % 400 == 0;
		
		//d1�� d2���� ũ�ٸ� d1 �׷��� �ʴٸ� d2
		int max = d1 > d2 ? d1 : d2;
		System.out.println("max:" + max);
	}

}
