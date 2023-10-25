
import java.util.*;
public class zero_one_pattern
{
    public static void main(String ags[])
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        obj.close();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((i+j)%2==0)
                System.out.print("1");
                else
                System.out.print("0");
            }
            System.out.println();
        }
    }   
}
