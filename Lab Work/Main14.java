//switch-case

import java.util.Scanner;
class Main14
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter value of a:");
  float a=sc.nextFloat();
  System.out.println("Enter value of b:");
  float b=sc.nextFloat();
  System.out.println("Enter your choice +,-,*,/:");
  char ch=sc.next().charAt(0);

  switch(ch)
   {
	case '+':System.out.println("Sum="+(a+b));
	break;
	case '-':System.out.println("Subtraction="+(a-b));
	break;
	case '*':System.out.println("Multiplication="+(a*b));
	break;
	case '/':System.out.println("Division="+(a/b));
	break;
	default:System.out.println("Enter invaild choice");
   }
 }
}
