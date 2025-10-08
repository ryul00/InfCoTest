package String08_2;

import java.util.Scanner;

//🔹문제 설명
//문자, 숫자, 특수문자가 섞인 문자열이 주어집니다.
//이때 숫자(0~9)만 추출하여,
//앞에서 읽을 때나 뒤에서 읽을 때 같은 숫자 조합이면 "YES",
//아니면 "NO"를 출력하는 프로그램을 작성하세요.
//
//🔹입력 설명
//한 줄에 길이 100 이하의 문자열이 입력된다.
//문자열에는 숫자, 문자, 특수문자가 섞여 있을 수 있다.
//
//🔹출력 설명
//숫자만 추출하여 회문이면 "YES", 아니면 "NO"를 출력한다.

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.next();
		StringBuilder sb = new StringBuilder();
		char[] arr = inp.toCharArray();
		for(char c : arr) {
			if(Character.isDigit(c)) {
				sb.append(c);
			}
		}
		String digit = sb.toString();
		char[] arr2 = digit.toCharArray();
		boolean isPalen = true;
		
		// 펠린드롬 로직
		for(int i=0; i<arr2.length/2; i++) {
			if(arr2[i] == arr2[arr2.length-1-i]) {
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
