package javaSession;

import java.util.Scanner;

public class LoopsConcept {

	public static void main(String[] args) {
		
		/*Write a program to print the following pattern using for loop:

			00 01 02 03 04 05 06 07 08 09 
			10 11 12 13 14 15 16 17 18 19 
			20 21 22 23 24 25 26 27 28 29 
			30 31 32 33 34 35 36 37 38 39 */
		
		
		for (int i=0; i<=3;i++) {
			for(int j=0; j<=9;j++) {
				System.out.print(i+""+j+" ");
			}
			System.out.println();
		}
		
		/*
		 * Write a program to print following pattern.
		 *  *
		 *  **
		 *  ***
		 *  ****
		 *  *****
		 */
		
		for (int m=0; m<=3; m++) {
			for (int n=0; n<=m; n++) {
				System.out.print(n);
			}
			System.out.println();
			
		}
		
		System.out.println("------------------****************--------------------");
		
		/*
		 * write a program to print following pattern
		 *  ****
		 *  *  *
		 *  *  *
		 *  ****
		 */
		
		for (int a=1; a<=5; a++) {
			for (int b=1; b<=5; b++) {
				if (a==1 || b==1 || a==5 || b==5) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	

}
