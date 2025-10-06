package String03;

import java.util.Scanner;

//설명
//한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
//문장속의 각 단어는 공백으로 구분됩니다.
//
//입력
//첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.
//
//출력
//첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한
//
//단어를 답으로 합니다
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
