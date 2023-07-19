//class and object
class Box
{
	double l,b,w;//data member of class
}
class Main25
{
	public static void main(String args[])
	{
		Box b1=new Box();//Creating object of class Box
		Box b2=new Box();//Creating object of class Box
		double vol;//accessing data member of class
		b1.l=10;
		b1.b=20;
		b1.w=10;

		b2.l=10;//accessing data member of class
		b2.b=20;
		b2.w=10;
		vol=b1.l*b1.b*b1.w;
		System.out.println("Box volume is"+vol);

		vol=b2.l*b2.b*b2.w;
		System.out.println("Box volume is"+vol);
	
	}
}
