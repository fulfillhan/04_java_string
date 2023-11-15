package step4_01.string;

public class StringEx06_연습 {
	public static void main(String[] args) {
		String str = "11/100/89";
		
		// 문제 1) arr 배열에 각 점수를 저장하고, 총점 출력
		// 정답 1) 200
		
		int[] arr = new int[3];
		//**"/" split 하기!!!
		   String[] temp1= str.split("/");// String[] temp = {11,100,89}
		
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
		      arr[i]=  Integer.parseInt(temp1[i]);// ex arr[0] = 11 arr[1]=100 arr[2]=89
		      total += arr[i];
		}
		System.out.println("총점 : "+ total+ "점");
		
		// 문제 2) scores 배열의 각 점수를 슬러시를 구분자로 하나의 문자열로 연결
		// 정답 2) 11/100/89  
		
		int[] scores = {11, 100, 89};
		String text = "";// 문자열 기본으로 아무것도 없음.
		
		for (int i = 0; i < scores.length; i++) {
			text += Integer.toString(scores[i]);//String text = 11 100 89
			
			// "/" 구분자로 연결해주기 if문 사용
			if (i != scores.length-1) {
				text += "/";
			}
		}
		System.out.println(text);
	}

}
