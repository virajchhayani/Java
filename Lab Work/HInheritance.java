class Animal
{
	void eat()
	{
		System.out.println("Eating");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Barking");
	}
}
class Cat extends Animal
{
	void meow()
	{
		System.out.println("Meow");
	}
}
class HInheritance
{
	public static void main(String args[])
	{

		Cat c=new Cat();
		c.eat();
		c.meow();
		Dog b=new Dog();
		b.bark();
	}
}