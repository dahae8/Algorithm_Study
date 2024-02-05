package Quz1;

import java.util.Scanner;

public class quz21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		int n = sc.nextInt();
		
		for(int i =0;i<n;i++) {
			for(int k=0;k<n-i-1;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.print('\n');
		}
	}
}
