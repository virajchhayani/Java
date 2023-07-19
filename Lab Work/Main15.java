import java.util.Scanner;
class Main15
	{
		public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Marks for five subjects :");
		System.out.println("Subject 1 : ");
		int s1=sc.nextInt();
     System.out.println("Subject 2 : ");
     int s2=sc.nextInt();
     System.out.println("Subject 3 : ");
     int s3=sc.nextInt();
     System.out.println("Subject 4 : ");
     int s4=sc.nextInt();
     System.out.println("Subject 5 : ");
     int s5=sc.nextInt();
     int total=s1+s2+s3+s4+s5;
     System.out.println("Total : "+total);
     float per=(total*100)/500;
     System.out.println("Percentage : "+per+"%");
     if(per>90)
       {
         System.out.println("Grade : A1");
       }
     if(per<90 && per>80)
       {
         System.out.println("Grade : A2");
       }
     else if(per<80 && per>70)
       {
         System.out.println("Grade : B1");
       }
    else if(per<70 && per>60)
       {
         System.out.println("Grade : B2");
       }
    else if(per<60 && per>50)
       {
         System.out.println("Grade : C1");
       } 
    else if(per<50 && per>40)
       {
         System.out.println("Grade : c2");
       }
    else if(per<40)
       {
         System.out.println("Grade : Fail");
       }
    }
}
