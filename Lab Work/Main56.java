//abstract class and interface

interface A
{
	void a();
	void b();
	void c();
	void d();
}
abstract class B
{
	abstract void e();
}
class C extends B implements A
{
	public void a()
	{
		System.out.println("a method");
	}
	public void b()
	{
		System.out.println("b method");
	}
	public void c()
	{
		System.out.println("c method");
	}
	public void d()
	{
		System.out.println("d method");
	}
	void e()
	{
		System.out.println("e method");
	}
}
class Main56
{
	public static void main(String args[])
	{
		C c1=new C();
		c1.a();
		c1.b();
		c1.c();
		c1.d();
		c1.e();
	}
}
