/***abstract class , abstract method & non abstract method***/

abstract class Shape
{
	abstract void draw();
	void area()
	{
		System.out.println("Area");
	}
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("Circle");
	}
}
class Triangle extends Shape
{
	void draw()
	{
		System.out.println("Triangle");
	}
}
class Main51
{
	public static void main(String args[])
	{
		Shape s=new Circle();
		s.draw();
		s.area();
		Triangle t=new Triangle();
		t.draw();
		t.area();
		s.draw();
	}
}
