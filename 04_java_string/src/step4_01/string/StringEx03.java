package step4_01.string;

/* 
 * # 문자열 관련 메서드
 * 
 * 1. 문자열.length() 							: 문자열의 길이를 반환한다. (반환타입은 int)
 * 2. 문자열.indexOf("문자열") 					: 특정문자열이 포함된 위치를 반환한다.  (반환타입은 int)
 * 3. 문자열.charAt(?번째)      				: 문자열의 ?번째에에 포함된 데이터를 반환한다. (반환 타입은 char)
 * 4. 문자열.substring(index1이상, index2미만)  : 특정문자열의 index1이상 index2미만의 문자열을 잘라서 반환한다. (반환타입은 String)
 *    문자열.substring(index1)  				: 특정문자열의 index1이상부터 끝까지의 문자열을 잘라서 반환한다. (반환타입은 String)
 * 5. 문자열.split("구분자")					: 구분자로 문자열을 잘라서 반환한다. (반환타입은 String 배열)
 * 
 */

public class StringEx03 {

	public static void main(String[] args) {

		String str = "megait";
		System.out.println(str);
		System.out.println("/n==============\n");
		
		// [1] length() : 문자열의 길이
		//System.out.println(str.length());
		//str.length();
		int length = str.length();
		System.out.println(length);
		System.out.println("/n==============\n");
		
		// [2] indexOf("글자") : 글자가 포함된 인덱스 확인
		System.out.println(str.indexOf("m"));// "m"의 위치는?
		System.out.println(str.indexOf("e"));
		System.out.println(str.indexOf("g"));
		System.out.println(str.indexOf("a"));
		System.out.println(str.indexOf("i"));
		System.out.println();
		System.out.println(str.indexOf("mega"));
		System.out.println(str.indexOf("it"));
		System.out.println(str.indexOf("qqqqq"));// 데이터가 없을 경우 -1로 반환된다
		
		
		// [3] charAt(index) : 문자 한개 추출 (인덱싱)
		System.out.println(str.charAt(0));//0 번째에 있는 글자
		System.out.println(str.charAt(1));
		
		System.out.println();
		//(중요) charAt 메서드의 결과는 char 타입니다.
		char ch = str.charAt(2);
		
		System.out.println(ch);
		System.out.println(str.charAt(str.length() -1));//6개수에서 -1 하면 5
		System.out.println();
		
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		System.out.println();
		
		//[짱중요]
		// [4] substring() : 문자 여러개 추출 (슬라이싱)
		System.out.println(str.substring(0, 4));// 0 이상 4 미만 = 0,1,2,3
		System.out.println(str.substring(4, 6));
		
		System.out.println("\n==============\n");
		
		
		// 4-1) substring(index1이상, index2미만)
		String subStr = str.substring(2, 4);// 3~4
		System.out.println(subStr);
		System.out.println();
		// 4-2) substring(index1부터 끝까지)
		
		System.out.println(str.substring(2));// 2열부터 끝까지
		System.out.println(str.substring(4));
		System.out.println();
		
		System.out.println("\n==============\n");
		
		// [5] split("구분자") : 구분자로 잘라내기
		String str1 = "a/b/c/d/e/f/g";
		String str2 = "aa&bb&cc";
		String str3 = "aaa.bbb.ccc.ddd.eee";
		
		String [] temp =str1.split("/");// 배열로 나뉘어짐 7글자
		System.out.println(temp.length);
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]+ " ");
		}
		System.out.println();
		
		temp =str2.split("&");
		System.out.println(temp.length);
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]+ " ");
		}
		System.out.println();
		
		temp =str3.split("\\.");//-> . 안됨(예외 케이스) ->구분자 \\. 이렇게 적어야함(이스케이프 문자로 구현)
		System.out.println(temp.length);
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]+ " ");
		}
		System.out.println();
		System.out.println("\n==============\n");
		
		// 참고) 문자열 비교 : compareTo()-> 글자 비교
		String str4 = "씨";
		String str5 = "자바";
		String str6 = "파이썬";
		String str7 = "씨";
		
		//왼쪽 데이터가 작을 경우 음수가 반환된다.
		System.out.println(str4.compareTo(str5));
		System.out.println(str4.compareTo(str6));
		
		//왼쪽 데이터가 클 경우 양수가 반환된다.
		System.out.println(str5.compareTo(str4));
		System.out.println(str6.compareTo(str4));
		
		//양쪽 데이터가 같은 경우는 0// 두글자가 같다
		System.out.println(str4.compareTo(str7));
		
		
	}

}
