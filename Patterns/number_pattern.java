
import java.util.*;
public class number_pattern
{
    public static void main(String ag[])
    {
        Scanner o=new Scanner(System.in);
        int n=o.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}