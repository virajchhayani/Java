// ArrayIndexOutOfBoundsException

import java.lang.*;
import java.io.*;

class e2
{
	public static void main(String args[])
	{
		try
		{
			int a[]={1, 2, 3, 4};
			System.out.println(a[7]);
		}
		catch(ArrayIndexOutOfBoundsException a1)
		{
			System.out.println(a1);
		}
		finally
		{
			System.out.println("Everytime this block Execute");
		}
	}
}