package step4_01.string;

// 문자열 관련 데이터 형변환

public class StringEx04 {

	public static void main(String[] args) {

		// [1] 문자열 > 숫자 형변환 Integer.parseInt(데이터);
		//String birthy = "2023년"; //문자열 ** 중간에 숫자아닌 형태가 들어가며 오류남**
		String birthy = "2023";
		System.out.println(birthy + 1);//20231
		
		int nBirthy = Integer.parseInt(birthy);//Integer.parseInt("문자열") = 메서드 사용
		System.out.println(nBirthy+1);//2024
		// [2] 숫자 > 문자열 형변환 Integer.toString(숫자)
		
		// 2-1) + "" 사용. 야매..이지만 많이 사용함
		int salary = 2000000;
		String str1 = salary + "";
		System.out.println(str1 + 10000000);// 글자로 봄 200000010000000
		
		// 2-2) Integer.toString(숫자) 사용. 중요
		String str2 =Integer.toString(salary);
		System.out.println(str2 + 100000);//2000000100000
		
		// 2-3) String.valueOf(숫자) 사용. 한번 알아만 주기
		String str3 = String.valueOf(salary);
		System.out.println(str3 + 100000);//2000000100000

		
		System.out.println("=================");
		// 참고) 구글에서 ASCII 코드표 검색 (65 : 'A' , 97 : 'a' 상식적으로 외우기)
		
		// 문자 > 숫자
		char ch1 = 'a';
		int n1 = ch1;
		System.out.println(ch1 + " " + n1);//a 97
		
		// 숫자 >  문자
		int n2 = 65;
		char ch2 = (char)n2;
		System.out.println(ch2 + " "+ n2);//A 65
		
		System.out.println((int)'s'+ 3);//118
		System.out.println((char)(65+10));//K
	}

}
