


//reverse a string without useing reverse functions


import java.util.*;
public class reverse_without_function
{
    public static void main(String ag[])
    {
        Scanner obj=new Scanner(System.in);
        StringBuilder name=new StringBuilder("this is mohit");
        for(int i=0;i<name.length()/2;i++)
        {
            int front =i;
            int back=name.length()-i-1;
            char frontChar=name.charAt(front);
            char backChar=name.charAt(back);
            name.setCharAt(front,backChar);
            name.setCharAt(back,frontChar);
        }
        System.out.println(name);
    }
}