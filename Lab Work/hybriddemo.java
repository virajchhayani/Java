class A
{
	System.out.println("A class method");	
}
class B extends A
{
	void show()
	{
		System.out.println("B class method");
	}
}
class C extends A
{
	void show()
	{
		System.out.println("C class method");
	}
}
class D extends B,C
{
	void show()
	{
		System.out.println("D class method");
	}
}
class hybriddemo
{
	public static main(String s[])
	{
		D d=new D();
		d.display();
		d.showA();
		d.show();
	}
}