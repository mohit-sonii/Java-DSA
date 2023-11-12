

// print x^n (stack height = log n)

public class powerLogn {

     public static int Power(int x,int n)
     {
          if(x==0)
          {
               return 0;
          }
          if(n==0)
          {
               return 1;
          }
          //if n is even
          if(n%2==0)
               return Power(x,n/2)*Power(x,n/2);
          else
               return Power(x,n/2)*Power(x,n/2)*x;
     }
     public static void main(String ags[])
     {
          int x=2, n=5;
          int ans=Power(x,n);
          System.out.println(ans);
     }
}