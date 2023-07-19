//final class

final class Car
{
	void run()
	{
		System.out.println("Car is running");
	}
}
class BMW extends Car
{
	void speed()
	{
		System.out.println("BMW speed is 100");
	}
}
class Main47
{
	public static void main(String args[])
	{
		BMW b=new BMW();
		b.run();
		b.speed();
	}
}
