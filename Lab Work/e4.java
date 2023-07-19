// nesttry block

import java.lang.*;
import java.io.*;

class e4
{
	public static void main(String args[])
	{
		try
		{
			try
			{
				int a=10,b=0;
				System.out.println(a/b);
			} 
			catch (ArithmeticException e4) 
			{
       			System.out.println(e4);
			}
			try
			{
				int[] arr = {1, 2, 3};
        			System.out.println(arr[3]);
			} 
			catch (ArrayIndexOutOfBoundsException e4) 
			{
       			System.out.println("Inner catch block: " + e4.getMessage());
        			throw e4;
			}
			try
			{
				int[] arr = {1, 2, 3};
        			System.out.println(arr[3]);
			} 
			catch (ArrayIndexOutOfBoundsException e4) 
			{
       			System.out.println("Inner catch block: " + e4.getMessage());
        			throw e4;
			}
		} 
		catch (ArrayIndexOutOfBoundsException e4) 
		{
			System.out.println("Outer catch block: " + e4.getMessage());
		}
	}
}