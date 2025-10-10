package array05;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int n = sc.nextInt();
//		에라토스테네스의 체
//		0이 소수 / 1은 소수X
		// !! int 배열은 초기 값 미설정 시 0으로 초기화되어 값이 들어감 
		int[] arr = new int[n+1];
		for(int i=2; i<=n; i++) {
			if(arr[i] == 0) {
				count++;
				// i=2일때, j+i= 2 2+2 4+2 6+2....18+2
				for(int j=i; j<=n; j+=i) {
					arr[j] = 1;
				}
			}
		}
		System.out.println(count);
		
		
		
		
		
		
		

		// 이 방식은 논리는 맞지만 시간 초과 발생
//		int cnt = 0;
//		int arr[] = new int[n];
//		for(int i=2; i<=n; i++) {
//			boolean isPrime = true; // 매 숫자마다 초기화
//			// 소수가 아닌 경우 필터링
//			for(int j=2; j<=i-1; j++) {
//				if(i % j == 0) {
//					isPrime = false;
//					break;
//				}
//			}
//			// 필터링 거치고 소수인 경우에만 개수늘림
//			if (isPrime) {
//				cnt++;
//			} 
//		}
//		
//		System.out.println(cnt);

	}

}
