//2.hirelevel inheritance
class Animal
{
	void eat()
	{
		System.out.println("Eating");
	}
}
class Dog extends Animal //subclass of animal
{
	void bark()
	{
		System.out.println("Barking");
	}
}
class Cat extends Animal //subclass of animal
{
	void meow()
	{
		System.out.println("Meow");
	}
}
class Main38
{
	public static void main(String args[])
	{
		Cat c=new Cat();
		c.eat();
		c.meow();
		Dog d=new Dog();
		d.bark();
		
	}
}
