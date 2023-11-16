package step4_01.string;

import java.util.Arrays;

public class StringEx07_문제 {

	public static void main(String[] args) {
		
		// 문제) 이름은 name배열에 성적은 score배열에 각각 저장 및 출력
		
		String str = "김철수/87,이만수/42,이영희/95";
		
		String[] name = new String[3];
		int[] score = new int[3];
		
		String [] temp1 = str.split(",");
		for (int i = 0; i < temp1.length; i++) {// 김철수/87 이만수/42 ..
			// "/" 빼주기
			String [] temp2 = temp1[i].split("/");
			// 김철수87 이만수42...
			//name[] 각 배열에 이름만 넣기
			name[i]= temp2[0];
			//score[] 각 배열에 점수만 넣기 ** score은 타입 int이니까 String temp2를 형변환 하기
			score[i] = Integer.parseInt(temp2[1]);
		}
		//[김철수, 이만수, 이영희]
		//[87, 42, 95]
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(score));
		
		
		/*
		 * //김철수 이만수 이영희
		 * for (int i = 0; i < name.length; i++) {
		 *  String names = name[i];
		 *  System.out.print(names+ " "); }
		 */
		
		/*
		 * for (String names : name) 
		 * { System.out.print(names+ " "); }
		 */
		 
		/*
		 * for (int scores : score) { System.out.print(scores+ " "); }
		 */
				
		
		

	}

}
