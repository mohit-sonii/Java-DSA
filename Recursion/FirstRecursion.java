
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
     //for 1 to 5
     public static void Num(int n)
     {
          if(n==6)
          return;
          System.out.println(n);
          Num(n+1);
     }
     public static void main(String ags[])
     {
          int n=5;
          int i=1;
          PrintNum(n);
          Num(i);
     }
}