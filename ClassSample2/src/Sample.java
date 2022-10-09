import java.util.Scanner;

public class Sample {
	
	public static void main(String a[]) {
		
		int num1;
		int num2;
		
		System.out.println("Enter 2 number : ");
		Scanner scan=new Scanner(System.in);
		num1=scan.nextInt();
		num2=scan.nextInt();
		
		int num3=300;
		int num4=400;
		
		Sum s=new Sum();
		Sum s1=new Sum();
		
		s.sum(num1,num2);
		s.display();
		
		
		s1.sum(num3, num4);
		s1.display();
		 
		
		
	}

}
