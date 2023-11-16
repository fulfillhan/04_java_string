package step4_01.string;
//1차  2023-11-15
//2차 2023-11-16  -> 혼자 다시 해보기
import java.util.Arrays;


public class StringEx07_연습 {
	public static void main(String[] args) {
		// 문제) 이름은 name배열에 성적은 score배열에 각각 저장 및 출력
		
				String str = "김철수/87,이만수/42,이영희/95";
				
				String[] name = new String[3];
				int[] score = new int[3];
				
				//"," 구분자 떼어주기
				String [] temp = str.split(",");// 김철수/87 이만수/42 이영희/95
				
				for (int i = 0; i < temp.length; i++) {
					// "/" 구분자 떼어주기
					
					// -> 여기서 부터 다시 해보기!!
					String [] temp2 = temp[i].split("/");// 김철수87 이만수42 이영희95
					name[i] = temp2[i];
					score[i]= Integer.parseInt(temp2[i]);
				}
				System.out.println(Arrays.toString(name));
				System.out.println(Arrays.toString(score));
				
				
	}

}

