//Introduction to Method
class Main27
{
	double l,b,w;//data member of class
	double volume(double l, double b, double w)
	{
		double vol;
		vol=l*b*w;
		System.out.println("Volume is: "+vol);
		return vol;
	}
	public static void main(String args[])
	{
		Main27 b1=new Main27();
		b1.volume(10,20,12.5);
	}
}
