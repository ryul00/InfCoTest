package array08;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] seq = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			int cnt = 1; // 한 명 점수 비교 끝날때마다 초기화해주기
			for(int j=0; j<n; j++) {
				// 점수 비교, 자신의 점수를 자신을 제외한 다른 점수들과 비교해서 자기보다 높은 점수 개수를 계산(cnt)
				// 자기보다 높은 점수 개수를 계산하므로 공동 순위도 자동 적용
				// ex 92 92 92 80 일때 92는 모두 1등이고, 80은 자기보다 높은 점수가 3개이므로 1+3=4등
				if(i!=j && arr[i] < arr[j]) {
					cnt++;
				}
			}
			// 점수 비교 후 cnt 결과를 등수 배열에 더함(기존 초기 등수 1에 더해야하므로 단순 대입이 아닌 + 해줘야함)
			seq[i] += cnt; 
		}
		for(int i=0; i<n; i++) {
			System.out.print(seq[i] + " ");
		}

	}

}
