package Arrays.HackerRankSol; //ignore it
import java.util.*; 
public class ReversePrinting 
{
     public static void main(String ags[])
     {
          // int a[]={1,2,3};
          // for(int i=a.length-1;i>=0;i--)
          //      //started with (-1) beacuse  actual length of array is 3, and 3 is Outof index
          // {
          //      System.out.print(a[i]+" ");
          // }

          
          //userInput
          Scanner obj=new Scanner(System.in);
          int num=obj.nextInt();
          int b[]=new int[num];
          for(int i=0;i<num;i++)
          {
               b[i]=obj.nextInt();
          }
          for(int i=b.length-1;i>=0;i--)
          {
               System.out.print(b[i]+" ");
          }
          obj.close();
          

     }
}
