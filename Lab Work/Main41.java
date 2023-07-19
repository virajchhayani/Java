//  hybrid inheritance  [This is not supporting]

class A   // super class
{
	void showA()
	{
    	System.out.println("A class method");
	}
}

class B extends A // sub clss
{
	void show()
	{
    	System.out.println("B class method");
	}
}

class C extends A  // sub class
{
	void show()
	{
    	System.out.println("C class method");
	}
}

class D extends B,C  // child class
{
	void display()
	{
    	System.out.println("D class method");
	}
}

class Main41
{
	public static void main(String args[])
	{
     	D dd=new D();
     	d.display();
     	d.showA();
     	d.show();
	}
}
