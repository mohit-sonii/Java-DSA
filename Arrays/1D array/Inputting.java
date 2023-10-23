

//inputting in 1D array
import java.util.*;
public class Inputting
{
    public static void main(String ags[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Ener the total number of elements: ");
        int num=obj.nextInt();
        int array[]=new int[num];
        //inputting
        for(int i=0;i<num;i++)
        {
            array[i]=obj.nextInt();
        }
        //output
        System.out.println("Output values are: ");
        for(int i=0;i<num;i++)
        {
            System.out.println(array[i]);
        }

    }
}
