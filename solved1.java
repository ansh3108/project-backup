import java.util.*;

class solved1
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a,b,n;
        double s=0;
        System.out.println("enter n");
        n=in.nextInt();
        for(a=1;a<=n;a++)
        {
            int f=1;
            for(b=1;b<=a;b++)
            {
                f*=b;
            }
        s=s+(double)1/f;
        }
    System.out.println("sum of series="+s);
    }
}