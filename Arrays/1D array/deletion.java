

//delete an element form 1D array

import java.util.*;
public class deletion
{
    public static void main(String ags[])
    {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int a[]=new int[num];
        int b[]=new int[num-1];
        for(int i=0;i<num;i++)
        {
            a[i]=obj.nextInt();
        }
        System.out.println("Enter the index you want ot delete");
        int value=obj.nextInt();
        obj.close();
        for(int i=0;i<a.length;i++)
        {
            if(i<value)
            {
                b[i]=a[i];
            }
            else if(i==value)
            continue;
            else 
            {
                b[i-1]=a[i];
            }
        }
        System.out.println("REsult:");
        for(int i=0;i<num-1;i++)
        {
            System.out.println(b[i]);
        }
    }
}