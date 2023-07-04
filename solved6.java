import java.util.*;

class solved6
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,n1,i,r,sum=0,c=0;
        System.out.println("enter a 10 digit code");
        n=in.nextInt();
        n1=n;
        while(n1>0)
        {
            n1/=10;
            c++;
        }
        if(c<10 || c>10)
        {
            System.out.println("Illegal ISBN");
        }
        else
        {
            for(i=10;i>=1;i--)
            {
                r=n%10;
                sum=sum+r*i;
                n/=10;
            }
            if(sum%11==0)
            {
                System.out.println("valid ISBN code");
            }
            else
            {
                System.out.println("not a valid ISBN code");
            }
        }
    }
}