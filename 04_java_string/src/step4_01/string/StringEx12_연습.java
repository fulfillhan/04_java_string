package step4_01.string;
//2023-11-26 -> 배열에 대해서 다시 공부해야함
//-> 다시 문제 풀어봐야함...
/*
 * # 쇼핑몰 [장바구니]
 * 1. 로그인 후 쇼핑 메뉴를 선택하면, 다음과 같이 상품목록을 보여준다.
 * 	1) 사과
 *  2) 바나나
 *  3) 딸기
 * 2. 번호를 선택해 상품을 장바구니에 담을 수 있다.
 * 3. 로그인 회원의 인덱스 번호는 각 행의 첫번째 열에 저장한다.
 * 4. 해당 회원이 구매한 상품의 인덱스 번호는 각 행의 두번째 열에 저장한다.
 * 예)
 * {
 * 		{0, 1},				qwer회원 			> 사과구매
 * 		{1, 2},				javaking회원 		> 바나나구매
 * 		{2, 1},				abcd회원			> 사과구매
 * 		{0, 3},				qwer회원			> 딸기구매
 * 		...
 * }
 */

import java.util.Scanner;

public class StringEx12_연습 {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] ids = {"qwer", "javaking", "abcd"};
		String[] pws = {"1111",     "2222", "3333"};
		String[] items = {"사과","바나나","딸기"};
		
		int[][] cart = new int[100][2];
		int itemCnt = 0;
		int identifier = -1;//회원의 인덱스 값 설정
		
		//반복문 만들기
		while (true) {
			System.out.println("-----------------------------");
			System.out.print("상태 : ");
			// 상태만 나타내기
			if (identifier == -1) {
				System.out.println("로그아웃");
			}else  {
				System.out.println(ids[identifier]+ "님, 로그인");
			}
			System.out.println("-----------------------------");
			
			System.out.println("[MEGA MART]");
			System.out.println("[1]로 그 인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]쇼     핑");
			System.out.println("[4]장바구니");
			System.out.println("[0]종     료");
			
			System.out.print("메뉴 선택 : ");
			int selMenu = scan.nextInt();
			
			//로그인 하기
			if (selMenu ==  1) {
				//아이디 먼저 입력하기(문자열로 받기)
				System.out.print("ID : ");
				String myId = scan.next();
				//비번 입력하기(문자열로 받기!!)
				System.out.print("PW : ");
			    String myPw = scan.next();
				
				//for 반목문 사용하여 내가 입력한 아이디, 비번과 저장된 아이디,비번 비교하기
			    //문자열 비교구문
				for (int i = 0; i < ids.length; i++) {
					if (ids[i].equals(myId) && pws[i].equals(myPw)) {
						identifier = i;
					}
				}//조건문으로 출력하는법
				 if (identifier == -1) {
					System.out.println("ID 와 PW를 확인해주세요.");
			 	}else {
					System.out.println(ids[identifier]+"님, 환영합니다.");
				}
				 
			}
			//로그아웃하기
			else if (selMenu == 2) {
				identifier = -1;
				System.out.println("로그아웃 되었습니다.");
			}
			//쇼핑 -> 장바구니의 내용들을 반복문을 사용하여 나열
			else if (selMenu == 3) {
				
				if (identifier == -1) {
					System.out.println("로그인 후 이용해주세요.");
					continue;
				}
				//상품 목록의 반복은 횟수가 정해진건 아니라서 while 반복문 사용
				while (true) {
					
					
					
					
					
				}
			
				
				//선택한 번호를 장바구니에 넣기
				//로그인 회원의 인덱스 번호를 각 행의 첫번째 열에 저장
				//cart[itemCnt][0]= identifier;
				//해당 회원의 구매한 품목의 인덱스 번호를 각 행의 두번째 열에 저장
				//cart[itemCnt][1] = choice;
				//itemCnt++;
				
				/*
				 * System.out.println("< 상품 목록 >"); for (int i = 0; i < items.length; i++) {
				 * System.out.println("[ "+ (i+1)+ "] "+ items[i] + " ");
				 * System.out.println("[ 4 ] 뒤로가기"); } System.out.print("상품 번호를 선택하세요 : "); int
				 * choice = scan.nextInt();
				 */
				
				
			}
			//장바구니 -> 여기 이해가 어려워서 배열 구문 보고오기!!
			else if (selMenu == 4) {
				if (identifier == -1) {//로그아웃 아니면
					System.out.println("ID : "+ ids[identifier]);
				}
				int appleCnt = 0;
				int bananaCnt = 0;
				int berryCnt = 0;
				
				//과일 갯수많큼 장바구니 배열에 과일 넣기
				for (int i = 0; i < itemCnt; i++) {
				if (cart[i][0] == identifier) {
					if (cart[i][1] == 1) {
						appleCnt++;
					}else if (cart[i][1] == 2) {
						bananaCnt++;
					}else if (cart[i][1] == 3) {
						berryCnt++;
					}
				}
				
				System.out.println(items[0]+ " : "+ appleCnt+ "개");
				System.out.println(items[1]+ " : "+ bananaCnt+ "개");
				System.out.println(items[2]+ " : "+ berryCnt+ "개");
					
				}
			
			}
			//시스템 종료
			else if (selMenu == 0) {
				System.out.println("== 프로그램 종료 ==");
				scan.close();
				break;
			}
			
		}
		
	}

}
