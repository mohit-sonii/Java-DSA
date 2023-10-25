

// to find the greatest common factor or highest common factor 
import java.util.*;
public class HCF
{
    // first way

    // public static int highestCommonFactor(int a,int b)
    // {
    //     if(b==0)
    //         return a;
    //     else
    //     return highestCommonFactor(b,a%b);
    // }
    // public static void main(String ags[])
    // {
    //     Scanner obj=new Scanner(System.in);
    //     int num1=obj.nextInt();
    //     int num2=obj.nextInt();
    //     System.out.println(highestCommonFactor(num1,num2));
    // }

    // 2nd way
    public static void main(String ags[])
    {
        Scanner obj=new Scanner(System.in);
        int n1=obj.nextInt();
        int n2=obj.nextInt();
        while(n1!=n2)
        {
            if(n1>=n2)
            {
                n1=n1-n2;
            }
            else
            {
                n2=n2-n1;
            }
        }
        obj.close();
        System.out.println(n2);
    }
}