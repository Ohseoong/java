
public class java {

	public static void main(String[] args) {
		//�ʱ� �����͸� ������ �迭�� ����
		int [] intAr = {10, 30, 50, 20, 40};
		
		//�迭�� ���� ����� �����͸� ���߿� ����
		String [] stringAr = new String[4];
		stringAr[0] = "���߱�";
		stringAr[1] = "������";
		stringAr[2] = "�豸";
		stringAr[3] = "������";
		
		//�����Ͱ� 4���̸� �ε����� 0-3������ �Դϴ�.
		//4���� �̿��ϸ� ArrayIndexOutOfBoundsException�� �߻�
		//s[3] = "������";
		
		//�迭�� ��ü �����͸� ��ȸ
		/*
		for(int i =0; i<4; i++) {
			String imsi = stringAr[i];
			System.out.println(imsi);
		}
		*/
		
		//�迭�� �����͸� ��ȸ�Ҷ� �ݺ����� �������� ������
		//���ͷ��� �Է��ϴ� ���� ���� �ٶ������� ���մϴ�.
		//�迭�l ������ ������ ����Ǹ� �����ؾ��ϱ� �����Դϴ�.
		
		//�迭�� ������ ������ �־�ΰ� ����ϸ� �迭�� ������ ������
		//����Ǵ��� ����ϴ� �κ��� ������ �ʿ䰡 �����ϴ�.
		int size = stringAr.length;
		for(int i =0; i<size; i = i + 1) {
			String imsi = stringAr[i];
			System.out.println(imsi);
		}
		
		
		System.out.println("===================="); 
		//���� ���Ÿ� �̿��� �迭 ��ȸ
		//intAr�� ��� �����͸� ������� temp�� �����ϰ�
		//{}���� ���� ����
		for(int temp : intAr) {
			System.out.println(temp);
		}
	}

}
