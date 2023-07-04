class solved9
{
    public static void main(String args[])
    {
        int i,j,k,p=1;
        System.out.println("the pattern");
        for(i=5;i>=1;i--)
        {
            for(k=1;k<=p;k++)
            {
                System.out.println(" ");
            }
            for(j=i;j>=i;j--)
            {
                System.out.println(j);
            }
        System.out.println();
        p+=1;
        }
    }
}