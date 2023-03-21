package java_assignment;

import java.util.Scanner;

public class Greaternumber {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a  ");
		int a=scanner.nextInt();
		System.out.println("enter b  ");
		int b=scanner.nextInt();
		System.out.println("enter c  ");
		int c=scanner.nextInt();
		
		
		if (a>b&&a>c) {
			System.out.println("a is greater");
			
		}	
			else if (b>a&&b>c) {
				System.out.println("b is greater");
				
			 
				
			}
			else {
				System.out.println("c is greater");
			}
			
		}
		
	}


