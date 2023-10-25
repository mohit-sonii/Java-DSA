
//print number s from 5 to 1

public class FirstRecursion
{
     public static void PrintNum(int n)
     {
          if(n==0) 
               return;
          System.out.println(n);
          PrintNum(n-1);
         
     }
     public static void main(String ags[])
     {
          int n=5;
          PrintNum(n);
     }
}