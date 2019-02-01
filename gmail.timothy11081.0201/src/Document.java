import java.util.Random;

public class Document {

	public static void main(String[] args) {
		//String 인스턴스 생성
		String str = new String("Hello String");
		//리턴이 있는 메소드는 결과를 저장하고 사용
		String temp = str.toString();
		System.out.println(temp);
		
		//random()은 static 메소드이므로 클래스 이름으로 호출
		double r = Math.random();
		System.out.println(r);
		
		//Runtime 인스턴스 생성
		Runtime run = Runtime.getRuntime();
		
		//java.util.Random 클래스의 nextInt 라는 메소드에 정수를 대입하면
		//정수로 나눈 나머지 값을 랜덤하고 리턴해 줍니다.
		//이 메소드를 이용해서 1-45사이의 랜덤한 숫자 1개를 받아서 출력
		//Random클래스의 인스턴스를 생성
		Random a = new Random();
		int x = a.nextInt(45) + 1;
		System.out.println(x);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.out.println("예외내용:" + e1.getMessage());
		}
		
		int k = 0;
		int result = -1;
		try {
			result = x / k;
		}
		//예외가 발생해야만 수행
		catch(Exception e) {
			System.out.println("예외내용:" + e.getMessage());
		}
		//무조건 수행
		finally {
			System.out.println("예외 발생여부에 상관없이 무조건 수행");
		}
		
		System.out.println("result:" + result);
		
		
	}

}
