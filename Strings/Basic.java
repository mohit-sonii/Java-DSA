

import java.util.*;
public class Basic
{
    public static void main(String ags[])
    {
        Scanner obj=new Scanner(System.in);
        //String name=obj.next();  this will print only first name not full name
        String name=obj.nextLine();
        obj.close();
        System.out.println(name); 
    }
}