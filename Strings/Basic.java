

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

        // Java Strings are Immutable 
        String str="Knowledge";
        String s=str;
        str=str.concat("Base" );
        System.out.println(str);
        //if we do not give a reference varialbe then it will concat it, but beacuse of non refernece it
        //will be discarded.
        String st="java";
        st.concat("member");
        System.out.println(st);
    }
}