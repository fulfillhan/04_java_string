package step4_01.string;
//2023-11-17

import java.util.Scanner;

/*
 * # 쇼핑몰 [관리자]
 * 
 * 1. 카테고리와 아이템을 입력받아 아래의 예시와 같이 저장한다.
 * 2. 카테고리는 각 행의 첫번째 열에 저장한다.
 * 3. 아이템은 각 행의 두번째 열에 저장한다.
 *    단, 아이템은 여러개를 추가할 수 있도록 슬러시(/)를 구분자로 연결해준다.
 * 예)
 * {
 * 		{"과일", "사과/포도/"},
 * 		{"과자", "홈런볼/쪼리퐁/"},
 * 		{"음료", "콜라/"},
 * 		{"육류", "소고기/"}
 * 		...
 * } 
 */

public class StringEx11_풀이 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[][] items = new String[100][2];// item 의 배열 선언
		for(int i = 0; i < items.length; i++) {// [  i ,j   ][  i ,j  ][  i ,j   ]...
			items[i][0] = "";
			items[i][1] = "";
		}
		
		int itemCnt = 0;
		
		while(true) {// 무한 반복

			System.out.println("[관리자 모드]");
			System.out.println("[1]카테고리 관리");
			System.out.println("[2]아 이 템  관리");
			System.out.println("[3]전체품목 출력");
			System.out.println("[4]종료");
			
			System.out.print("번호 입력 : ");
			int sel = scan.nextInt();
			
			//카테고리 관리->추가할 카테고리 입력 : 
			if (sel == 1) {
				
				
			}
			//아이템 관리 -> 카테고리를 먼저 선택후 아이템을 추가한다.
			else if (sel == 2) {
				
			}
			//전체 품목 -> 출력시( ex :출고품목 : 사과/메론/) 구분자 사용한다.
			else if (sel == 3) {
				
			}
			else if (sel == 4) {}
			
		}
		
	}

}
