//final class

final class Car
{
	void run()
	{
		System.out.println("Car is running");
	}
}
class BMW 
{
	void speed()
	{
		System.out.println("BMW speed is 100");
	}
}
class Main48
{
	public static void main(String args[])
	{
		BMW b=new BMW();
		b.speed();
		Car c=new Car();
		c.run();
	}
}
