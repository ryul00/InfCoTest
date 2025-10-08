package array03;

import java.util.Scanner;
//1:가위, 2:바위, 3:보
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		
		
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0; i<n; i++) {
			b[i] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {			
			if((b[i]==1 && a[i]==2) || (b[i]==2 && a[i]==3) || (b[i]==3 && a[i]==1) ) {
				System.out.println("A");
			}
			else if (a[i] == b[i]) {
				System.out.println("D");
			}
			else {
				System.out.println("B");
			}
		}
		

	}

}
