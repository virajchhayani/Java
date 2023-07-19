//final keyword
//final variable:can't change value

class Car 
{
	final int speed=100;
	void display()
	{
		speed=80;
		System.out.println("Car speed is"+speed);
	}
}
class Main44
{
	public static void main(String a[])
	{
		Car c=new Car();
		c.display();
	}
}
