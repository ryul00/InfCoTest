package String06;

import java.util.LinkedHashSet;
import java.util.Scanner;

//설명
//소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
//중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
//
//입력
//첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.
//
//출력
//첫 줄에 중복문자가 제거된 문자열을 출력합니다

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
		
		
		char[] arr = inp.toCharArray(); // 입력받은 문자열 단일 문자 배열로 변환
		LinkedHashSet<Character> set= new LinkedHashSet<Character>(); // 중복 허용X 하는 LinkedHashSet 사용
		
		// set에 각 문자 추가
		for(char c : arr) {
			set.add(c);
		}
		// 분할된 문자들을 stringBuilder로 문자열로 통합
		StringBuilder sb = new StringBuilder();
		for(char c : set) {
			sb.append(c);
		}
		String result = sb.toString();
		
		System.out.println(result);

	}

}
