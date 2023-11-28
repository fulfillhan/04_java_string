package step4_01.string;
//2023-11-28

// 선택정열 
/*compare to 구문에 대해서 : 데이터값.compareTo(비교대상)
반환값이 0인 경우: 두 객체는 동일합니다. (equals 메서드의 결과와 동일)
반환값이 음수인 경우: 현재 객체가 비교 대상 객체보다 작다
반환값이 양수인 경우: 현재 객체가 비교 대상 객체보다 크다*/

import java.util.Arrays;
import java.util.Iterator;

public class StringEx13_연습 {

	public static void main(String[] args) {
		
		String[] names = {"홍길동", "김유신", "마동석", "자바킹", "서동요"};
		
		for (int i = 0; i < names.length; i++) {// 배열의 처음부터 끝까지 반복
			
			//최솟값 설정
			String minName = names[i];
			//최솟값의 위치값 설정
			int minIdx = i;
			
			//최솟값 찾기!
			for (int j = i; j < names.length; j++) {
				if (minName.compareTo(names[j]) > 0 ) {// compare to 문자열 비교 수행
					//-> 비교값이 크다는건 뒤에 있는 글자이라는것이고, 해당 조건이 true 면 수행.
					minName = names[j];// 최솟값 업데이트 해주기
					minIdx = j;//최솟값의 인덱스 업데이트
				}
			}
			// 찾은 최솟값으로 재배열 시키기
			String temp = names[i];
			names[i] = minName;
			names[minIdx] = temp;
		}
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i]+ " ");
		}
			
	}
	
}
			
			
			

