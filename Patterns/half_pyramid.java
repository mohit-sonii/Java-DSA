
// half pyramid pattern
// * 
// * *
// * * *
// * * * *
// * * * * *

import java.util.*;
public class half_pyramid
{
    public static void main(String agrg[])
    {
        Scanner obj=new Scanner(System.in);
        int j=obj.nextInt();
        for(int i=1;i<=j;i++)
        {
            for(int s=1;s<=i;s++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        obj.close();
    }
}