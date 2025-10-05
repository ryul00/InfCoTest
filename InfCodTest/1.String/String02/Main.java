package String02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String ans = "";
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch)) {
				ch = Character.toLowerCase(ch); // 대문자 -> 소문자 변환
			}else {
				ch = Character.toUpperCase(ch);  // 소문자 -> 대문자 변환
			}
			
			ans += ch; // 문자를 단순연산 하면 문자열 
		}
		System.out.println(ans);
		
		
		

	}

}
