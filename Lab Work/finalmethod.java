 class Bank
{
	final int getRateofintrest()
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
	int getRateofintrest()
	{
		return 9;
	}
}
class SBI extends Bank
{
	int getRateofintrest()
	{
		return 10;
	}
}
class finalmethod
{
	public static void main(String args[])
	{
		Bank i=new ICICI();

		Bank b=new BOB();

		Bank s=new SBI();

		System.out.println("ICICI Rate of Interest: "+i.getRateofintrest());  

		System.out.println("BOB Rate of Interest: "+b.getRateofintrest());  
	
		System.out.println("SBI Rate of Interest: "+s.getRateofintrest());
	}
}
