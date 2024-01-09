package step4_01.string;
//여기 풀기!
import java.util.Scanner;

/*
 * # 단어 검색
 * 
 * 1. 단어를 입력받아 text변수 문장 속에 해당 단어가 있는지 검색한다.
 * 2. 단어가 존재하면 true
 *    단어가 없으면 false를 출력한다.
 */
// 문자열 관련해서 형변환,next() nextLine() 차이
public class StringEx16_연습2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);

		System.out.print("검색할 단어를 입력하세요 : ");
		String word = scan.next();

		// text문자를 arr배열에 저장하기
		char[] arr = new char[text.length()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = text.charAt(i);
		}

		int wordSize = word.length();
		boolean isExist = false;
		// 'text'배열의 문자열을 반복('arr.length-wordSize+1' : 전체길이에서 내가 입력한 문자열의 크기를 뺀
		for (int i = 0; i < arr.length - wordSize + 1; i++) {
			// 내부루프는 각 문자를 입력된 단어와 비교
			// 입력된 단어의 모든 문자가 텍스트에서 해당하는 문자와 일치하면 correctCnt 증가
			int correctCnt = 0;
			for (int j = 0; j < wordSize; j++) {
				if (arr[i + j] == word.charAt(j)) {// i:검색을 시작하는 위치 j:현재검사중인 위치
					correctCnt++;

				}
			}
			if (correctCnt == wordSize) {
				isExist = true;
			}
		}
		if (isExist)
			System.out.println("일치");
		else
			System.out.println("불일치");

	}

}
