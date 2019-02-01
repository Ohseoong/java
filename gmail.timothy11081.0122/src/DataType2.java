
public class DataType2 {

	public static void main(String[] args) {
		//byte < short(char) < int < float < double
		
		//숫자형 변수라면 자신의 크기보다 작은 데이터를 저장할 수 있습니다
		double d = 10;
		//자신의 크기보다 큰 데이터는 저장할 수 없습니다.
		//int x = 10.7;
		//byte b = 2000;
		
		byte b1 = 10;
		byte b2 = 20;
		//int보다 작은 데이터를 산술연산하면
		//int로 변견해서 연상을 수행하기 때문에 byte에 저장을 못함
		//byte result = b1 + b2;
		
		int result = b1 + b2;
		double sum;
		//연산의 결과는 3 - 정수와 정수가 연산하면 결과는 정수
		//double r = b1 / 3;
		
		//하나의 데이터를 double로 형변환을 하면 싱수와 정수가
		//연산ㅏ므로 모두 실수로 변경해서 연산
		double r = (double)b1 / 3;
		System.out.println("r:" + r);
		
		sum = 0;
		for(int i = 0; i < 1000; i = i + 1) {
			sum = sum + 1.0;
		}
		System.out.println("sum:" + (sum/10));
		
		//실수를 정수로 변환하면 소수가 버려집니다.
		int k = (int)19.9;
		System.out.println("k:" + k);
		//큰정수를 작은정수로 변환하면 오버플로우나 언더플로우가 
		//발생할 수 있습니다.
		byte b = (byte)200; //byte는 127까지 저장할 수 있는데
		//더 큰수를 강제로 변환해서 저장 : overflow
		System.out.println("b:" + b);
		
		b = (byte)-200; //byte는 -128까지 저장할 수 있는데
		//더 작은수를 강제로 변환해서 저장 : underflow
		System.out.println("b:" + b);
		
		
	}

}
