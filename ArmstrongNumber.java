package java_assignment;

import java.util.Scanner;

public class ArmstrongNumber {
public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	
	System.out.println("enter a");
	int a=s1.nextInt();
int power,number=0,b;

while (a!=0) {
	b=a%10;
	System.out.println("b is "+b);	
	a=a/10;
	
	power=b*b*b;
	System.out.println("power is"+power);
	number=number+power;
	System.out.println(number);	
	
	
}


}
}
