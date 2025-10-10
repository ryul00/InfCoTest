package array07;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] score = new int[n];
		int cnt = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int intScore = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 1) {
				cnt++;
				score[i] = cnt;
			}else {
				cnt = 0;
			}
			
			intScore += score[i];
			
		}
		System.out.println(intScore);
		

	}

}
