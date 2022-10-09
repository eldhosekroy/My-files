package function;

import java.util.Scanner;

public class FunctionSample {
	
	public static void main(String a[]) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter 2 number to find sum : ");
		
		int num1=s.nextInt();
		int num2=s.nextInt();
		
		int result=sum(num1,num2);
		
		System.out.println("Sum is "+result);
		
	}
	static int sum(int a,int b) {
		int s=a+b;
		return s;
	}

}
