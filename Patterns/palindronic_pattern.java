

import java.util.Scanner;
public class palindronic_pattern
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        //outer looop
        for(int i=1;i<=n;i++)
        {
            //spacing loop
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            //1st part loop
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            //2nd part loop
            for(int j=2;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        obj.close();
    }    
}
