// * * * * * 
//  * * * *
//   * * *
//    * *
//     *

import java.util.*;
public class inverted_pyramid
{
    public static void main(String ags[])
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        obj.close();
    }
}