package String10;

import java.util.Scanner;

//설명
//한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
//
//입력
//첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
//문자열의 길이는 100을 넘지 않는다.
//
//출력
//첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next ();
		String t = sc.next();
		char ch = t.charAt(0);
		int[] ans = new int[s.length()]; // 정답 배열 정의
		
		char[] arr1 = s.toCharArray();
		
		// 중요!!!
		// 큰 수 초기화 목적 : 아직 타겟 값을 만나지 않은 것을 의미, 0으로 초기화 할 경우 타겟위치를 모르는데 p가 1,2,3.. 형태로 되어 계산 오류 남.
		// p는 각 배열 요소의 위치
		int p = 1000;
		
		for(int i=0; i<s.length(); i++) {
			if(arr1[i] != ch) { // 입력 배열이 타겟과 다르면 위치 증가
				p++;
				ans[i] = p;
			}else { //타겟과 동일하면 0으로 초기화
				p=0; 
				ans[i] = p;
			}
		}
		
		// 좌->우 계산 종료 시 반드시 p값 동일하게 초기화 
		// 반대 방향 계산 이유 : 문제는 최단 거리에 있는 타겟과의 거리를 구하는 것이므로 
		// 반대로도 계산해서 두 가지 방향 값 중 최소 값을 정답 배열에 넣음
		p = 1000;
		for(int i=s.length()-1; i>=0; i--) {
			if(arr1[i] != ch) {
				p++;
				if(p < ans[i]) {
					ans[i] = p;
				}
			}else {
				p=0;
				ans[i] = p;
			}
		}
		
		for(int i=0; i<s.length(); i++) {
			System.out.print(ans[i] + " ");
		}
		

	}

}
