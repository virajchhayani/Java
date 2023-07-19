import java.util.*;
class arraydemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter array size");
		n=sc.nextInt();
		int arr[]=new int[n];
		for(int j=0;j<n;j++)
		{
			arr[j]=sc.nextInt();
		}
		System.out.println("Array elements are");
		for(int j=0;j<n;j++)
		{
			System.out.println("array element are:["+j+"]"+arr[j]);
		}
		int a[]={1,2,3,4,5};//initialize array with value
		for(int i=0;i<a.length;i++)
		{
			System.out.println("array elements are a"+"["+i+"]"+a[i]);
		}
	}
}
