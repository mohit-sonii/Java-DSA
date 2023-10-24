
// check whether the array is in ascending order or not

import java.util.*;
public class SortedOrNot
{
    public static void main(String ags[])
    {
        System.out.println("Ener the total number of elements ");
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int a[]=new int[num];
        System.out.println("Enter array elements: ");
        for(int i=0;i<num;i++)
        {
            a[i]=obj.nextInt();
        }
        obj.close();
        boolean IsAscending=true;
        for(int i=0;i<num-1;i++)
        {
            if(a[i]<a[i+1])
            {
                IsAscending=true;
            }
        }
        if(IsAscending==true)
        System.out.println("Sorted-");
        else
        System.out.println("Not Sorted");
    }
}