package array05;

import java.util.Scanner;

public class Main {
	// 이 방식은 논리는 맞지만 시간 초과 발생
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		int arr[] = new int[n];
		
		for(int i=2; i<=n; i++) {
			boolean isPrime = true; // 매 숫자마다 초기화
			// 소수가 아닌 경우 필터링
			for(int j=2; j<=i-1; j++) {
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
			// 필터링 거치고 소수인 경우에만 개수늘림
			if (isPrime) {
				cnt++;
			} 
		}
		
		System.out.println(cnt);

	}

}
