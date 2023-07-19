class A
{
	void msg()
	{
		System.out.println("a class");
	}
}
class B
{
	void msg()
	{
		System.out.println("b class");
	}
}
class C extends A,B
{
	void msg()
	{
		System.out.println("Sub class c");
	}
}
class multipledemo
{
	public static void main(String args[])
	{
		C c1=new C()
		c.msg();
		c.display();
	}
}
