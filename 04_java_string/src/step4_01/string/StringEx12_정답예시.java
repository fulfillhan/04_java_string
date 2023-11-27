package step4_01.string;
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

public class StringEx12_정답예시 {
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] ids = {"qwer", "javaking", "abcd"};
		String[] pws = {"1111",     "2222", "3333"};
		String[] items = {"사과","바나나","딸기"};
		
		int[][] cart = new int[100][2];
		int itemCnt = 0;
		int identifier = -1;
		
		while (true) {
			
			System.out.println("-----------------------------");
			System.out.print("상태 : ");
			if (identifier == -1) 	System.out.println("로그아웃");
			else 					System.out.println(ids[identifier] + "로그인");
			System.out.println("-----------------------------");
			
			
			System.out.println("[MEGA MART]");
			System.out.println("[1]로 그 인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]쇼     핑");
			System.out.println("[4]장바구니");
			System.out.println("[0]종     료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if (sel == 1) {
				
				System.out.print("ID: ");
				String myId = scan.next();
				
				System.out.print("PW : ");
				String myPw = scan.next();
				
				for (int i = 0; i < ids.length; i++) {
					if (myId.equals(ids[i]) && myPw.equals(pws[i])) { 
						identifier = i;
					}
				}
				
				if (identifier == -1) 	System.out.println("ID와 PW를 확인해주세요.");
				else 					System.out.println(ids[identifier] + "님, 환영합니다.");
				
			}
			else if (sel == 2) {
				
				identifier = -1;
				System.out.println("로그아웃 되었습니다.");
				
			}
			else if (sel == 3) {
				
				if (identifier == -1) {
					System.out.println("로그인 후 이용 가능합니다."); 
					continue;
					
				}
				
				while (true) {
					
					System.out.println("상품목록");
					for(int i = 0; i < items.length; i++) 
					System.out.println("[" + (i+1) + "] " + items[i]);
					System.out.println("[4]뒤로가기");
					
					System.out.print("상품번호를 선택하세요 : ");
					
					int choice = scan.nextInt();
					
					if (choice == 4) break;
					cart[itemCnt][0] = identifier;
					cart[itemCnt][1] = choice;
					
					itemCnt++;
											
				}
											
			}
			else if (sel == 4) {
				
				if (identifier != -1) {
					System.out.println("id : " +  ids[identifier]);
				}
				int apple = 0;
				int banana = 0;
				int berry = 0;
				
				for (int i = 0; i < itemCnt; i++) {
					if (cart[i][0] == identifier) {
						if		(cart[i][1] == 1) apple++;
						else if (cart[i][1] == 2) banana++;
						else if (cart[i][1] == 3) berry++;
					}
				}
				
				System.out.println(items[0] + " : " + apple + "개");
				System.out.println(items[1] + " : " + banana + "개");
				System.out.println(items[2] + " : " + berry + "개");
				
			}
			else if (sel == 0) {
				
				System.out.println("프로그램 종료");
				scan.close();
				break;
				
			}
			
		}
		

	}

}
