package String05_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.next();
		char[] arr = inp.toCharArray();
		int left = 0;
		int right = arr.length-1;
		
		String ans = "";
		
		while(left < right) {
			if(!Character.isDigit(arr[left])) {
				left++;
				continue;
			}
			if (!Character.isDigit(arr[right])) {
				right--;
				continue;
			}
			if(Character.isDigit(arr[left])&&Character.isDigit(arr[right])) {
				char temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}			
		}
		
		ans = String.valueOf(arr);
		System.out.println(ans);
		
		
		

	}

}
