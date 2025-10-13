package array10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n+2][n+2];
		// 격자판 넓이를 입력 값보다 1씩 크게 잡고, 실제 입력은 1~n까지만 받으면 가장 자리는 0으로 초기화
		// 가장자리에 값이 생기면 인덱스 오류 X
		for(int i=1; i<n+1; i++) {
			for(int j=1; j<n+1; j++) {
				arr[i][j] = sc.nextInt();
				
			}
		}
		// 0 초기화 확인
//		for(int i=0; i<n+2; i++) {
//			System.out.println();
//			for(int j=0; j<n+2; j++) {
//				System.out.print(arr[i][j]);
//				
//			}
//		}
		
		int cnt = 0;
		for(int i=1; i<n+1; i++) {
			for(int j=1; j<n+1; j++) {
				if((arr[i][j] > arr[i-1][j]) && (arr[i][j] > arr[i+1][j]) && 
					(arr[i][j] > arr[i][j-1]) && (arr[i][j] > arr[i][j+1])) {
					cnt++;
				}	
			}
		}
		System.out.println(cnt);

	}

}
