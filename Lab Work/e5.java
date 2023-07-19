// multiple catch block

class e5
{
	public static void main(String[] args) 
    	{
		try
        	{
			int a=10,b=0;
			System.out.println(a/b);
			int c[]={1, 2, 4, 5};
			System.out.println(c[10]);
        	}
        	catch(ArithmeticException a1)
        	{
			System.out.println(a1);
        	}
        	catch(ArrayIndexOutOfBoundsException a2)
        	{
			System.out.println(a2);
        	}
        	finally
        	{
            	System.out.println("run success");
        	}
    	}
}
