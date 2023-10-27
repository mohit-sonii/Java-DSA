
//factorial of n number

public class factorial
{
     public static int Fact(int i)
     {
          if(i==1 || i==0)
          return 1;
          int fact_num1=Fact(i-1);
          int fact_n=i*fact_num1;
          return fact_n;
     }
     public static void main(String ags[])
     {
          int n=5;
          System.out.println(Fact(n));
     }
}