package step4_01.string;

//2023-12-31 단어검사 이중반복문 재복습 필요
import java.util.Scanner;

/*
 * # 단어 검색
 * 
 * 1. 단어를 입력받아 text변수 문장 속에 해당 단어가 있는지 검색한다.
 * 2. 단어가 존재하면 true
 *    단어가 없으면 false를 출력한다.
 */

public class StringEx16_연습 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";// 16
		System.out.println(text);

		System.out.print("검색할 단어를 입력하세요 : ");// 4
		String word = scan.next();

		// 단어를 넣는 배열
		char[] arr = new char[text.length()];

		// text 의 문자를 arr배열에 저장하기
		for (int i = 0; i < arr.length; i++) {
			arr[i] = text.charAt(i);
		}
		
		// 이중 반복문 사용
		// 입력받은 단어와 text 문장속에 있는지 확인하기
		int wordSize = word.length();
		boolean isSame = false;
														// arr.length- wordSize +1 검색할 단어 외의 값을 모두 확인하기 위해서
														// i는 현재 확인중에 있는 부분문자열의 시작인덱스
		for (int i = 0; i < arr.length - wordSize + 1; i++) {
			int correctCnt = 0;
														// j는 검색할 단어의 각 문자의 인덱스
			for (int j = 0; j < wordSize; j++) {     	// 그중에서 입력받은 wordSize검사
				                                       	// i+j는 현재 확인 중인 부분문자열에서 검색할 단어의 문자에 접근
				if (arr[i + j] == word.charAt(i)) {
					correctCnt++;
				}
			}
		}
		if (isSame)
			System.out.println("일치");
		else
			System.out.println("불일치");

	}

}
