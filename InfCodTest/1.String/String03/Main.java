package String03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String ans = ""; // 정답 단어
		int max = Integer.MIN_VALUE; // 정답 단어의 개수
		String arr[] = str.split(" "); // 입력받은 문장을 공백 기준으로 분할하여 단어로 만들고, 문장 배열에 넣음 
		
		for(String x : arr) {
			int len = x.length(); // 각 단어의 길이 
			if(len > max) { // 각 단어를 순회하며 최대 길이 갱신
				max = len;
				ans = x;
			}
		}
		System.out.println(ans);
		
		
		

	}

}
