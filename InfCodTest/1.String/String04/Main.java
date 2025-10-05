package String04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String word = ""; // 입력받을 단어 정의
		for(int i=0; i<n; i++) {
			word = sc.next();
			StringBuilder sb = new StringBuilder(word); // sb 클래스로 변환
			sb.reverse().toString(); // 단어 뒤집기(char) -> str로 변환
			System.out.println(sb);
		}
		
	}

}
