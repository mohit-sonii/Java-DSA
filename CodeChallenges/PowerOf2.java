// write a program to find if a number  is a power of 2 or not.

import java.util.*;
public class PowerOf2
{
     public static boolean Pow(int num)
     {
          if(num==0)
          return false;
          while(num%2==0)
          {
               num=num/2;
          }
          return num==1;

     }
     public static void main(String args[])
     {
          Scanner obj=new Scanner(System.in);
          int n=obj.nextInt();
          obj.close();
          if(Pow(n))
          {
               System.out.println("It is a power of 2");
          }
          else
          System.out.println("It is not a power of 2");
     }
}
