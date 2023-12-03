
//reverse a string using recursion



public class ReverseString
{
     public static void Reverse(String string,int index)
     {
          if(index<=0)
          {
               System.out.println(string.charAt(index));
               return;
          }
          System.out.println(string.charAt(index));
          Reverse(string,index-1);
     }
     public static void main(String gags[])
     {
          String string="abcd";
          int index=string.length()-1;
          Reverse(string,index);
          

     }
}