// NullPointerException

import java.lang.*;
import java.io.*;

class e3
{
	public static void main(String args[])
	{
		try
		{
			String s=null;
			System.out.println(s.length());
		}
		catch(NullPointerException n)
		{
			System.out.println(n);
		}
		finally
		{
			System.out.println("Every time Execute");
		}
	}
}