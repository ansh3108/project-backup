class solved7
{
    public static void main(String args[])
    {
        int a,b,p=0;
        System.out.println("Floyd's triangle");
        for(a=1;a<=5;a++)
        {
            for(b=1;b<=a;b++)
            {
                p+=1;
                System.out.println(p+" ");
            }
        System.out.println();
        }
    }
}