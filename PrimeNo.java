package java_assignment;

import java.util.Scanner;

public class PrimeNo {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int n = 0;
		System.out.println("enter a");
		int a=s1.nextInt();
		
		for (int i = 1; i <=a ; i++) {
			if (n%i==0) {
				System.out.println("is a prime no");
			}
				else {
					System.out.println("is not a prime no");
				}
				
			}
		}
		
		
	}


