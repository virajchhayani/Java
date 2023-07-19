class Car
{
	final int speed=100;
	void display()
	{
		System.out.println("Car speed is "+speed);
	}
}
class finalvariable
{
	public static void main(String a[])
	{
		Car c=new Car();
		c.display();
	}
}