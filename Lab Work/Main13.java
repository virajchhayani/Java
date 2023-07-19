import java.util.Scanner;
class Main13
	{
	    public static void main(String a[])
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter First Number");
	    int n1=sc.nextInt();
	    System.out.println("Enter Second Number");
	    int n2=sc.nextInt();
	    System.out.println("Enter Operatio Number :");
    	System.out.println(" 1. Addition"+"\n2.Subtraction"+"\n3.Multiplication"+"\n4.Division");
        int ch=sc.nextInt();
	    switch(ch)
		{
		    case 1: System.out.println("Adition :"+(n1+n2));
		    break;
	  		case 2: System.out.println("Subtraction:"+(n1-n2));
			break;
			case 3: System.out.println("Multiplication:"+(n1*n2));
			break;
			case 4: System.out.println("Division :"+(n1/n2));
			break;
			default: System.out.println("Enter valid choice :");
		}
    }
}
