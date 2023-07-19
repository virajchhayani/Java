// Userdefine exception using throw keyword and construtor

class userthrow extends Exception
{
	String a1;
	userthrow(String a2)
	{
		a1=a2;
	}
	public String toString()
	{
		return("User created exception:"+a1);
	}
}

class throw1
{
	public static void main(String args[])
	{
		try
		{
			throw new userthrow("User exception");
		}
		catch(userthrow u)
		{
			System.out.println(u);
		}
	}
}