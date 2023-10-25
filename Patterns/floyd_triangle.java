
import java.util.*;
public class floyd_triangle
{
    public static void main (String ad[])
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int s=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(s+" ");
                s++;
            }
            System.out.println();
        }
        obj.close();
    }

}
