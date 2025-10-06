package String07;

import java.util.Scanner;
//설명
//앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
//문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
//단 회문을 검사할 때 대소문자를 구분하지 않습니다.
//
//입력
//첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
//
//출력
//첫 번째 줄에 회문 문자열인지의 결과를 YES 또는 NO로 출력합니다

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
		inp = inp.toLowerCase();
		char[] arr = inp.toCharArray();
	
		boolean isPalen = true;
		for(int i=0; i<arr.length/2; i++) {
			
			if(arr[i] == arr[arr.length-1-i]) {
				isPalen = true;
			}else {
				isPalen = false;
				break;
			}
		}
		if(isPalen == true) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		

	}

}
