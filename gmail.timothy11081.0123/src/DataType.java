
public class DataType {

	public static void main(String[] args) {
		//자신의 이름과 나이와 성별(남자는 M, 여자는 f)을
		//저장하는 변수를 생성해서 데이터를 저장하고 출력
		
		//자료형 고민, 변수명을 생각
		
		String name = "오세웅";
		int age = 17;
		char gender = 'M';
		System.out.println("이름은 " + name + "\n" + "나이는 "
		 + age + "\n" + "성별은 " + gender);
		
		int data1 = 70;
		int data2 = 3;
		
		//몫 구하기
		double d = (double)data1 / data2;
		System.out.println("d: " + d);
		//나머지 구하기
		int mod = data1 % data2;
		System.out.println("mod: " + mod);
		//1초마다 빨강, 파랑, 녹색을 번갈아가면서 출력하기
		/*
		try {
			int i = 0;
			for(;;) {
				//1초 대기 - 자바에서는 시간의 단위가 1/1000 초
				Thread.sleep(1000);
				if(i%3 == 0) {
				System.out.println("빨강");
			}
			if(i%3 == 1) {
				System.out.println("파랑");
			}
			if(i%3 == 2) {
				System.out.println("녹색");
			}
			i = i + 1;
			}
			
		}catch(Exception e) {}
		*/
		//shift(<<, >>, <<<)는 비트단위로 밀너ㅐ는 연산자입니다.
		//<<를 1번 할 때마다 2배가 됩니다.
		//>>를 1번 할 때마다 1/2이 됩니다.
		//32번 이상 미는거은 의미가 없어서 32로 나눈 나머지 만큼만
		//밀어냅니다.
		
		int x = 17;
		System.out.println("x<<2:" + (x<<2));
		System.out.println("x<<34:" + (x<<34));
		System.out.println("x>>2:" + (x>>2));
		
		//비트논리 연산자:비트 단위로 연산해서 정수로 결과를 리턴
		//&(and): 둘 다 1일 때만 1 나머지 경우는 0
		//|(or): 둘 다 0일 때만 0 나머지 경우는 1
		//^(exclusive): 같으면 0 다르면 1
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
		
		//현재 d2는 17 d1은 20
		result = d1 > 10 && d2++ > 20;
		System.out.println("d2:" + d2);//18
		
		//||(or)는 앞의 조건이 true이면 뒤의 내용을 수행하지 않습니다.
		result = d1 > 10 || d2++ > 20;
		System.out.println("d2:" + d2);//18
		
		//d1이 4의 배수인지 확인
		result = d1 % 4 == 0;
		
		//d1이 4의 배수이고 100의 배수는 아니거나 400의 배수인지 확인
		result = d1 % 4 == 0 && d1 % 100 != 0 || d1 % 400 == 0;
		
		//d1이 d2보다 크다면 d1 그렇지 않다면 d2
		int max = d1 > d2 ? d1 : d2;
		System.out.println("max:" + max);
	}

}
