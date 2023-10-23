// hollow rectangle pattern
// *****
// *   *
// *   *
// *   *
// *****


import java.util.*;
public class hollow_rectangle_pattern
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int s=obj.nextInt();
        for(int i=1;i<=s;i++)
        {
            for(int j=1;j<=s;j++)
            {
                if(i==1 || i==s || j==s || j==1)
                {
                    System.out.print("*");
                }
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}