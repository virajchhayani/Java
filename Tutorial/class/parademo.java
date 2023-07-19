class Rect
{
	int l,w;
	boolean isfilled;
	
	Rect(int len, int wid, boolean isfilled1)
	{
		l=len;
		w=wid;
		isfilled=isfilled1;
	}
}
class parademo
{
	public static void main(String args[])
	{
		Rect r=new Rect(10,20,true);
		System.out.println("Rect len is : "+r.l);
	}
}
