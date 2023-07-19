//Introduction to Method
class Box
{
	double l,b,w;//data member of class
	double volume(double l, double b, double w)
	{
		double vol;
		vol=l*b*w;
		System.out.println("Volume is"+vol);
		return vol;
	}
}
class Main26
{
	public static void main(String args[])
	{
		Box b1=new Box();
		b1.volume(10,20,12.5);
	}
}
