


import java.util.*;
public class pyramid_of_one
{
    public static void main(String ags[])
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                if(j==1|| j==i)
                System.out.print("1 ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}