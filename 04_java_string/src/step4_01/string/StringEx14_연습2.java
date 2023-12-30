package step4_01.string;
//2023-12-30 isCorrect의 초깃값을 true로 한다면?
/*
 * # 문자열 비교

 * 
 *  equals메서드를 사용하지 않고 두 문자열이 같은지 판별하는 코드를 작성해보시오.
 *  
 */
//
 import java.util.Scanner;

public class StringEx14_연습2 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String name = "코끼리";

		System.out.print("동물 이름을 입력하세요 : ");
		String myName = scan.next();
		boolean isCorrect = true;

		// 글자의 크기를 비교한뒤-> true
		if (myName.length() == name.length()) {// 해당 조건이 true라면
			// 한 글자당 비교
			for (int i = 0; i < name.length(); i++) {
				if (myName.charAt(i) != name.charAt(i)) {
					isCorrect = false; 
					break;// 해당 반복문 빠져나오기
				}
			}
		}else {
			isCorrect = false;
		}
		if (isCorrect) {
			System.out.println("일치");
		}else {
			System.out.println("불일치");
		}
	}

}
