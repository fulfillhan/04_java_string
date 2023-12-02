package step4_01.string;

import java.util.Scanner;

/*
 * 
 * # 문자열 비교 메서드 equals();
 * 
 * - 문자열은  == 로 비교하지 않고 equals()메소드를 이용하여 비교한다.
 * 
 * */

public class StringEx02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String name = "Tim";
		System.out.print("이름 : ");
		String getName = scan.next();
		
		//비교불가
		if (name == getName) {
			System.out.println("[== 연산자] 이름 일치");
		}
			else
				System.out.println("[== 연산자] 이름 불일치");
		
		//비교가능( 기능의 도움을 얻어야함)
				if (name.equals(getName)) {// 주소 비교 x ->  진짜 글자 비교
					System.out.println("[== equals] 이름 일치");
				}
					else
						System.out.println("[==equals] 불일치");
		
		//(참고로) 문자열이 같지 않은 경우는 !연잔자를 사용한다.
				if (!name.equals(getName)) {
					
				}
		
		scan.close();
		
		
		
		
	}
	
}
