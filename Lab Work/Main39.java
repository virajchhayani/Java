//method overriding or method override
//same name method, number of arguments same,return type same
class Bank
{
	int getRateofintrest()
	{
		return 0;
	}
}
class ICICI extends Bank
{
	int getRateofintrest()
	{
		return 8;
	}
}
class BOB extends Bank
{
	int grtRateofintrest()
	{
		return 9;
	}
}
class SBI extends Bank
{
	int getRateofintrest()
	{
		return 7;
	}
}
class Main39
{
	public static void main(String args[])
	{
		ICICI i=new ICICI();	
		BOB b=new BOB();
		SBI s=new SBI();
		System.out.println("ICICI bank"+i.getRateofintrest());
		System.out.println("BOB bank"+b.getRateofintrest());
		System.out.println("SBI bank"+s.getRateofintrest());
	}
}
