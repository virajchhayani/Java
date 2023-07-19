//switch-case
import java.util.Scanner;
class Main12
{
    	public static void main(String args[])
    	{
    	    Scanner sc=new Scanner(System.in);
    	    System.out.println("Enter your choice 0,1,2,3");
    	    int ch=sc.nextInt();
    	    switch(ch)
           	{
           	case 0:
           	   System.out.println("you enter zero choice");
           	   break;
           	case 1:
           	System.out.println("you enter 1st choice");
           	break;
 	        case 2:
           	System.out.println("you enter 2nd choice");
           	break;
 	case 3:
           	System.out.println("you enter 3rd choice");
           	break;
           	default:
           	System.out.println("your choice is not match");
           	}//swich case end
           	}//psvm end
}//class end
