
public class Array {

	public static void main(String[] args) {
		String [][] a = {{"��", "��", "��"},{"��", "��", "��"}};
		
		//2���� �ݺ����� �̿��ؼ� ������ ��ȸ
		/*
		int rowSize = a.length;
		for(int i = 0; i < rowSize; i++) {
			int lowSize = a[i].length;
			for(int j = 0; j < lowSize; j++) {
				System.out.println(a[i][j]);
			}
		}
		*/
		/*
		int size = a.length * a[0].length;
		for(int i = 0; i < size; i++) {
			System.out.println(a[i/a[0].length][i%a[0].length]);
		}
		*/
		
		//���� ���� �̿�
		for(String [] temp : a) {
			for(String imsi : temp) {
				System.out.println(imsi);
			}
		}
	}

}
