package step4_01.string;
//1차 2023-11-16 
public class StringEx05_연습 {
	
	public static void main(String[] args) {

		String jumin = "890101-2012932";
		
		// 문제 1) 나이 출력
		// 정답 1) 35세
		
		// "89" 를 추출,,
		String strAge = jumin.substring(0, 2);// "89"
		// 문자열 -> 숫자화 형 변환
		 int intAge = Integer.parseInt(strAge); // 89
		 int age = 2023-(1900+intAge) + 1;
		 System.out.println("나이 출력");
		 System.out.println(age+ "세");
		
		


		
		// 문제 2) 성별 출력
		// 정답 2) 여성
		 System.out.println("성별 출력");
		 
		 char key = jumin.charAt(7);
		 if (key == '2'|| key == '4') {
			System.out.println("여성");
		}
		 else if (key == 1 || key ==3) {
			System.out.println("남성");
		}

	}
}
