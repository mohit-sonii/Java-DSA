
// Find the maximum and minimum number in an array of int.
import java.util.*;
public class FindingMaxMin
{
    public static void main(String arg[])
    {
        System.out.print("Enter the nnumbe rof elemens: ");
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int a[]=new int[num];

        for(int i=0;i<num;i++)
        {
            a[i]=obj.nextInt();
        }
        obj.close();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<num;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}