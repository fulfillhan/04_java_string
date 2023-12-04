package step4_01.string;

import java.awt.ComponentOrientation;
import java.util.Scanner;

//2023-12-03  -> 깨달은 점 :  조건문으로 () 논리연산자를 사용할 때 항상 그 기준이 있다. 지금까지 연습해왔을때
//예를 들어 correctCnt와 같이 회수가 증가함으로서 변화된 횟수를 기점으로 조건문을 대부분 사용해왔다.


/*
 * # 문자열 속 숫자검사
 * 
 * 예) adklajsiod 
 * 	     문자만 있다.
 * 예) 123123
 *    숫자만 있다.
 * 예) dasd12312asd
 *    문자와 숫자가 섞여있다.
 */


public class StringEx15_연습 {
	
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		char[] charNum = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		int correctCnt = 0;
		
		System.out.print("입력 : ");
		String text = scan.next();
		
		//charNum와 내가 입력한 문자열 속 맞는게 있는지 확인 맞다면 correctCnt +1씩 증가
        for (int i = 0; i < charNum.length; i++) {
			for (int j = 0; j < text.length(); j++) {
				if (charNum[i] == text.charAt(j)) {
					correctCnt++;
				}
			}
		}
        //correctCnt 기준으로 구분하기
        if (correctCnt == text.length()) { //만약 correctCnt 수가 문자열의 길이와 같다면 -> 모두 있다면
        	System.out.println("숫자만 있다.");
			
		}else if (correctCnt == 0) {       //모두 없다면
			System.out.println("문자만 있다");
		}
		else {
			System.out.println("문자와 숫자가 섞여있다.");
		}
        scan.close();
	}

}
