
//inverted half pyramid
// *****
// ****
// ***
// **
// *


import java.util.Scanner;
public class inverted_half_pyramid
{
    public static void main(String arg[])
    {
        //inverted half pyramid
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        obj.close();
    }    
}
