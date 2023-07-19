//conditional 
//1.if 2.if-else 3.nested if 
//4.if-elseif ...else ladder
//operation:+,-,*,/,%,<,>,>=,<=,!=,&&,==,||,
import java.util.Scanner;

class Main11
{
		public static void main(String args[])
		{
			int a;
			float b;
                           char c;
                           double d;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the value of a:");
			a=sc.nextInt();
			System.out.println("Enter the value of b:");
			b=sc.nextFloat();
			System.out.println("Enter the value of c:");
			c=sc.next().charAt(0);
			System.out.println("Enter the value of d:");
			d=sc.nextDouble();
			System.out.println("value of a is:"+a);
                            System.out.println("value of b is:"+b);
	                   System.out.println("value of c is:"+c);
                            System.out.println("value of d is:"+d);
			
		}
}
