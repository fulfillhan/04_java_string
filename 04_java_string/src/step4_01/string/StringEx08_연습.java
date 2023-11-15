package step4_01.string;
//1차 2023-11-15

public class StringEx08_연습 {
	

	public static void main(String[] args) {
		
		// 문제) 이름과 성적을 하나의 문자열로 연결
		// 정답) "김철수/87,이만수/42,이영희/95"
		
		String[] name = {"김철수", "이만수", "이영희"};
		int[] score = {87, 42, 95};
		
		String str = "";
		
		for (int i = 0; i < name.length; i++) {//name[0]  name[1]  name[2] ..
			str += name[i]+"/"+ score[i]; //str i =0 김철수87 i=1 이만수42 i=3 이영희
			
			//"," 구분자 넣어주기
			if (i != name.length-1 ) {
				str += ",";
			}
		
		}
		System.out.println(str);

	}


}
