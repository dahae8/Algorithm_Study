package Quz1;

import java.util.Scanner;

public class quz29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			if(i!=n) {
				for(int j = 1; j <= n-i; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
				for(int j = 1; j <=2*i-2; j++) {
					if(j<2*i-2) {
						System.out.print(" ");						
					}else {
						System.out.print("*");		
					}
				}
			}else {
				for(int j = 1; j <= 2*i -1 ; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}		
	}
}