import java.util.Scanner;

public class DataType {

	public static void main(String[] args) {
		//Ű����κ��� �Է¹޴� ��ü ����
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���:");
		int score = sc.nextInt();
		*/
		//score�� 60�� �̻��̸� �հ��̶�� ���
		/*
		if (score >= 60) {
			System.out.println("�հ�");
		}else {
			System.out.println("���հ�");
		}
		*/
		
		//score�� 100�̻��̸� �̼Ǽ���
		//�׷��� ������ �̼ǽ��ж�� ���
		/*
		if(score >= 100) {
			System.out.println("�̼Ǽ���");
		}else {
			System.out.println("�̼ǽ���");
		}
		*/
		
		
		//score�� 90~100�̸� A
		//score�� 80~89�̸� B
		//score�� 70~79�̸� C
		//score�� 0~59�̸� F
		/*
		if(score >= 90 && score <= 100) {
			System.out.println("A");
		}else if(score >= 80 && score < 90) {
			System.out.println("B");
		}else if(score >= 70 && score < 80) {
			System.out.println("C");
		}else if(score >= 0 && score < 70) {
			System.out.println("F");
		}else {
			System.out.println("������ 0-100���̷� �Է��ϼ���!!!");
		}
		sc.close();
		*/
		
		//Ű����� �ޱ� ���� ��ü ����
		Scanner sc = new Scanner(System.in);
		//�ϳ��� ���ڿ� �Է¹ޱ�
		/*
		System.out.print("1.�߱��� 2.�н��� 3.�ѽ��� 4. �Ͻ���: ");
		String menu = sc.nextLine();
		//switch �̿�
		switch(menu) {
		case "1":
			System.out.println("�߱����� ��ȭ�ɱ�");
			break;
		case "2":
			System.out.println("�н����� ��ȭ�ɱ�");
			break;
		case "3":
			System.out.println("�ѽ����� ��ȭ�ɱ�");
			break;
		case "4":
			System.out.println("�Ͻ����� ��ȭ�ɱ�");
			break;
		default:
			System.out.println("�޴��� �߸������߽��ϴ�.");
			break;
			
		}
		*/
		
		
		//������ �۾��̳� ������ ������ ���� �۾���
		//�ݺ����� �̿��ؼ� �ۼ��� �����մϴ�.
		
		//Hell Java�� 3�� ��� - While�� �̿��ؼ� �۾�
		
		
		//1���� 5������ ������� ���
		
		
		//for�� �̿��ؼ� Hello Java�� 5�� ���
		
		//��� �ȿ��� ���� ������ ��� �ȿ����� ����� ����
		//������ ������ �� ���̸� {}�� �����ص� �˴ϴ�.
		for(int i=0; i<5; i++) 
			System.out.println("Hello Java");
		
		for(int i=1; i<10; i++) {
			if(i%4==0) {
				break;
			}
			System.out.println("i = "+ i);
		}
		for(int i=1; i<10; i++) {
			//i�� 4�� ����̸� i=i+1 �ڸ��� �̵�
			//continue�� �Ʒ��� �ִ� ������ �������� �ʽ��ϴ�.
			if(i%4==0) {
				continue;
			}
			System.out.println("i = "+ i);
		}
	}

}
