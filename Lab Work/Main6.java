import java.util.*;
 class Main6
{
    	public static void main(String i[])
    	{
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter Name");
    	String name=sc.nextLine();
    	System.out.println("Enter Number 1: ");
    	Float a = sc.nextFloat();
    	System.out.println("Enter Number 2: ");
    	Float b = sc.nextFloat();
    	System.out.println("Name is "+name);
    	System.out.println("Sum is "+(a+b));
    	System.out.println("Subtraction is "+(a-b));
    	System.out.println("Multiplication is "+(a*b));
    	System.out.println("Division is "+(a/b));
    	}
}
