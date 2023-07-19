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
class Babydog extends Dog
{
	void weep()
	{
		System.out.println("babydog Weep");
	}
}
class Multilevel
{
	public sta	tic void main(String args[])
	{
		Babydog b=new Babydog();
		b.eat();
		b.bark();
		b.weep();
	}
}