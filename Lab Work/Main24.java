//class and object
class Box
{
	double l,b,w;//data member of class
}
class Main24
{
	public static void main(String args[])
	{
		Box b1=new Box();//Creating object of class Box
		double vol;
		b1.l=10;
		b1.b=20;
		b1.w=10;
		vol=b1.l*b1.b*b1.w;
		System.out.println("Box volume is"+vol);
	}
}
