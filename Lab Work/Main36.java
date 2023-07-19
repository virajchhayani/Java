// Inheritance
// single level inheritance : super class,sub class
class car
{
  void speed()
   {
   	System.out.println("Car speed is 100");
   }

}

class BMW extends car
{
   void gear()
   {
  	System.out.println("Automatic gear system");
   }
}

class Main36
{
   public static void main(String args[])
   {
  	BMW b=new BMW();
  	b.speed();
  	b.gear();
   }
}
