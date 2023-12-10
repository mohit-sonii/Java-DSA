
//remove all the duplicates in a string

public class RemoveDuplicate {

     public static boolean []map=new boolean[26];
     public static void remove(String str, int index, String newstr)
     {
          if(index==str.length())
          {
               System.out.println(newstr);
               return;
          }
          char current=str.charAt(index);
          if(map[current-'a']==true)
          {
               remove(str,index+1,newstr);
          }
          else
          {
               newstr+=current;
               map[current-'a']=true;
               remove(str,index+1,newstr);
          }
     }
     public static void main(String[] args) {
          remove("abbccda",0,"");
     }
     
}
