package String06_2;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		String[] arr = inp.split("\\s+"); // 단어 공백 기준 분리
		for(String str : arr) {
			set.add(str);
		}
		StringBuilder sb = new StringBuilder();
		for(String str : set) {
			sb.append(str).append(" "); // sb는 공백을 제거하고 추가하므로, 단어 추가시 공백도 함께 추가해야함
		}
		
		String ans = sb.toString();
		System.out.print(ans);

	}

}
