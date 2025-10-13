package array11;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][5]; 
		for(int i=0; i<n; i++) { // 각 학생이 1-5학년까지 몇 반 이었는지
			for(int j=0; j<5; j++) { // 5개 학년
				arr[i][j] = sc.nextInt();
			}
		}
		
		// 비교 로직
		// 기준 학생과 나머지 모든 학생의 학년별 반번호를 비교하여 같은 반이었던 횟수(cnt) 비교
		// 최댓값 업데이트
		// 최댓값을 가지는 i(학생 번호)가 임시 반장
		
		
		//arr[i][j] : i번째 학생의 j학년 반 번호 -> 학년은 1~5
		
		int cnt = 0; // 기준 학생과 같은 반이었던 학생 수
		int max = 0; // 지금까지 같은 반이었던 사람 수 중 최대 값
		int leader = 0; // 임시 반장(같은 반이었던 학생이 가장 많은 사람)
		
		for(int i=0; i<n; i++) { // 기준 학생
			cnt = 0;
			for(int j=0; j<n; j++) { // 비교 대상 학생
				for(int k=0; k<5; k++) { // 학년
					if(arr[i][k] == arr[j][k]) {
						cnt++;
						break;
					}
				}
			}
			if(cnt > max) { // cnt가 무조건 max보다 커야만 바뀌므로 중복일 때 자연스레 최소 i 값으로 리더 결정 
                            // ex: i=0,i=1 모두 cnt가 5이면, 5>5가 false 이므로 그대로 먼저 max로 선정되었던 i=0이 leader로 유지된다.  				
				max = cnt;
				leader = i+1; // 인덱스는 0부터 이므로 +1
			}
		}
		
		System.out.println(leader);
		
		
		
		

	}

}
