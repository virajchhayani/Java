//Recursion function:function call if self
//Function
//jreturn type function_name(number of arguments)

class Main23
{
	static int factorial(int n)
	{
		if(n==1)
		{
			return 1;
		}
		else
		{
			return (n*factorial(n-1));
		}
	}
	public static void main(String args[])
	{
		System.out.println("Factorial of 5 is"+factorial(5));
	}
}	
