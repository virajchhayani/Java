//final method(error type)

class Shapef
{
	final void draw()
	{
		System.out.println("Shape class");
	}
}
class Main46 extends Shape
{
	void draw()
	{
		System.out.println("Circle class");
	}
	public static void main(String args[])
	{
		Main46 c=new Main46();
		c.draw();
	}
}
