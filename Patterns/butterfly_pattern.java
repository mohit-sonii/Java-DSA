

import java.util.Scanner;
public class butterfly_pattern{
    public static void main(String ags[]){
        Scanner obj=new Scanner (System.in);
        int n=obj.nextInt();
        //outer loop
        for(int i=1;i<=n;i++)
        {
            //1st part first portion
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            //spacing loop
            for(int j=1;j<=(n-i)*2;j++)
            {
                System.out.print(" ");
            }
            //1st part second portion
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //outer loop for reverse of this loop
        for(int i=n;i>=1;i--)
        {
            //1st part first portion
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            //spacing loop
            for(int j=1;j<=(n-i)*2;j++)
            {
                System.out.print(" ");
            }
            //2nd part second loop
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        obj.close();
    }
    
}
