class Rect
{
	int l,w;
	boolean isfilled;
	
	Rect()
	{
		l=10;
		w=20;
		isfilled= false;
	}
}
class Main29
{
	public static void main(String args[])
	{
		Rect r=new Rect();
		System.out.println("len is:"+r.l);
		System.out.println("len is:"+r.w);
		System.out.println("failled is"+r.isfilled);
	}
}
