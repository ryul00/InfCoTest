package String05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer = "";
		String str = sc.nextLine();
		char[] ch = str.toCharArray(); // 문자열을 char[] 배열로 만듦
		// 양극단 인덱스 포인터
		int left = 0; 
		int right = ch.length-1;
		
		while(left < right) {
			if(!Character.isAlphabetic(ch[left])) { //왼쪽 포인터가 알파벳이 아니면 건너뜀
				left++;
				continue;
			}
			
			if(!Character.isAlphabetic(ch[right])) { //오른쪽 포인터가 알파벳이 아니면 건너뜀
				right--;
				continue;
			}
			// 양쪽 포인터 모두 알바펫이면 서로 위치 교환하고 계속 각각 포인터 증감
			if(Character.isAlphabetic(ch[left]) && Character.isAlphabetic(ch[right])) {
				char temp = ch[left];
				ch[left] = ch[right];
				ch[right] = temp;
				left++;
				right--;
			}
		}
		// 완성된 문자(char) 배열을 새로운 문자열(str)로 변환(생성)
//		String result = new String(ch);
		answer = String.valueOf(ch);
		System.out.println(answer);

	}

}
