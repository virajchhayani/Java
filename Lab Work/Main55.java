//inheritance in interface

interface Draw
{
	void line();
	void area();
}
interface Circle extends Draw
{
	void shape();
}
class idemo implements Circle
{
	public void line()
	{
		System.out.println("Draw line");
	}
	public void area()
	{
		System.out.println("Area of circle");
	}
	public void shape()
	{
		System.out.println("Shape of circle");
	}
}
class Main55
{
	public static void main(String args[])
	{
		idemo i=new idemo();
		i.line();
		i.area();
		i.shape();
	}
}
