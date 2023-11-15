package step4_01.string;


public class StringEx05_문제 {

	public static void main(String[] args) {

		String jumin = "890101-2012932";
		// 문제 1) 나이 출력
		// 정답 1) 35세
		String ageStr = jumin.substring(0, 2);
		 int strInt =Integer.parseInt(ageStr);// 문자열 -> 숫자화
		 int age = 2023 - (1900 + strInt)+1;
		 System.out.println("나이 출력");
		 System.out.println(age + "세");
		 
		// 문제 2) 성별 출력
		// 정답 2) 여성
		
		 //char 문자 타입은 '' 꼭 붙여줘야한다....!!!! 안붙여줘서 출력이 제대로 안됨
		 System.out.println("성별 출력");
		 char sexChar = jumin.charAt(7);
		 if (sexChar == '2' || sexChar =='4' ) {
			System.out.println("여성");
		}else if (sexChar == '1' || sexChar == '3') {
			System.out.println("남성");
		}
		
		 System.out.println("==끝==");

	}

}
