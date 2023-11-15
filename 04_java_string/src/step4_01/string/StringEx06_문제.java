package step4_01.string;

//# 문자열 1차원

public class StringEx06_문제 {

	public static void main(String[] args) {
		
		String str = "11/100/89";
		// 문제 1) arr 배열에 각 점수를 저장하고, 총점 출력
		// 정답 1) 200
		int[] arr = new int[3];
		
		// 먼저 "/" 를 분리시키기
		String [] temp = str.split("/");// String [] temp ={1,1,1,0,0,8,9}
		
		int total = 0;
		for (int i = 0; i < temp.length; i++) {
			arr[i] = Integer.parseInt(temp[i]);// arr[0] =1 arr[1]=1 ...
			total += arr[i];
		}
		System.out.println(total);
		
		
		
		
		
		
		
		// 문제 2) scores 배열의 각 점수를 슬러시를 구분자로 하나의 문자열로 연결
		// 정답 2) 11/100/89  
		//int 정수를 문자열로 변환하기 
		int[] scores = {11, 100, 89};
		
		String text = "";// 빈공간으로 초기화
		
		for (int i = 0; i < scores.length; i++) {
			text = text +Integer.toString(scores[i]); //scores[0] =11 scores[1] = 100 scores[2] = 89
													 //text = ""11""100""89		
													//text 의 유무의 필요성 :  test가 있어야 반영됨.
			if (i != scores.length-1) {// i!= 2(3-1)// i가 2가 아닐때이니깐,, 2제외한 0,1회 돌때는 true적용된다.
				text = text + "/";//11/+100/89
			}
		}
		System.out.println(text);


	}

}
