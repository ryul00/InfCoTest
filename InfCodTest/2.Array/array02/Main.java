package array02;

import java.util.Scanner;

//설명
//선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는
//선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)
//
//입력
//첫 줄에 정수 N(5<=N<=100,000)이 입력된다. 그 다음줄에 N명의 학생의 키가 앞에서부터 순서대로 주어진다.
//
//출력
//선생님이 볼 수 있는 최대학생수를 출력한다

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int cnt = 0;
		int max = 0;
		//순서가 정렬된 상태이므로 최댓값 갱신해가면서 비교하면 됌
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] > max) {
				cnt++;
				max = arr[i];
			}
		}
		
		System.out.println(cnt);

	}

}
