public class ReversedWithCharArray {
     
     public static String ReverseString(String str)
     {
          char a[]=str.toCharArray();
          String reverse="";
          for(int i=a.length-1;i>=0;i--)
          {
               reverse+=a[i];
          }
          return reverse;
     }
     
     public static void main(String ags[])
     {
          String str="java";
          System.out.println(ReverseString(str));
     }
}

     

