package step4_01.string;
//1차  2023-11-15
import java.util.Arrays;


public class StringEx07_연습 {
	public static void main(String[] args) {
		// 문제) 이름은 name배열에 성적은 score배열에 각각 저장 및 출력
		
				String str = "김철수/87,이만수/42,이영희/95";
				
				String[] name = new String[3];
				int[] score = new int[3];
				
				//"," 구분자 떼어주기
				String[] temp1 = str.split(",");// String[] temp1 = {김철수/87 이만수/42 이영희/95}
				
				for (int i = 0; i < temp1.length; i++) {
					//"/" 떼어주기
				String[] temp2	=temp1[i].split("/");//temp1[0] = 김철수87 temp1[1] = 이만수42 temp1[2] = 이영희95
				name[i] = temp2[0];// name[0] = 김철수 name[1] = 이만수 name[2] = 이영희
				//형 변환 해주기
				score[i] = Integer.parseInt(temp2[1]); //score[0] = 87 score[1] = 42 score[2]= 95
				}
				
				
				System.out.println(Arrays.toString(name));
				System.out.println(Arrays.toString(score));
	}

}

