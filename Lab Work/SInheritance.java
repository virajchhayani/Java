class car
{
	void speed()
	{
		System.out.println("Car Speed is 100");
	}
}
class BMW extends car
{
	void gear()
	{
		System.out.println("Automatic gear system");
	}
}
class SInheritance
{
	public static void main(String args[])
	{
		BMW b=new BMW();
		b.speed();
		b.gear();
	}
}