//nestedif
import java.util.*;
class Main17
{
    	public static void main(String args[])
    	{
           	Scanner sc=new Scanner(System.in);
           	int a,b,c;
           	a=sc.nextInt();
           	b=sc.nextInt();
           	c=sc.nextInt();
           	if(a>b&&a>c)
           	{
           		System.out.println(a+"is largest than "+b+" and "+c);
           	}
           	if(b>c)
           	{
                   	System.out.println(b+"is larger "+a+" and "+c);
           	}
           	else
           	{
                   	System.out.println(c+"is larger "+a+" and "+b);
           	}
           	}
}
 
