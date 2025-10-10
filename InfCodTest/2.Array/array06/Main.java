package array06;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] ans = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			String strInp = Integer.toString(arr[i]);
			StringBuilder sb = new StringBuilder(strInp).reverse();
			ans[i] = Integer.parseInt(sb.toString());
		}
		
		
		for(int i=0; i<ans.length; i++) {
			if(isPrime(ans[i]) == true) {
				System.out.print(ans[i] + " ");
				}
			}

	}
	// 소수 판별 메서드 
	// 0,1은 무시 
	// 반복문 조건: i*i <= num
	//	→ i가 √num보다 커지면 반복문 종료
	//	반복문 안에서는 나누어떨어지는 경우만 false 반환
	//	반복문 끝까지 안 나눠지면 true → 소수
	//	실제로 큰 쪽 약수는 검사할 필요 없음.
	//	예: 18 = 2 × 9, 3 × 6 → 작은 쪽 2, 3만 검사하면 충분
	public static boolean isPrime(int num) {
		if(num < 2) {
			return false;
		}
		for(int i=2; i*i <= num ; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
		
		
		
	}


