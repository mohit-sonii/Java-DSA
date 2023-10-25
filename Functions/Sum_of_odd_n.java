



// write a funciton to print the sum of all odd number form 1 to n


import java.util.*;
public class Sum_of_odd_n
{
    public static void sum(int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                sum=sum+i;
            }
            else
            continue;
           
        }
        System.out.println(sum);
    }
    public static void main(String ags[])
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        obj.close();
        sum(n);
    }
}