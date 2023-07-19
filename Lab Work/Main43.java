//final keyword
//final variable

class Car 
{
	final int speed=100;
	void display()
	{
		System.out.println("Car speed is"+speed);
	}
}
class Main43
{
	public static void main(String a[])
	{
		Car c=new Car();
		c.display();
	}
}
