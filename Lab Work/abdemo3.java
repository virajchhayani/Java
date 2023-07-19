abstract class Car
{
	abstract void speed();
}
abstract class Animal
{
	abstract void eat();
}
class BMW extends Car
{
	void speed()
	{
		System.out.println("speed is 80");
	}
}
class Dog extends Animal
{
	void eat()
	{
		System.out.println("Dog is eating");
	}
}
class abdemo3
{
	public static void main(String a[])
	{
		BMW s=new BMW();
		s.speed();
		Dog v=new Dog();
		v.eat();
	}
} 
