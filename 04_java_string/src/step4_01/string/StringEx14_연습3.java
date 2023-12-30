package step4_01.string;

import java.util.Iterator;
//2023-12-30 isCorrect의 초깃값을 false 로 한다면?
/*
 * # 문자열 비교

 *
 *  equals메서드를 사용하지 않고 두 문자열이 같은지 판별하는 코드를 작성해보시오.
 *
 */
//
import java.util.Scanner;

public class StringEx14_연습3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name = "코끼리";

        System.out.print("동물 이름을 입력하세요 : ");
        String myName = scan.next();
        boolean isCorrect = false;

        //글자의 크기를 비교한뒤
        if (myName.length() == name.length()) {
            isCorrect = true; //길이가 같으면 우선 true로 설정
            //한 글자당 비교
            for (int i = 0; i < name.length(); i++) {
                if (myName.charAt(i) != name.charAt(i)) {// 한 글자라도 다르면 false로 설정하고 break
                    isCorrect = false;
                    break;
                }

            }
        }
        if (isCorrect) {
            System.out.println("일치");
        } else {
            System.out.println("불일치");
        }
		scan.close();
    }

}
