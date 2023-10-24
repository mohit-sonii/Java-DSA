

// take an array from the user. search for a given number X and print the index at which it occurs.

import java.util.*;
public class PrintingSpecificIndex
{
    public static void main(String ags[])
    {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int a[]=new int[num];
        for(int i=0;i<num;i++)
        {
            a[i]=obj.nextInt();
        }
        System.out.println("Enter the number you want to find index of: ");
        int value=obj.nextInt();
        obj.close();
        for(int i=0;i<num;i++)
        {
            if(a[i]==value)
            {
                System.out.println("Index of this value is: "+i);
            }
            
        }
    }
}