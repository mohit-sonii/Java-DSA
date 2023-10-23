


// take an array of string input from the user and find the combined(cumulative) length of all those strings.

//Array of string = array of fixed number of string value.

import java.util.*;
public class Array_of_string
{
    public static void main(String ags[])
    {
        Scanner obj=new Scanner(System.in);
        int number=obj.nextInt();
        String combine=new String("");
        String array[]=new String [number];
        for(int i=0;i<number;i++)
        {
            array[i]=obj.next();
            combine+=array[i];
        }
        System.out.println(combine);
        System.out.println(combine.length());
    }
}