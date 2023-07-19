//method overloading
//method name same, number of argument different,
//return type different
class Adddemo
{
	int add(int a,int b)
	{
		return a+b;
	}
	int add(int a,int b,int c)
	{
		return a+b+c;
	}
	double add(double a,double b)
	{
		return a+b;
	}
}
class Main32
{
	public static void main(String args[])
	{
	Adddemo a=new Adddemo();
	System.out.println("add is "+a.add(5,6));
	System.out.println("Three number add is "+a.add(5,6,7));
	System.out.println("Double value add is "+a.add(10.6,11.5));
	}
}
