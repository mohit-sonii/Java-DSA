


//Write a functino whihc takes in 2 numbers adn returns te greater of those two.

import java.util.*;
public class Finding_greater_one
{
    public static int greater(int a,int b)
    {
        if(a>b)
        return a;
        else
        return b;
    }
    public static void main(String ags[])
    {
        Scanner obj=new Scanner (System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        obj.close();
        System.out.println("Greater is: "+greater(a,b));
    }
}