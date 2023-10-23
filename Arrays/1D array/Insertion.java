


//Insertion at any index in 1D array

import java.util.*;
public class Insertion
{
    public static void main(String ags[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int num=obj.nextInt();
        int a[]=new int[num];
        System.out.println("Enter the elements: ");
        //inputting array
        for(int i=0;i<num;i++)
        {
            a[i]=obj.nextInt();
        }
        System.out.print("Enter the index you want to insert on: ");
        int ins=obj.nextInt();
        System.out.print("Enter the value you want ot insert : ");
        int value=obj.nextInt();
        int b[]=new int[num+1];
        //insertion
        for(int i=0;i<num+1;i++)
        {
            if(i<ins)
            {
                b[i]=a[i];
            }
            else if(i==ins)
            {
                b[i]=value;
            }
            else
            {
                b[i]=a[i-1];
            }
        }
        System.out.println("values are: ");
        //output
        for(int i=0;i<num+1;i++)
        {
            System.out.println(b[i]);
        }
    }
}