package Quz1;

import java.util.Scanner;

public class quz28 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {				
				if(j==i) {
					System.out.print("*");
				}else {					
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
