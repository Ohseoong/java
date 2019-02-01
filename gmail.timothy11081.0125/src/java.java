
public class java {

	public static void main(String[] args) {
		//초기 데이터를 가지고 배열을 생성
		int [] intAr = {10, 30, 50, 20, 40};
		
		//배열을 먼저 만들고 데이터를 나중에 대입
		String [] stringAr = new String[4];
		stringAr[0] = "안중근";
		stringAr[1] = "유관순";
		stringAr[2] = "김구";
		stringAr[3] = "윤봉길";
		
		//데이터가 4개이면 인덱스는 0-3번까지 입니다.
		//4번을 이용하면 ArrayIndexOutOfBoundsException이 발생
		//s[3] = "윤봉길";
		
		//배열의 전체 데이터를 순회
		/*
		for(int i =0; i<4; i++) {
			String imsi = stringAr[i];
			System.out.println(imsi);
		}
		*/
		
		//배열의 데이터를 순회할때 반복문에 데이터의 개수를
		//리터럴로 입력하는 것은 별로 바람직하지 못합니다.
		//배열릐 데이터 개수가 변경되면 수정해야하기 때문입니다.
		
		//배열의 개수를 변수에 넣어두고 사용하면 배열의 데이터 개수가
		//변경되더라도 출력하는 부분을 수정할 필요가 없습니다.
		int size = stringAr.length;
		for(int i =0; i<size; i = i + 1) {
			String imsi = stringAr[i];
			System.out.println(imsi);
		}
		
		
		System.out.println("===================="); 
		//빠른 열거를 이용한 배열 순회
		//intAr의 모든 데이터를 순서대로 temp에 대입하고
		//{}안의 내용 수행
		for(int temp : intAr) {
			System.out.println(temp);
		}
	}

}
