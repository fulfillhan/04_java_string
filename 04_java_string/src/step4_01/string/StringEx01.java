package step4_01.string;

import java.util.Scanner;

/*
 * 
 * # 문자열 입력
 * 
 *  next() : 공백을 기준으로 한단어만 입력받는다.
 * 
 * */

public class StringEx01 {

	public static void main(String[] args) {
		
		Scanner scan =  new Scanner(System.in);
		
		System.out.print("이름 : ");
		String getName = scan.next(); //공백을 제외한 글자를 입력받는다.
		//String getName = scan.nextLine(); //공백을 포함한 글자를 입력받는다.-> 호환성이 떨어짐 EX ) nextInt()
		
		System.out.println();
		System.out.println("입력하신 이름은"+ getName+"입니다.");
		///scan.next(); scan.nextInt();
		scan.close();
		
	}

}
