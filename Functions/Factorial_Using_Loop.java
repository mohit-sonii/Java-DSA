

import java.util.*;
public class Factorial_Using_Loop
{
    public static void newFunction(int n)
    {
        int factorial =1;
        for(int i=n;i>=1;i--)
        {
            factorial*=i;   
        }
        System.out.println("Factorial of "+n+ " is: "+factorial);
    }
    public static void main(String ags[])
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        newFunction(n);
        obj.close();
    }
}