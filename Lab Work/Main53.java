//interface

interface Shape
{
	void draw();//abstract method
}
class Circle implements Shape
{
	public void draw()
	{
		System.out.println("Circle");
	}
}
class Main53
{
	public static void main(String args[])
	{
		Shape s=new Circle();
		s.draw();
	}
}
