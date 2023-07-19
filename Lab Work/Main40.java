//  multiple inheritance  [This is not supporting because in this program , 2 super class is available]

class A   // super class
{
	void msg()
	{
    	System.out.println("a class");
	}
}

class B  // super class
{
	void msg()
	{
    	System.out.println("b class");
	}
}

class C extends A,B
{
	void display()
	{
    	System.out.println("Sub class c");
	}
}

class Main40
{
   public static void main(String args[])
   {
    	C c1=new C();
    	c.msg();
    	c.display();
   }
}
