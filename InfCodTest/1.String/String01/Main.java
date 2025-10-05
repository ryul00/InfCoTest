package String01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S1 = sc.next();
		String S2 = sc.next();
		S1 = S1.toLowerCase();
		S2 = S2.toLowerCase();
		
		int cnt = 0;
		
		
		for(int i=0; i<S1.length(); i++) {
			char ch = S1.charAt(i);
			
			if(ch == S2.charAt(0)) {
				cnt++;
				
			}
		}
		
		System.out.println(cnt);

}

}
