package step4_01.string;

import java.util.Scanner;

/*
 * # 끝말잇기 게임
 * 
 * 제시어 : 자전거
 * 입력 : 거미
 * 제시어 : 거미
 * 입력 : 미술
 * 제시어 : 미술
 * 입력 : quit
 * 
 * - 종료 -
 * 
 */


public class StringEx10_연습 {
	
public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		
		String start = "자전거";
		
		while (true) {
			int length =  start.length();
			System.out.println("제시어 : " + start);
			
		    System.out.print("입력 : ");
		    String myAnswer = scan.next();
		    
		   
		    if (myAnswer.equals("quit")) {
				System.out.println("- 끝 -");
				break;
			}
		    
		    // 제시어 맨 뒤에 있는 글자와 내가 입력한 첫글자와 동일해야지 넘어감
		    
		    if (start.charAt(length-1) == myAnswer.charAt(0)) {
				start = myAnswer;
			}
		   
		}
		
		scan.close();
	}

}
