class unsolved12
{
    public static void main(String args[])
    {
        int a,b,c,d,p,k;p=65;k=5;
        System.out.println("the pattern");
        for(a=1;a<=5;a++)
        {
            for(b=1;b<=a;b++)
            System.out.println(a+" ");
            for(c=k;c>=1;c--)
            {
                System.out.println((char)p+" ");
            }
        k-=1;
        p+=1;
        System.out.println();
        }
    }
}