package step4_01.string;
//2024-01-09 깨달은점: 문자열의 삭제와 삽입의 기능에 대해서 기존의 int 와 같은 숫자 배열과 다른부분을 알게됨.

import java.util.Scanner;

/*
 * # 단어 교체하기(replace)
 *
 * 1. text변수 문장 속에서 변경하고 싶은 단어를 입력받아,
 * 2. 교체해주는 기능을 구현한다.
 * 예)
 * 		Life is too short.
 * 		변경하고 싶은 단어입력 : Life
 * 		바꿀 단어입력 : Time
 *
 * 		Time is too short.
 */

public class StringEx17_연습2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);

		System.out.print("변경 하고 싶은 단어는 ?");
		String myWord = scan.next();

		char[] textArray = new char[text.length()];
		for (int i = 0; i < textArray.length; i++) {
			textArray[i] = text.charAt(i);
		}

		int myWordSize = myWord.length();
		int idx = 0;
		boolean isSame = false;
		for (int i = 0; i < text.length() - myWordSize + 1; i++) {
			int correctCnt = 0;
			for (int j = 0; j < myWordSize; j++) {
				if (textArray[i + j] == myWord.charAt(j)) {
					correctCnt++;
				}
			}
			if (correctCnt == myWordSize) {
				idx = i;
				isSame = true;
			}
		}
		if (isSame) {
			int firstIdx = idx;
			int lastIdx = idx + myWordSize - 1;

			System.out.print("변경할 단어 입력 : ");
			String changeWord = scan.next();

			char[] temp = textArray;
			String front = "";
			for (int i = 0; i < firstIdx; i++) {
				front += temp[i];
			}
			String back = "";
			for (int i = lastIdx + 1; i < temp.length; i++) {
				back += temp[i];
			}
			String result = front + changeWord + back;
			System.out.println(result);
		} else {
			System.out.println("해당 단어는 존재하지 않습니다.");
		}
		scan.close();
	}

}
