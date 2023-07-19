import java.lang.*;
import java.io.*;

class e1
{
	public static void main(String argos[])
	{
	try
	{
		int a=10,b=0;
		System.out.println(a/b);
	}
	catch(ArithmeticException a1)
	{
		System.out.println(a1);
	}
	finally
	{
		System.out.println("Execute every time");
	}
}
}
