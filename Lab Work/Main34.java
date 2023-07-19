//method overloading
//method name same, number of argument different,
//return type different
class Adddemo
{
	 static int add(int a,int b)
	{
		return a+b;
	}
	static int add(int a,int b,int c)
	{
		return a+b+c;
	}
	static double add(double a,double b)
	{
		return a+b;
	}
	
}
class Main34
{
	public static void main(String args[])
	{
	Adddemo a=new Adddemo();
	System.out.println("add is "+Adddemo.add(5,6));
	System.out.println("Three number add is "+Adddemo.add(5,6,7));
	System.out.println("Double value add is "+Adddemo.add(10.6,11.5));
	}
}
