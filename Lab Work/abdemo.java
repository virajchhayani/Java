abstract class Demo
{
	abstract void display();
}
class A extends Demo
{
	void display()
	{
		System.out.println("Method of A class");
	}
}
class B extends Demo 
{
	void display()
	{
		System.out.println("Method of B class");
	}
}
class abdemo
{
	public static void main(String args[])
	{
		Demo d=new A();
		d.display();
		d=new B();
		d.display();
	}
}
