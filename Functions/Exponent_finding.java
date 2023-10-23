


// two numbers are to be entered by the user x and n. write a funciton to find the value of one number raised to the power of another i.e. 
// x^n


import java.util.*;
public class Exponent_finding
{
    public static  double exponent_find(double a, double b)
    {
        return Math.pow(a,b);
    }
    public static void main(String ags[])
    {
        Scanner obj=new Scanner(System.in);
        double x=obj.nextInt();
        double n=obj.nextInt();
        System.out.println("Answer is: "+ exponent_find(x,n));
    }
}
