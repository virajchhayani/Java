//Introduction to Method
class Boxdemo4
{
	double l,b,w;//data member of class
	double volume(double l, double b, double w)
	{
		double vol;
		vol=l*b*w;
		System.out.println("Volume is: "+vol);
		return vol;
	}
}
class Main28
{
	public static void main(String args[])
	{
		Boxdemo4 b1=new Boxdemo4();
		b1.volume(10,20,20.5);
	}
}
