package step4_01.string;


/*
 * # 문자열 비교

 * 
 *  equals메서드를 사용하지 않고 두 문자열이 같은지 판별하는 코드를 작성해보시오.
 *  
 */

import java.util.Scanner;

public class StringEx14_연습 {
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String name = "코끼리";
		
		System.out.print("동물 이름을 입력하세요 : ");
		String myName = scan.next();
		
		if (myName.compareTo(name) == 0) {
			System.out.println("일치");
		}
		else {
			System.out.println("불일치");
		}

	}


}
