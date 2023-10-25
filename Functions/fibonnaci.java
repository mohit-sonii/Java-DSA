
//print fibonnaci series

import java.util.*;
public class fibonnaci
{
    public static void main(String aag[])
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int a=0, b=1, c=0;
        System.out.println(a);
        System.out.println(b);
        for(int i=1;i<=n;i++)
        {
            c=a+b;
            a=b;
            b=c;
            obj.close();
            System.out.println(c);
        }
    }
}
