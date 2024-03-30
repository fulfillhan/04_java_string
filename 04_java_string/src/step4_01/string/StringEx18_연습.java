package step4_01.string;
//2024-02-02
import java.util.Random;
import java.util.Scanner;

/*

	# 영어단어 맞추기  
	
	1) 영어단어가 전부 * 로 표시된다. 
	2) 영어단어를 입력받을때마다 (틀릴때마다) 랜덤으로 한글자씩 벗겨진다. (점수는 100점 만점이며 한번 틀릴때마다 5점씩 감점)
	3) 만약에 같은 철자가 여러개면 한번에 벗겨진다. 
	4) 전부 벗겨지거나 맞추면 종료하고 점수를 화면에 출력한다.

*/
public class StringEx18_연습 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int score = 100;
		String word = "performance";
		String meaning = "공연";
		int isChecked[] = new int[word.length()];//* 벗긴 영단어 ischecked 에 저장하기
		
		while(true) {
			//입력받기-> 랜덤으로 영단어 벗기기 - > 틀리면 cnt 감점
			int cnt = 0;
			
			for (int i = 0; i < word.length(); i++) {
				
			}
			
			//문제 나타내기
			System.out.println("뜻 : "+meaning);
			System.out.print("문제 : ");
			for (int i = 0; i < word.length(); i++) {
				
			}
			System.out.println();
			
			System.out.println("영단어 입력하세요 : ");
		    String myAnswer = scan.next();
			
		    //내가 입력한 값이랑 같지 않다면
		    
			
			
			
		}
		
		
		
	}

}
