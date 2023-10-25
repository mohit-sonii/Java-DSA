
// to calculate the sum of first n natural number
public class SumOfNumber
{
     public static void PrintSum(int initial,int end,int sum)
     {
          if(initial == end)
          {
               sum+=initial;
               System.out.println(sum);
               return;
          }
          sum+=initial;
          PrintSum(initial+1,end,sum);
     }
     public static void main(String ags[])
     {
          PrintSum(1,5,0);
     }
}