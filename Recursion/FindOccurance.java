
//find the first and last occurance of letter 'a' in a string
// "abaacdaefaah"

public class FindOccurance {
     
     public static int first=-1;
     public static int last=-1;
     public static  void Occur(String string, int index,char element )
     {
          if(index==string.length()-1)
          {
               System.out.println(first);
              System.out.println(last);
              return;
          }
          char current=string.charAt(index);
          if (current==element) 
          {    
               if(first==-1)
               {
                    first=index;
               }
               else
               last=index;
          }
          Occur(string,index+1,element);
     }
     public static void main(String ags[])
     {
          Occur("abaacdaefaah",0,'a');
     }
}
