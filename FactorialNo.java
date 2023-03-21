package java_assignment;

import java.util.Scanner;

public class FactorialNo {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int fact=1;
		System.out.println("enter a");
		int a=s1.nextInt();
		
		for (int i = 1; i <= a; i++) {
		
		fact=fact*i;
		
		}
		
		System.out.println("factorial number is "+fact);
	}

}
