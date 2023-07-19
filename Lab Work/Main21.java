//multidimensional
import java.util.*;
class Main21
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n,m;
    System.out.println("Enter size of row:");
    n=sc.nextInt();
    System.out.println("Enter size of column:");
    m=sc.nextInt();
    int a1[][]=new int[n][m];
    System.out.println("Enter array elements:");
    for(int p=0;p<n;p++)
    {
     for(int q=0;q<n;q++)
     {
      a1[p][q]=sc.nextInt();
     }
    }
    System.out.print("array elements are");
    for(int p=0;p<n;p++)
    {
     for(int q=0;q<m;q++)
     {
      System.out.print(a1[p][q]);
     }
      System.out.println(" ");
    }    
  }
}