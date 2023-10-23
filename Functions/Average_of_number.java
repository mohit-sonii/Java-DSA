




// Enter 3 number from the user and make a function to print their average.

import java.util.*;
public class Average_of_number
{
  
    public static void Average(int a,int b,int c)
    {
        int average=(a+b+c)/2;
        System.out.println("AVerage of threee number is: "+average);
    }
    public static void main(String ags[])
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        int c=obj.nextInt();
        Average_of_number obj1=new Average_of_number();
        obj1.Average(a,b,c);
    }

}
