package step4_01.string;

import java.util.Random;
import java.util.Scanner;

/*
 * # 타자연습 게임[1단계]
 * 
 * 1. 문제를 섞는다.(shuffle)
 * 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
 * 예)
 * 문제 : mysql
 * 입력 : mydb
 * 문제 : mysql
 * 입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
 * 문제 : jsp
 */

public class StringEx09_연습 {
	
	public static void main(String[] args) {
		Random ran =  new Random();
		Scanner scan = new Scanner(System.in);
		
		String[] words = {"java", "mysql", "jsp", "spring"};
		int length = words.length;
		
		for (int i = 0; i < 10; i++) {
			int r = ran.nextInt(length);// 0~3 만큼의 랜덤 숫자
			
			String temp = words[0];
			words[0] = words[r];
			words[r] = temp;
		}
		// 반복문
		int i = 0;
		while (i < words.length) {
			System.out.println("문제 : "+ words[i]);
			System.out.print("입력 : ");
			String myAnswer = scan.next();
			
			//내가 myAnswer 와 words[] 와 비교하여 정답을 맞추면 다음문제 제시
			if (words[i].equals(myAnswer)) {
				i++;
			}
		}
		System.out.println("== 문제 끝==");
		scan.close();
	}
}

