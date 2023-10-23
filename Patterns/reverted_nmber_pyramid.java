
import java.util.*;
public class reverted_nmber_pyramid
{
    public static void main(String ags[])
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int s=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=s;j++)
            {
                System.out.print(" ");
                
            }
            for(int j=n;j>=i;j--)
            {
                System.out.print(i+" ");
            }
            System.out.println();
            s++;
        }
    }
}