/***declare two interface
1.achieve multiple inheritance
2.static method call by interface name:interfacename.methodname***/

interface Shape
{
	void draw();
	void show();
	static int cube(int x)
	{
		return x*x*x;
	}
}
interface Circle
{
	void area();
	void show();
}
class Rect implements Shape,Circle
{
	public void draw()
	{
		System.out.println("Rectangle");
	}
	public void area()
	{
		System.out.println("Area of Reac");
	}
	public void show()
	{
		System.out.println("show");
	}
}
class Main54
{
	public static void main(String args[])
	{
		Rect r=new Rect();
		r.draw();
		r.area();
		r.show();
		System.out.println("Cube is"+ Shape.cube(3));
	}
}
