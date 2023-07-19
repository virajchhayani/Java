class nesttry 
{
    public static void main(String[] args) 
    {
        try
        {
            try
            {
                int a=10,b=0;
                System.out.print(a/b);
            }
            //handle the exception
            catch(Exception a1)
            {
                System.out.println(a1);
            }
            try{
                int a[]={1,2,3,4};
                System.out.println(a[7]);
            }
            catch(ArrayIndexOutOfBoundsException a1)
            {
                System.out.println(a1);
            }
            try
            {
                 String S=null;
                System.out.println(S.length());
            }
            catch(NullPointerException v)
            {
                System.out.println(v);
            }
        }
        catch(Exception av)
        {
            System.out.println(av);
        }
        finally
        {
            System.out.println("run success");
        }
    }
}
