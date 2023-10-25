

// weirte a function to take radius as inout and return the circumferenece of circle.

import java.util.*;
public class Radius_to_circumference
{
    public static double radius(float r)
    {
        return 2*3.14*r;
    }
    public static void main(String ags[])
    {
        Scanner obj=new Scanner(System.in);
        float r=obj.nextInt();
        obj.close();
        System.out.println(radius(r));
    }
}