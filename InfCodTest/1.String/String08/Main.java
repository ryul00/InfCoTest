package String08;

import java.util.Scanner;

//설명
//앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
//문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.
//단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.
//알파벳 이외의 문자들의 무시합니다.
//
//입력
//첫 줄에 길이 100을 넘지 않는 공백이 있는 문자열이 주어집니다.
//
//출력
//첫 번째 줄에 팰린드롬인지의 결과를 YES 또는 NO로 출력합니다.

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
		// 입력 값 전처리
		char[] arr = inp.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(char c : arr) {
			if(Character.isAlphabetic(c)== true) { //알파벳인 애들만 sb에 넣음
				sb.append(c);
			}
		}
		String inp2 = sb.toString().toLowerCase(); // sb를 다시 문자열로 변환 + 대소문자 필터링
		
		// 팰린드롬 로직 시작
		char[] arr2 = inp2.toCharArray(); 
		boolean isPalen = true;
		for(int i=0; i<arr2.length/2; i++) {
			if(arr2[i] == arr2[arr2.length-1-i]) {
				isPalen = true;
			}else {
				isPalen = false;
				break; // 유의!! 오답이면 무조건 break로 빠져나가야함
			}
		}
		if(isPalen == true) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		

	}

}
