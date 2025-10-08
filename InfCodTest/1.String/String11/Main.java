package String11;

import java.util.Scanner;

//설명
//알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
//문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
//단 반복횟수가 1인 경우 생략합니다.
//
//입력
//첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
//
//출력
//첫 줄에 압축된 문자열을 출력한다.

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.next();
		StringBuilder sb = new StringBuilder();
		char arr[] = inp.toCharArray();
		int cnt = 1;		
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] == arr[i+1]) {
				cnt++;
			}else {
				sb.append(arr[i]);
				if(cnt!=1) {
					sb.append(cnt);
				}
				cnt=1;
			}
		}
		// 중요!!! 배열의 마지막 요소 처리
		// 배열 순회시 arr[len-1]전 까지만 순회하므로 마지막 요소는 다음 문자가 없음, 따라서 else문을 실행하지못해 순회 결과를 추가하지 못함
		// 따라서 순회 종료 후 따로 추가해줘야함
	    sb.append(arr[arr.length - 1]);
	    if(cnt!=1) {
	    	  sb.append(cnt);
	    }
	  		String res = sb.toString();
		System.out.println(res);

	}

}
