
//print x^n (stack height =n)
public class power 
{
     public static int Calpow(int x,int n)
     {
          if(n==0)
          {
               return 1;
          }
          if(x==0)
          {
               return 0;
          }
          int xPower1=Calpow(x,n-1);
          int xPowern=x*xPower1;
          return xPowern;
     }
     public static void main(String agrs[])
     {
          int x=2,n=5;
          System.out.println(Calpow(x,n));
     }
}