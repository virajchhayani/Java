import java.util.*;
 
class Main5
{
    	public static void main(String i[])
    	{
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter Name");
    	String name=sc.nextLine();
    	System.out.println("Enter Number 1: ");
    	int a = sc.nextInt();
    	System.out.println("Enter Number 2: ");
    	int b = sc.nextInt();
    	System.out.println("Name is "+name);
    	System.out.println("Sum is "+(a+b));
    	System.out.println("Subtraction is "+(a-b));
    	System.out.println("Multiplication is "+(a*b));
    	System.out.println("Division is "+(a/b));
    	}
}
