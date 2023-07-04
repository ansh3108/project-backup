import java.util.*;

class solved4
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a,b,c,n,k=1;
        System.out.println("enter the first number");
        n=in.nextInt();
        System.out.println("twenty prime numbers from "+n);
        do
        {
            c=0;
            for(a=1;a<=n;a++)
            {
                if(n%a==0)
                {
                    c+=1;
                }
                if(c==2)
                {
                    System.out.println(n+" ");
                    k+=1;
                }
                n+=1;
            }
        }while(k<=20);
    }
}