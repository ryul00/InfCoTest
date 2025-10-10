package array09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
// 시간부족으로 BufferedReader 사용해야함
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());  // n 입력
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int[][] arr = new int[n][n];
		
        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
		
//		for(int i=0; i<n; i++) {
//			for(int j=0; j<n; j++) {
//				arr[i][j] = sc.nextInt();
//			}
//		}
        
		// 행 최대 합
		for(int i=0; i<n; i++) {
			sum = 0;
			for(int j=0; j<n; j++) {
				sum += arr[i][j]; 
			}
			max = Math.max(max, sum);
		}
		// 열 최대합
		for(int i=0; i<n; i++) {
			sum = 0;
			for(int j=0; j<n; j++) {
				sum += arr[j][i]; 
			}
			max = Math.max(max, sum);
		}
		// 대각선은 단일 반복문이므로 sum을 반복문 밖에서 초기화해야함
		// 안그러면 대각선 전체 합이 아닌 대각선의 각 요소합만 sum으로 적용하여 최대값을 구하기에 전체 비교에서 누락됨 
		// 주 대각 최대합
		//00 11 22 33 44
		sum = 0;
		for(int i=0; i<n; i++) {
			sum += arr[i][i];
			max = Math.max(max, sum);
		}
		
		// 역 대각 최대합
		//04 13 22 31 40
		sum = 0;
		for(int i=0; i<n; i++) {
			sum += arr[i][n-1-i];
			max = Math.max(max, sum);
		}
		System.out.println(max);

	}

}
