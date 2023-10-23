

//make a fnciton to add 2 nmbers and return the sum.


import java.util.*;
public class Calculatesum{
    public static int calculateSum(int a,int b)
    {
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        int sum=calculateSum(a,b);
        System.out.println(sum);
    }
}
